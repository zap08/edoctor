import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import './Dashboard.css';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import {
  faUser,
  faUserDoctor,
  faUserInjured,
  faCalendarCheck,
  faCalendarDay,
  faComments,
  faSignOutAlt,
} from '@fortawesome/free-solid-svg-icons';
import { Pie, Bar } from 'react-chartjs-2';
import {
  Chart as ChartJS,
  ArcElement,
  BarElement,
  CategoryScale,
  LinearScale,
  Tooltip,
  Legend,
} from 'chart.js';

ChartJS.register(ArcElement, BarElement, CategoryScale, LinearScale, Tooltip, Legend);

function Dashboard() {
  const [stats, setStats] = useState({
    totalUsers: 0,
    totalDoctors: 0,
    totalPatients: 0,
    totalFeedbacks: 0,
  });

  useEffect(() => {
    // Fetch the admin statistics from the backend API
    fetch('http://localhost:8000/admin/stats')
      .then((response) => {
        if (!response.ok) {
          throw new Error('Failed to fetch statistics');
        }
        return response.json();
      })
      .then((data) => setStats(data))
      .catch((error) => console.error('Error fetching statistics:', error));
  }, []);

  const pieData = {
    labels: ['Users', 'Doctors', 'Patients', 'Feedbacks'],
    datasets: [
      {
        label: 'Admin Statistics',
        data: [stats.totalUsers, stats.totalDoctors, stats.totalPatients, stats.totalFeedbacks],
        backgroundColor: [
          'rgba(255, 99, 132, 0.2)',
          'rgba(54, 162, 235, 0.2)',
          'rgba(255, 206, 86, 0.2)',
          'rgba(75, 192, 192, 0.2)',
        ],
        borderColor: [
          'rgba(255, 99, 132, 1)',
          'rgba(54, 162, 235, 1)',
          'rgba(255, 206, 86, 1)',
          'rgba(75, 192, 192, 1)',
        ],
        borderWidth: 1,
        hoverOffset: 15, // Expands slices on hover
      },
    ],
  };

  const barData = {
    labels: ['Users', 'Doctors', 'Patients', 'Feedbacks'],
    datasets: [
      {
        label: 'Admin Statistics',
        data: [stats.totalUsers, stats.totalDoctors, stats.totalPatients, stats.totalFeedbacks],
        backgroundColor: [
          'rgba(255, 99, 132, 0.5)',
          'rgba(54, 162, 235, 0.5)',
          'rgba(255, 206, 86, 0.5)',
          'rgba(75, 192, 192, 0.5)',
        ],
        borderColor: [
          'rgba(255, 99, 132, 1)',
          'rgba(54, 162, 235, 1)',
          'rgba(255, 206, 86, 1)',
          'rgba(75, 192, 192, 1)',
        ],
        borderWidth: 1,
      },
    ],
  };

  return (
    <div className="dashboard-container">
      <aside className="dashboard-sidebar">
        <h2 className="sidebar-title">Admin Panel</h2>
        <nav className="sidebar-nav">
          <ul>
            <li>
              <Link to="/doctorlist">
                <FontAwesomeIcon icon={faUserDoctor} className="nav-icon" />
                Doctor List
              </Link>
            </li>
            <li>
              <Link to="/patientlist">
                <FontAwesomeIcon icon={faUserInjured} className="nav-icon" />
                Patient List
              </Link>
            </li>
            <li>
              <Link to="/appointmentlist">
                <FontAwesomeIcon icon={faCalendarCheck} className="nav-icon" />
                Appointments
              </Link>
            </li>
            <li>
              <Link to="/availabilitydates">
                <FontAwesomeIcon icon={faCalendarDay} className="nav-icon" />
                Availability
              </Link>
            </li>
            <li>
              <Link to="/feedbacklist">
                <FontAwesomeIcon icon={faComments} className="nav-icon" />
                Feedback
              </Link>
            </li>
            <li>
              <Link to="/logout" className="logout-link">
                <FontAwesomeIcon icon={faSignOutAlt} className="nav-icon" />
                Logout
              </Link>
            </li>
          </ul>
        </nav>
      </aside>

      <main className="dashboard-main">
        <header className="main-header">
          <h1>Welcome, Admin</h1>
          <p>Manage users, appointments, feedback, and more.</p>
        </header>

        <div className="dashboard-overview">
          <div className="overview-card" style={{ backgroundColor: '#f8d7da' }}>
            <FontAwesomeIcon icon={faUser} className="card-icon" />
            <h3>Users</h3>
            <p>Total: {stats.totalUsers}</p>
          </div>
          <div className="overview-card" style={{ backgroundColor: '#d1ecf1' }}>
            <FontAwesomeIcon icon={faUserDoctor} className="card-icon" />
            <h3>Doctors</h3>
            <p>Total: {stats.totalDoctors}</p>
          </div>
          <div className="overview-card" style={{ backgroundColor: '#fff3cd' }}>
            <FontAwesomeIcon icon={faUserInjured} className="card-icon" />
            <h3>Patients</h3>
            <p>Total: {stats.totalPatients}</p>
          </div>
          <div className="overview-card" style={{ backgroundColor: '#d4edda' }}>
            <FontAwesomeIcon icon={faComments} className="card-icon" />
            <h3>Feedbacks</h3>
            <p>Total: {stats.totalFeedbacks}</p>
          </div>
        </div>
        <div className='chart'>
          <div className="dashboard-chart1">
            <h3>Statistics Overview - Pie Chart</h3>
            <Pie data={pieData} />
          </div>

          <div className="dashboard-chart2">
            <h3>Statistics Overview - Bar Chart</h3>
            <Bar data={barData} />
          </div>
        </div>  
      </main>
    </div>
  );
}

export default Dashboard;
