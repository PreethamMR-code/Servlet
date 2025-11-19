<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Coffee Details Result</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  </head>

  <body class="bg-light">

    <div class="container col-md-6 mt-5">

      <h3 class="text-center mb-4 text-success">Coffee Details Submitted</h3>

      <div class="border p-4 rounded shadow-sm bg-white">

        <p><strong>Coffee Type:</strong> ${type}</p>
        <p><strong>Price:</strong> ${price}</p>
        <p><strong>Quantity:</strong> ${quantity}</p>
        <p><strong>Former:</strong> ${former}</p>
        <p><strong>Location:</strong> ${loc}</p>

 <div class="mt-4 text-center">
             <a href="Coffee.jsp" class="btn btn-primary">Go Back</a>
           </div>
      </div>

    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>