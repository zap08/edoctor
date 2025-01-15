import React, { useState } from 'react';
import './Contact.css';
import Chatbot from './Chatbot'; // Import Chatbot component

function Contact() {
  const [formData, setFormData] = useState({
    name: '',
    email: '',
    phone: '',
    message: '',
  });

  const [errors, setErrors] = useState({});

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({ ...formData, [name]: value });
  };

  const validateForm = () => {
    const errors = {};

    if (!formData.name.trim()) {
      errors.name = 'Name is required.';
    }

    if (!formData.email.trim()) {
      errors.email = 'Email is required.';
    } else if (!/^[\w-.]+@[\w-]+\.[a-z]{2,}$/i.test(formData.email)) {
      errors.email = 'Enter a valid email address.';
    }

    if (formData.phone && !/^\+?[0-9]{10,15}$/.test(formData.phone)) {
      errors.phone = 'Enter a valid phone number.';
    }

    if (!formData.message.trim()) {
      errors.message = 'Message is required.';
    }

    setErrors(errors);
    return Object.keys(errors).length === 0;
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    if (!validateForm()) {
      return;
    }

    alert('Thank you for reaching out! We will get back to you soon.');
    setFormData({ name: '', email: '', phone: '', message: '' });
  };

  return (
    <div className="contact-container">
      <div className="contact-content">
        <h1>Contact Us</h1>
        <p>We are here to assist you with any inquiries or support. Reach out to us anytime!</p>
        <p>You can also contact us directly via email at <strong>support@edoctor.com</strong></p>

        {/* Include the Chatbot */}
        {/* <Chatbot /> */}

        <form className="contact-form" onSubmit={handleSubmit}>
          <label htmlFor="name">Name</label>
          <input
            type="text"
            id="name"
            name="name"
            value={formData.name}
            onChange={handleChange}
            placeholder="Your Full Name"
          />
          {errors.name && <p className="error-message">{errors.name}</p>}

          <label htmlFor="email">Email</label>
          <input
            type="email"
            id="email"
            name="email"
            value={formData.email}
            onChange={handleChange}
            placeholder="Your Email Address"
          />
          {errors.email && <p className="error-message">{errors.email}</p>}

          <label htmlFor="phone">Phone (Optional)</label>
          <input
            type="tel"
            id="phone"
            name="phone"
            value={formData.phone}
            onChange={handleChange}
            placeholder="Your Phone Number"
          />
          {errors.phone && <p className="error-message">{errors.phone}</p>}

          <label htmlFor="message">Message</label>
          <textarea
            id="message"
            name="message"
            value={formData.message}
            onChange={handleChange}
            placeholder="Write your message here"
          ></textarea>
          {errors.message && <p className="error-message">{errors.message}</p>}

          <button type="submit">Send Message</button>
        </form>
      </div>
    </div>
  );
}

export default Contact;
