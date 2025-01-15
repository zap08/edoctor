import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import axios from 'axios';
import './Login.css';
import { style } from '@mui/system';

function Login() {
  const [userId, setUserId] = useState('');
  const [password, setPassword] = useState('');
  const [userType, setUserType] = useState('');
  const [errors, setErrors] = useState({});
  const navigate = useNavigate();

  const validateForm = () => {
    const newErrors = {};

    if (!userId.trim()) {
      newErrors.userId = 'Email is required.';
    } else if (!/^[\w-.]+@[\w-]+\.[a-z]{2,4}$/i.test(userId)) {
      newErrors.userId = 'Invalid email format.';
    }

    if (!password.trim()) {
      newErrors.password = 'Password is required.';
    } else if (password.length < 2) {
      newErrors.password = 'Password must be at least 6 characters.';
    }

    if (!userType) {
      newErrors.userType = 'Please select a role.';
    }

    setErrors(newErrors);
    return Object.keys(newErrors).length === 0;
  };

  const handleForgotPassword = () => {
    navigate('/forgotPassword');
  };

  const handleLogin = async (e) => {
    e.preventDefault();

    if (!validateForm()) return;

    const loginData = { userId, password, userType };
    console.log('Login data:', loginData);

    try {
      const response = await axios.post('http://localhost:8000/loginUser', loginData);

      if (response.data === true && userType === "Doctor") {
        console.log('Server response:', response.data);
        localStorage.setItem("userId", userId);
        navigate('/Doctordashboard');
      } else if (response.data === true && userType === "Patient") {
        console.log('Server response:', response.data);
        localStorage.setItem("userId", userId);
        navigate('/Patientdashboard');
      } else {
        alert('Login unsuccessful. Please check your credentials.');
      }
    } catch (error) {
      if (error.response && error.response.data) {
        alert(`Login failed: ${error.response.data.message}`);
      } else {
        alert('An error occurred during login. Please try again later.');
      }
      console.error('Login error:', error);
    }
  };

  return (
    <div className="login-container">
      <form className="login-form" onSubmit={handleLogin}>
        <h2>Login</h2>
        <label htmlFor="userId">Email</label>
        <input
          type="email"
          id="userId"
          name="userId"
          value={userId}
          onChange={(e) => setUserId(e.target.value)}
        />
        {errors.userId && <p className="error-text">{errors.userId}</p>}

        <label htmlFor="password">Password</label>
        <input
          type="password"
          id="password"
          name="password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />
        {errors.password && <p className="error-text">{errors.password}</p>}

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

        <button type="submit">Login</button>
        <p>New user? <a href="/register">Register here</a></p>
        <button type="button" onClick={handleForgotPassword} className="forgot-password-button">
          Forgot Password?
        </button>
      </form>
    </div>
  );
}

export default Login;
