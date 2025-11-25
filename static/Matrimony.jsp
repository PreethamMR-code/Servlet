<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Matrimony Form</title>

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.x/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>

    /* small custom spacing */
    body { padding-top: 2rem; background:#f8f9fa; }
    .card { max-width: 900px; margin: 0 auto; }

  </style>
</head>
<body>

<div class="container">
  <div class="card shadow-sm">
    <div class="card-body">
      <h3 class="card-title mb-3">Matrimony Registration Form</h3>

      <form action="matrimony" method="post" id="matrimonyForm" oninput="validateForm()" >
        <div class="row g-3">
          <div class="col-12">
            <label for="email" class="form-label">Email</label>
            <input type="email" id="email" name="email" class="form-control" placeholder="name@example.com">
          </div>
          <div class="col-12">
              <label for="fullName" class="form-label">Full Name</label>
              <input type="text" id="fullName" name="fullName" class="form-control">
          </div>


          <div class="col-md-6">
            <label id="forLabel" class="form-label">For</label>
            <select id="profileFor" name="profileFor" class="form-select">
              <option value="">-- Select --</option>
              <option>Self</option>
              <option>Son</option>
              <option>Daughter</option>
              <option>Brother</option>
              <option>Sister</option>
            </select>
          </div>

          <div class="col-md-6">
            <label class="form-label d-block">Gender</label>
            <div class="form-check form-check-inline">
              <input class="form-check-input" type="radio" name="gender" id="genderMale" value="Male" onclick="updateLabel()">
              <label class="form-check-label" for="genderMale">Male</label>
            </div>
            <div class="form-check form-check-inline">
              <input class="form-check-input" type="radio" name="gender" id="genderFemale" value="Female" onclick="updateLabel()">
              <label class="form-check-label" for="genderFemale">Female</label>
            </div>
          </div>

          <div class="col-md-6">
            <label for="dob" class="form-label">Date of Birth</label>
            <input type="date" id="dob" name="dob" class="form-control">
          </div>

          <div class="col-md-6">
            <label for="motherTongue" class="form-label">Mother Tongue</label>
            <select id="motherTongue" name="motherTongue" class="form-select">
              <option value="">-- Select --</option>
              <option>Kannada</option>
              <option>Tamil</option>
              <option>Telugu</option>
              <option>Hindi</option>
            </select>
          </div>

          <div class="col-md-6">
            <label for="religion" class="form-label">Religion</label>
            <select id="religion" name="religion" class="form-select">
              <option value="">-- Select --</option>
              <option>Hindu</option>
              <option>Muslim</option>
              <option>Christian</option>
              <option>Jain</option>
            </select>
          </div>

          <div class="col-md-6">
            <label for="maritalStatus" class="form-label">Marital Status</label>
            <select id="maritalStatus" name="maritalStatus" class="form-select">
              <option value="">-- Select --</option>
              <option>Never Married</option>
              <option>Divorced</option>
              <option>Widowed</option>
            </select>
          </div>

          <div class="col-md-6">
            <label for="height" class="form-label">Height (feet)</label>
            <input type="number" id="height" name="height" min="1" max="7" class="form-control" placeholder="e.g. 5">
            <div class="form-text">Enter a value between 1 and 7</div>
          </div>

          <div class="col-12 text-end">
            <button id="submitBtn" class="btn btn-primary" disabled>Submit</button>
          </div>
        </div>
      </form>

    </div>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.x/dist/js/bootstrap.bundle.min.js"></script>

<script>
  function validateForm() {
      let email = document.getElementById("email").value;
      let fullName = document.getElementById("fullName").value;
      let profileFor = document.getElementById("profileFor").value;
      let gender = document.querySelector('input[name="gender"]:checked');
      let dob = document.getElementById("dob").value;
      let motherTongue = document.getElementById("motherTongue").value;
      let religion = document.getElementById("religion").value;
      let maritalStatus = document.getElementById("maritalStatus").value;
      let height = document.getElementById("height").value;



      let emailValid = /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email);
      let heightValid = height >= 1 && height <= 7;

      let allValid =
          emailValid &&
          fullName !== "" &&
          profileFor !== "" &&
          gender &&
          dob !== "" &&
          motherTongue !== "" &&
          religion !== "" &&
          maritalStatus !== "" &&
          heightValid;

      document.getElementById("submitBtn").disabled = !allValid;
  }

  function updateLabel() {
      let g = document.querySelector('input[name="gender"]:checked');
      let label = document.getElementById("forLabel");

      if (!g) {
          label.innerText = "For";
          return;
      }
      label.innerText = g.value === "Male" ? "For (Groom's)" : "For (Bride's)";
  }
</script>

</body>
</html>
