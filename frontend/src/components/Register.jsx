// src/components/Register.jsx
import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import axios from 'axios';
import './Register.css';

function Register() {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [confirmPassword, setConfirmPassword] = useState('');
  const [userType, setUserType] = useState(''); // Options: 'Patient' or 'Doctor'
  const [message, setMessage] = useState('');
  const [isLoading, setIsLoading] = useState(false);
  const [errors, setErrors] = useState({});
  const navigate = useNavigate();

  const validateForm = () => {
    const newErrors = {};

    if (!name.trim()) {
      newErrors.name = 'Username is required.';
    }

    if (!email.trim()) {
      newErrors.email = 'Email is required.';
    } else if (!/^[\w-.]+@[\w-]+\.[a-z]{2,4}$/i.test(email)) {
      newErrors.email = 'Invalid email format.';
    }

    if (!password.trim()) {
      newErrors.password = 'Password is required.';
    } else if (password.length < 6) {
      newErrors.password = 'Password must be at least 6 characters.';
    }

    if (password !== confirmPassword) {
      newErrors.confirmPassword = 'Passwords do not match.';
    }

    if (!userType) {
      newErrors.userType = 'Please select a role.';
    }

    setErrors(newErrors);
    return Object.keys(newErrors).length === 0;
  };

  const handleRegister = async (e) => {
    e.preventDefault();

    if (!validateForm()) return;

    const newUser = { name, email, password, userType };

    try {
      setIsLoading(true); // Start loading
      const response = await axios.post('http://localhost:8000/addUser', newUser);
      setMessage('Registration successful! Redirecting to login...');
      console.log("API response:", response.data);

      setTimeout(() => navigate('/login'), 2000); // Redirect to login after 2 seconds
    } catch (error) {
      if (error.response && error.response.data) {
        setMessage(error.response.data.message); // Backend error message
      } else {
        setMessage('An error occurred during registration.');
      }
      console.error('Error during registration:', error);
    } finally {
      setIsLoading(false); // Stop loading
    }
  };

  return (
    <div className="register-container">
      <form className="register-form" onSubmit={handleRegister}>
        <h2>Register</h2>
        {message && <p className="message">{message}</p>}
        <label htmlFor="name">Username</label>
        <input 
         style={{width:"370px"}}
          type="text"
          id="name"
          value={name}
          onChange={(e) => setName(e.target.value)}
       
        />
        {errors.name && <p className="error-text">{errors.name}</p>}

        <label htmlFor="email">Email</label>
        <input
          type="email"
          id="email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
        
        />
        {errors.email && <p className="error-text">{errors.email}</p>}

        <label htmlFor="password">Password</label>
        <input
          type="password"
          id="password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
         
        />
        {errors.password && <p className="error-text">{errors.password}</p>}

        <label htmlFor="confirmPassword">Confirm Password</label>
        <input
          type="password"
          id="confirmPassword"
          value={confirmPassword}
          onChange={(e) => setConfirmPassword(e.target.value)}
        
        />
        {errors.confirmPassword && <p className="error-text">{errors.confirmPassword}</p>}

        <label htmlFor="userType">Role</label>
        <select
          id="userType"
          value={userType}
          onChange={(e) => setUserType(e.target.value)}
        >
          <option value="">Select Role</option>
          <option value="Patient">Patient</option>
          <option value="Doctor">Doctor</option>
        </select>
        {errors.userType && <p className="error-text">{errors.userType}</p>}

        <button type="submit" disabled={isLoading}>
          {isLoading ? 'Registering...' : 'Register'}
        </button>
        <p>
          Already have an account? <a href="/login">Login here</a>
        </p>
      </form>
    </div>
  );
}

export default Register;
