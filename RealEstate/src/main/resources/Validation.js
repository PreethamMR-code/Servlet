function validateForm() {
    let isValid = true;
    clearErrors();

    if (!/^[A-Za-z\s]{4,}$/.test(document.getElementById('fullName').value)) {
            showError('fullName', 'Full name must be at least 4 letters');
            isValid = false;
        }

    const email = document.getElementById('email').value;
        if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
            showError('email', 'Enter valid email address');
            isValid = false;
        }

    const propertyType = document.getElementById('propertyType').value;
        if (propertyType === "") {
            showError('propertyType', 'Please select a property type');
            isValid = false;
        }


    const budget = document.getElementById('budget').value.trim();
        if (budget === "" || isNaN(budget) || budget <= 0) {
            showError('budget', 'Enter a valid budget amount');
            isValid = false;
        }


    const message = document.getElementById('message').value.trim();
        if (message.length > 0 && message.length < 5) {
            showError('message', 'Message must be at least 5 characters');
            isValid = false;
        }

        return isValid;
    }

    // Display error message below input
    function showError(fieldId, message) {
        document.getElementById(fieldId + '-error').textContent = message;
    }

    // Clears all error messages
    function clearErrors() {
        const errors = document.querySelectorAll('.error');
        errors.forEach(err => err.textContent = "");
    }


