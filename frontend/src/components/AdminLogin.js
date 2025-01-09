import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import axios from 'axios';
import './AdminLogin.css';

function AdminLogin() {
  const [adminname, setAdminname] = useState(''); // Matches backend field
  const [password, setPassword] = useState('');
  const navigate = useNavigate();

  const handleLogin = async (e) => {
    e.preventDefault();
  
    if (!adminname.trim()) {
      alert('Admin username is required.');
      return;
    }
  
    if (!password.trim()) {
      alert('Password is required.');
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
          required
          style={{width:"360px",marginLeft:"10px"}}
        />
        <label htmlFor="password">Password</label>
        <input
          type="password"
          id="password"
          name="password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
          required
        />
        <button type="submit">Login</button>
      </form>
    </div>
  );
}

export default AdminLogin;
