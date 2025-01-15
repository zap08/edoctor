import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import axios from 'axios';
import './AdminLogin.css';

function AdminLogin() {
  const [adminname, setAdminname] = useState('');
  const [password, setPassword] = useState('');
  const [errors, setErrors] = useState({});
  const navigate = useNavigate();

  const validateForm = () => {
    const errors = {};

    if (!adminname.trim()) {
      errors.adminname = 'Admin username is required.';
    }

    if (!password.trim()) {
      errors.password = 'Password is required.';
    }

    setErrors(errors);
    return Object.keys(errors).length === 0;
  };

  const handleLogin = async (e) => {
    e.preventDefault();

    if (!validateForm()) {
      return;
    }

    const loginData = { adminname, password };

    try {
      const response = await axios.post('http://localhost:8000/admin/login', loginData);

      if (response.data === true) {
        localStorage.setItem('adminname', adminname);
        navigate('/AdminDashboard');
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
        <h2>Admin Login</h2>

        <label htmlFor="adminname">Admin Username</label>
        <input
          type="text"
          id="adminname"
          name="adminname"
          value={adminname}
          onChange={(e) => setAdminname(e.target.value)}
          style={{ width: "360px", marginLeft: "10px" }}
        />
        {errors.adminname && <p className="error-message">{errors.adminname}</p>}

        <label htmlFor="password">Password</label>
        <input
          type="password"
          id="password"
          name="password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />
        {errors.password && <p className="error-message">{errors.password}</p>}

        <button type="submit">Login</button>
      </form>
    </div>
  );
}

export default AdminLogin;
