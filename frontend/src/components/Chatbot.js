import React, { useState, useRef, useEffect } from 'react';
import './Chatbot.css';
import Spline from '@splinetool/react-spline';
import { useNavigate } from 'react-router-dom';
import './Roboto.css';

function Chatbot() {
  const [messages, setMessages] = useState([
    { sender: 'bot', text: 'Hi! How can I assist you today? Please select an option below.' },
  ]);
  const [selectedOption, setSelectedOption] = useState(null);
  const chatbotBodyRef = useRef(null);
  const navigate = useNavigate(); // Hook to navigate to other pages
  
  const questionsAndAnswers = {
    login: [
      { question: 'How do I log in?', answer: 'Use your registered email and password to log in on the login page.' },
      { question: 'What if I forget my password?', answer: 'Click on the "Forgot Password" link on the login page and follow the instructions.' },
      { question: 'Can I stay logged in?', answer: 'Yes, you can enable the "Remember Me" option during login to stay logged in on the device.' },
      { question: 'What do I do if my login is not working?', answer: 'Make sure your credentials are correct or reset your password if necessary.' },
      { question: 'How can I log out?', answer: 'You can log out by clicking the "Logout" button in your account settings.' },
      { question: 'Can I use social media to log in?', answer: 'Yes, we offer options to log in using Facebook, Google, and other social media accounts.' },
      { question: 'Why am I being redirected to the login page?', answer: 'You may have been logged out due to inactivity or a session timeout.' },
      { question: 'Can I log in with a mobile number?', answer: 'Currently, login is supported via email and password only.' },
    ],
    register: [
      { question: 'How do I register?', answer: 'To register, visit the registration page and fill in your details.' },
      { question: 'What do I need to register?', answer: 'You will need your name, email, phone number, and password to complete registration.' },
      { question: 'Can I register without an email?', answer: 'An email address is required for registration to receive confirmation and notifications.' },
      { question: 'What should I do if I have issues registering?', answer: 'Please check if your details are correct or contact support for assistance.' },
      { question: 'Can I register using my social media account?', answer: 'Yes, you can register using Facebook, Google, or other social media accounts.' },
      { question: 'Is registration free?', answer: 'Yes, registration is completely free.' },
      { question: 'Do I need a referral to register?', answer: 'No, referrals are not required for registration.' },
      { question: 'How do I update my registration details?', answer: 'You can update your details through your profile page after logging in.' },
    ],
    appointment: [
      { question: 'How do I book an appointment?', answer: 'Log in to your account, select a doctor, and book an available slot.' },
      { question: 'Can I change my appointment?', answer: 'Yes, you can reschedule your appointment by logging into your account.' },
      { question: 'Can I cancel my appointment?', answer: 'Yes, you can cancel your appointment from the appointments section.' },
      { question: 'What if I miss my appointment?', answer: 'Please reschedule as soon as possible to avoid any inconvenience.' },
      { question: 'How can I choose a doctor?', answer: 'Browse through the list of doctors by specialty and select the one that suits your needs.' },
      { question: 'Can I book multiple appointments?', answer: 'Yes, you can book multiple appointments with different doctors.' },
      { question: 'What should I do if the doctor is unavailable?', answer: 'You can select an alternative time slot or book with another doctor.' },
      { question: 'Do I need to pay for the appointment upfront?', answer: 'Payment may be required during the booking process, depending on the doctor or service.' },
    ],
    password: [
      { question: 'How do I reset my password?', answer: 'Click on the "Forgot Password" link on the login page and follow the instructions.' },
      { question: 'What should I do if I still can’t reset my password?', answer: 'Contact customer support for further assistance.' },
      { question: 'How long will it take to reset my password?', answer: 'You should receive a password reset email within a few minutes.' },
      { question: 'Can I reset my password without an email?', answer: 'Password reset requires access to the email account used during registration.' },
      { question: 'Can I change my password from the account settings?', answer: 'Yes, you can change your password anytime from the settings page after logging in.' },
      { question: 'What if I don’t receive the reset email?', answer: 'Check your spam folder or ensure you entered the correct email address.' },
      { question: 'Can I use the same password after resetting it?', answer: 'Yes, you can choose to set the same password after resetting.' },
      { question: 'Can I reset my password using my phone number?', answer: 'Currently, password reset is only available via email.' },
    ],
  };


  useEffect(() => {
    // Automatically scroll to the bottom of the chat when messages are updated
    if (chatbotBodyRef.current) {
      chatbotBodyRef.current.scrollTop = chatbotBodyRef.current.scrollHeight;
    }
  }, [messages]);

  const handleQuestionClick = (qa) => {
    setMessages((prev) => [
      ...prev,
      { sender: 'user', text: qa.question },
      { sender: 'bot', text: qa.answer },
    ]);
  };

  const handleOptionSelect = (option) => {
    setSelectedOption(option);
    setMessages((prev) => [
      ...prev,
      { sender: 'user', text: `I want to know about ${option}.` },
      { sender: 'bot', text: `Here are some questions about ${option}:` },
    ]);
  };

  const handleBack = () => {
    setSelectedOption(null);
    setMessages((prev) => [
      ...prev,
      { sender: 'bot', text: 'Please select an option below.' },
    ]);
  };

  const Home = () => {
    navigate(-1); // Navigate to the previous page
  };

  return (
    <>
      {/* Chatbot Container */}
      <div className="chatbot-container">
        <div className="chatbot-header">
          Chat with Us
          <button onClick={Home}>X</button>
        </div>

        <div className="chatbot-body" ref={chatbotBodyRef}>
          {messages.map((msg, i) => (
            <div key={i} className={`chatbot-message ${msg.sender === 'bot' ? 'bot-message' : 'user-message'}`}>
              {msg.text}
            </div>
          ))}
        </div>

        <div className="chatbot-footer">
          {selectedOption && (
            <button className="back-btn" onClick={handleBack}>Back</button>
          )}

          {!selectedOption && (
            <div className="options">
              <button className="chatbot-option-btn" onClick={() => handleOptionSelect('login')}>Login</button>
              <button className="chatbot-option-btn" onClick={() => handleOptionSelect('register')}>Register</button>
              <button className="chatbot-option-btn" onClick={() => handleOptionSelect('appointment')}>Book Appointment</button>
              <button className="chatbot-option-btn" onClick={() => handleOptionSelect('password')}>Password Reset</button>
            </div>
          )}

          {selectedOption && questionsAndAnswers[selectedOption].map((qa, i) => (
            <button
              key={i}
              className="chatbot-question-btn"
              onClick={() => handleQuestionClick(qa)}
            >
              {qa.question}
            </button>
          ))}

          <div className="robot-container">
            <Spline scene="https://prod.spline.design/IIk4KMVYUwVHorO8/scene.splinecode" />
          </div>
        </div>
      </div>
    </>
  );
}

export default Chatbot;
