package com.xworkz.booking.movie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/food",loadOnStartup = 1)
public class FoodServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        String name = req.getParameter("name");
        String item = req.getParameter("item");
        String qty = req.getParameter("quantity");
        String address = req.getParameter("address");
        String payment = req.getParameter("payment");

        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>Food Confirmation</title>");
        out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css' rel='stylesheet'>");

        out.println("</head><body><div class='card'>");
        out.println("<h2> Food Order Confirmed</h2>");
        out.println("<p><b>Name:</b> " + name + "</p>");
        out.println("<p><b>Item:</b> " + item + "</p>");
        out.println("<p><b>Quantity:</b> " + qty + "</p>");
        out.println("<p><b>Address:</b> " + address + "</p>");
        out.println("<p><b>Payment:</b> " + payment + "</p>");
        out.println("<p>Your food is being prepared!</p>");
        out.println("</div>");
        out.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js'></script>");
        out.println("</body></html>");
    }
}
