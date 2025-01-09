// PaymentSuccess.js
import React, { useEffect, useState } from 'react';
import { useLocation, useNavigate } from 'react-router-dom';

const PaymentSuccess = () => {
    const location = useLocation();
    const navigate = useNavigate();
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);
    const [countdown, setCountdown] = useState(10); // 10 seconds countdown
    const [hasDownloaded, setHasDownloaded] = useState(false);

    useEffect(() => {
        const fetchInvoice = async () => {
            try {
                const queryParams = new URLSearchParams(location.search);
                const sessionId = queryParams.get('session_id');

                if (sessionId) {
                    // Open invoice in new tab
                    const invoiceWindow = window.open(`http://localhost:8000/api/payment/verify-and-generate-invoice/${sessionId}`, '_blank');
                    if (invoiceWindow) {
                        setHasDownloaded(true);
                    } else {
                        setError('Popup blocked. Please use the download button below to get your invoice.');
                    }
                } else {
                    setError('No session ID found');
                }
            } catch (err) {
                console.error('Error:', err);
                setError('Failed to process payment confirmation');
            } finally {
                setLoading(false);
            }
        };

        fetchInvoice();
    }, [location]);

    // Countdown effect
    useEffect(() => {
        const timer = setInterval(() => {
            setCountdown((prev) => {
                if (prev <= 1) {
                    clearInterval(timer);
                    navigate('/Patientdashboard');
                    return 0;
                }
                return prev - 1;
            });
        }, 1000);

        return () => clearInterval(timer);
    }, [navigate]);

    const handleManualDownload = () => {
        const sessionId = new URLSearchParams(location.search).get('session_id');
        window.open(`http://localhost:8000/api/payment/verify-and-generate-invoice/${sessionId}`, '_blank');
        setHasDownloaded(true);
    };

    const handleDashboardRedirect = () => {
        navigate('/Patientdashboard');
    };

    return (
        <div className="flex flex-col items-center justify-center min-h-screen bg-gray-100 p-4">
            <div className="p-8 bg-white rounded-lg shadow-md text-center max-w-md w-full">
                <div className="mb-6">
                    <div className="text-3xl mb-2">✅</div>
                    <h2 className="text-2xl font-bold text-green-600 mb-4">
                        Payment Successful!
                    </h2>
                </div>

                {loading ? (
                    <p className="text-gray-600">Processing your payment...</p>
                ) : (
                    <div className="space-y-4">
                        {!hasDownloaded && (
                            <div className="bg-yellow-50 p-4 rounded-md">
                                <p className="text-yellow-700 font-medium">
                                    Don't forget to download your invoice!
                                </p>
                            </div>
                        )}

                        {error ? (
                            <div className="text-red-500 mb-4">{error}</div>
                        ) : null}

                        <button
                            onClick={handleManualDownload}
                            className="w-full px-4 py-2 bg-blue-500 text-white rounded hover:bg-blue-600 transition-colors"
                        >
                            Download Invoice
                        </button>

                        <div className="mt-4">
                            <p className="text-gray-600">
                                Redirecting to dashboard in {countdown} seconds...
                            </p>
                        </div>

                        <button
                            onClick={handleDashboardRedirect}
                            className="w-full px-4 py-2 bg-gray-500 text-white rounded hover:bg-gray-600 transition-colors"
                        >
                            Go to Dashboard Now
                        </button>
                    </div>
                )}
            </div>
        </div>
    );
};

export default PaymentSuccess;