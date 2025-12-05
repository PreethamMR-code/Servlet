<!DOCTYPE html>
<html>
<head>
    <title>User Registration Form</title>
    <style>
        .form-container { max-width: 500px; margin: 50px auto; padding: 20px; border: 1px solid #ddd; border-radius: 10px; }
        input, select { width: 100%; padding: 10px; margin: 10px 0; border: 1px solid #ccc; border-radius: 5px; }
        .error { color: red; font-size: 14px; }
        button { background: #28a745; color: white; padding: 12px; width: 100%; border: none; border-radius: 5px; font-size: 16px; }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>User Registration</h2>
        <form id="userForm" method="POST" action="UserServlet" onsubmit="return validateForm()">
            <input type="text" id="firstName" name="firstName" placeholder="First Name" required>
            <span id="firstName-error" class="error"></span>

            <input type="text" id="lastName" name="lastName" placeholder="Last Name" required>
            <span id="lastName-error" class="error"></span>

            <input type="email" id="email" name="email" placeholder="Email" required>
            <span id="email-error" class="error"></span>

            <input type="tel" id="phone" name="phone" placeholder="Phone (10 digits)" required>
            <span id="phone-error" class="error"></span>

            <input type="number" id="age" name="age" placeholder="Age" min="18" required>
            <span id="age-error" class="error"></span>

            <button type="submit">Register</button>
        </form>
        <a href="index.html" Back to Home</a>
    </div>
    <script src="validation.js"></script>
</body>
</html>
