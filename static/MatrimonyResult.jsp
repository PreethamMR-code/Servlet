<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Matrimony Details Result</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  </head>

  <body class="bg-light">

    <div class="container col-md-6 mt-5">

      <h3 class="text-center mb-4 text-primary">Matrimony Details Submitted</h3>

      <div class="border p-4 rounded shadow-sm bg-white">

        <!-- Success / Failure Messages -->
        <h1>
            <p style="color: green"><strong>${success}</strong></p>
            <p style="color: red"><strong>${fail}</strong></p>
        </h1>

        <!-- Display Data -->
        <p><strong>Full Name:</strong> ${fullName}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Profile For:</strong> ${profileFor}</p>
        <p><strong>Gender:</strong> ${gender}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>
        <p><strong>Mother Tongue:</strong> ${motherTongue}</p>
        <p><strong>Religion:</strong> ${religion}</p>
        <p><strong>Marital Status:</strong> ${maritalStatus}</p>
        <p><strong>Height (feet):</strong> ${height}</p>

        <!-- Button -->
        <div class="mt-4 text-center">
            <a href="Matrimony.jsp" class="btn btn-primary">Go Back</a>
        </div>

      </div>

    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>
