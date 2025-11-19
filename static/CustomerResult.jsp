<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Customer Details Result</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  </head>

  <body class="bg-light">

    <div class="container col-md-6 mt-5">

      <h3 class="text-center mb-4 text-success">Customer Details Submitted</h3>

      <div class="border p-4 rounded shadow-sm bg-white">

        <h1>
          <p style="color: green"><strong>${success}</strong></p>
          <p style="color: red"><strong>${fail}</strong></p>
        </h1>

        <p><strong>Name:</strong> ${name}</p>
        <p><strong>Mobile:</strong> ${mobile}</p>
        <p><strong>Coffee Flavour:</strong> ${flavour}</p>
        <p><strong>Quantity:</strong> ${quantity}</p>
        <p><strong>Payment Mode:</strong> ${payment}</p>

        <div class="mt-4 text-center">
          <a href="Customer.jsp" class="btn btn-primary">Go Back</a>
        </div>

      </div>

    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>
