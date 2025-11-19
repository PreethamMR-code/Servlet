<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Coffee Land Details</title>

    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow p-4 mx-auto" style="max-width: 550px;">

        <h3 class="text-center mb-4">Enter Coffee Land Details</h3>

        <form action="CoffeeLandResult.jsp" method="post">

            <div class="mb-3">
                <label class="form-label">Size by Acre</label>
                <input type="number" name="acre" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Total Plants</label>
                <input type="number" name="plants" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Total Yield</label>
                <input type="number" name="yield" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Expenditure</label>
                <input type="number" name="expenditure" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Profit Made</label>
                <input type="number" name="profit" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Fertilizer Quantity Used</label>
                <input type="number" name="fertilizer" class="form-control" required>
            </div>

            <button type="submit" class="btn btn-success w-100">Submit</button>

        </form>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
