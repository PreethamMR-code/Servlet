<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Customer Form</title>

    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow p-4 mx-auto" style="max-width: 500px;">

        <h3 class="text-center mb-4">Enter Customer Details</h3>

        <form action="Customer" method="post">

            <div class="mb-3">
                <label class="form-label">Name</label>
                <input type="text" name="name" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Mobile</label>
                <input type="text" name="mobile" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Coffee Flavour</label>
                <input type="text" name="flavour" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Quantity</label>
                <input type="number" name="quantity" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Payment Mode</label>
                <select name="payment" class="form-select" required>
                    <option value="">Select</option>
                    <option>Cash</option>
                    <option>UPI</option>
                    <option>Card</option>
                </select>
            </div>

            <button type="submit" class="btn btn-primary w-100">Submit</button>

        </form>

    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
