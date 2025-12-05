function validateForm() {
    let isValid = true;
    clearErrors();

    // First Name: letters only, min 2 chars
    if (!/^[A-Za-z\s]{2,}$/.test(document.getElementById('firstName').value)) {
        showError('firstName', 'First name must be at least 2 letters');
        isValid = false;
    }

    // Last Name: letters only, min 2 chars
    if (!/^[A-Za-z\s]{2,}$/.test(document.getElementById('lastName').value)) {
        showError('lastName', 'Last name must be at least 2 letters');
        isValid = false;
    }

    // Email: standard format
    const email = document.getElementById('email').value;
    if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
        showError('email', 'Enter valid email address');
        isValid = false;
    }

    // Phone: exactly 10 digits
    const phone = document.getElementById('phone').value.replace(/\D/g, '');
    if (phone.length !== 10) {
        showError('phone', 'Phone must be 10 digits');
        isValid = false;
    }

    // Age: 18+
    const age = parseInt(document.getElementById('age').value);
    if (isNaN(age) || age < 18) {
        showError('age', 'Age must be 18 or older');
        isValid = false;
    }

    return isValid;
}

function showError(fieldId, message) {
    document.getElementById(fieldId + '-error').textContent = message;
}

function clearErrors() {
    const errors = document.querySelectorAll('.error');
    errors.forEach(error => error.textContent = '');
}

// Real-time validation
document.querySelectorAll('input').forEach(input => {
    input.addEventListener('blur', () => {
        if (input.value) validateForm();
    });
});
