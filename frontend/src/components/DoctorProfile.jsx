import React, { useState, useEffect } from "react";
import axios from "axios";
import "./DoctorProfile.css";

const DoctorProfile = () => {
  const [profileData, setProfileData] = useState(null);
  const [formData, setFormData] = useState({
    doctorId: "",
    doctorName: "",
    speciality: "",
    location: "",
    mobileNo: "",
    experience: "",
    email: "",
  });
  const [userId, setUserId] = useState("");
  const [error, setError] = useState("");
  const [formErrors, setFormErrors] = useState({}); // To track validation errors

  useEffect(() => {
    const storedUserId =
      localStorage.getItem("userId") || sessionStorage.getItem("userId");

    if (storedUserId) {
      setUserId(storedUserId);
      setFormData((prevData) => ({
        ...prevData,
        email: storedUserId,
      }));
    } else {
      setError("User ID not found. Please log in.");
    }
  }, []);

  useEffect(() => {
    if (!userId) return;

    const fetchDoctorData = async () => {
      try {
        const response = await axios.get(
          `http://localhost:8000/doctor/getDoctorByEmail?email=${userId}`
        );

        if (response.data) {
          const doctorId = response.data.doctorId || "";
          localStorage.setItem("doctorId", doctorId);
          setProfileData(response.data);

          setFormData({
            doctorId,
            doctorName: response.data.doctorName || "",
            speciality: response.data.speciality || "",
            location: response.data.location || "",
            mobileNo: response.data.mobileNo || "",
            experience: response.data.experience || "",
            email: response.data.email || "",
          });
        } else {
          setError("No doctor found with this email.");
        }
      } catch (error) {
        console.error("Error fetching profile:", error);
      }
    };

    fetchDoctorData();
  }, [userId]);

  const validateForm = () => {
    const errors = {};
    if (!formData.doctorName) errors.doctorName = "Name is required.";
    if (!formData.doctorId) errors.doctorId = "Doctor ID is required.";
    if (!formData.speciality) errors.speciality = "Specialization is required.";
    if (!formData.location) errors.location = "Location is required.";
    if (!formData.mobileNo || !/^\d{10}$/.test(formData.mobileNo))
      errors.mobileNo = "Valid 10-digit mobile number is required.";
    if (!formData.experience || isNaN(formData.experience) || formData.experience <= 0)
      errors.experience = "Valid experience in years is required.";
    return errors;
  };

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData((prevData) => ({ ...prevData, [name]: value }));
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    const errors = validateForm();
    if (Object.keys(errors).length > 0) {
      setFormErrors(errors);
      return;
    }
    setFormErrors({});
    try {
      const response = await axios.post(
        "http://localhost:8000/doctor/addDoctor",
        {
          ...formData,
          users: { email: formData.email },
        }
      );
      setProfileData(response.data);
      alert("Profile saved successfully!");
    } catch (error) {
      console.error("Error saving profile:", error);
      setError("Error saving profile. Please try again.");
    }
  };

  return (
    <div className="doctorProfile">
      <h2>{profileData ? "Edit Doctor Profile" : "Create Doctor Profile"}</h2>

      {error && <p className="error">{error}</p>}

      {!profileData && (
        <form onSubmit={handleSubmit} >
          <div style={{width:"90%"}}> 
            <input
              name="doctorName"
              placeholder="Name"
              value={formData.doctorName}
              onChange={handleChange}
            />
            {formErrors.doctorName && <p className="error">{formErrors.doctorName}</p>}
          </div>
          <div style={{width:"90%"}}>
            <input
              name="doctorId"
              placeholder="Doctor ID"
              value={formData.doctorId}
              onChange={handleChange}
            />
            {formErrors.doctorId && <p className="error">{formErrors.doctorId}</p>}
          </div>
          <div style={{width:"90%"}}>
            <input
              name="speciality"
              placeholder="Specialization"
              value={formData.speciality}
              onChange={handleChange}
            />
            {formErrors.speciality && <p className="error">{formErrors.speciality}</p>}
          </div>
          <div style={{width:"90%"}}>
            <input
              name="location"
              placeholder="Location"
              value={formData.location}
              onChange={handleChange}
            />
            {formErrors.location && <p className="error">{formErrors.location}</p>}
          </div>
          <div style={{width:"90%"}}>
            <input
              name="mobileNo"
              placeholder="Mobile No"
              value={formData.mobileNo}
              onChange={handleChange}
            />
            {formErrors.mobileNo && <p className="error">{formErrors.mobileNo}</p>}
          </div>
          <div style={{width:"90%"}}>
            <input
              name="experience"
              placeholder="Experience"
              value={formData.experience}
              onChange={handleChange}
            />
            {formErrors.experience && <p className="error">{formErrors.experience}</p>}
          </div>
          <div style={{width:"90%"}}>
            <input
              name="email"
              placeholder="Email"
              value={formData.email}
              readOnly
            />
          </div> 
          <button type="submit">Save Profile</button>
        </form>
      )}

      {profileData && (
        <div className="profile">
          <h3>Doctor Profile</h3>
          <p><strong>Name:</strong> {profileData.doctorName}</p>
          <p><strong>Specialization:</strong> {profileData.speciality}</p>
          <p><strong>Doctor ID:</strong> {profileData.doctorId}</p>
          <p><strong>Location:</strong> {profileData.location}</p>
          <p><strong>Mobile No:</strong> {profileData.mobileNo}</p>
          <p><strong>Email:</strong> {profileData.email}</p>
          <p><strong>Experience:</strong> {profileData.experience}</p>
        </div>
      )}
    </div>
  );
};

export default DoctorProfile;
