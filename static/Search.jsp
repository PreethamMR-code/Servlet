<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Search </title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
           .form-container { max-width: 500px; margin: 50px auto; padding: 20px; border: 1px solid #ddd; border-radius: 10px; }
           input, select { width: 100%; padding: 10px; margin: 10px 0; border: 1px solid #ccc; border-radius: 5px; }
           .error { color: red; font-size: 14px; }
           button { background: #28a745; color: white; padding: 12px; width: 100%; border: none; border-radius: 5px; font-size: 16px; }
       </style>
</head>
<body>
    <div class="form-container">
        <h2>Aqua Form</h2>
        <form action="UserServlet" method="get">
            <div class="mb-3">
                <label for="phone" class="form-label">Phone:</label>
                <input type="text" class="form-control" name="phone" id="phone" placeholder="Enter 10-digit phone number">
            </div>

            <div class="container">
             <div class="row">
              <div class="col">
                <input type="submit" value="Submit" name="submit" class="btn btn-primary btn-lg"/>
                </div>
                 <div class="col">
                 <input type="submit" value="Clear" name="submit" class="btn btn-primary btn-lg"/>
                 </div>
                 </div>
            </div>
            <c:if test="${userDTO !=null}">
            Result : ${userDTO} <a href="update?mobileNo=${userDTO.phone}">Edit</a>



            </br> FirstName: ${sessionScope.userDTO.firstName}

            </c:if>

             <span style="color:red;">${message}</span>
        </form>
    </div>

    <!-- Bootstrap JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>


</body>
</html>

