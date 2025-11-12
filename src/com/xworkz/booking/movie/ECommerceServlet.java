package com.xworkz.booking.movie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/ecommerce",loadOnStartup = 1)
public class ECommerceServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        String name = req.getParameter("customerName");
        String product = req.getParameter("productName");
        String quantity = req.getParameter("quantity");
        String address = req.getParameter("address");
        String payment = req.getParameter("payment");


        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Order Confirmation</title>");
        out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css' rel='stylesheet'>");

        out.println("</head><body><div class='card'>");
        out.println("<h2> Order Confirmed!</h2>");
        out.println("<p>Customer: " + name + "</p>");
        out.println("<p>Product:" + product + "</p>");
        out.println("<p>Quantity: " + quantity + "</p>");
        out.println("<p>Delivery Address:" + address + "</p>");
        out.println("<p>Payment: " + payment + "</p>");
        out.println("<p>Thank you for shopping with us!</p>");
        out.println("</div>");
        out.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js'></script>");
        out.println("</body></html>");
        out.println("</html>");
    }
}
