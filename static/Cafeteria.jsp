<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cafeteria Form</title>

    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow-lg p-4 mx-auto" style="max-width: 550px;">
        <h3 class="text-center mb-4">Cafeteria Details</h3>

        <form action="CafeteriaResult.jsp" method="post">

            <div class="mb-3">
                <label class="form-label">Name</label>
                <input type="text" name="name" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Location</label>
                <input type="text" name="location" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Type</label>
                <input type="text" name="type" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Price</label>
                <input type="number" name="price" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Franchise Name</label>
                <input type="text" name="franchise" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Owner Name</label>
                <input type="text" name="owner" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">GST No</label>
                <input type="text" name="gst" class="form-control">
            </div>

            <button type="submit" class="btn btn-primary w-100">Submit</button>

        </form>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
