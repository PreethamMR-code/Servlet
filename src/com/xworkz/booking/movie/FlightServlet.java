package com.xworkz.booking.movie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/flight",loadOnStartup = 1)
public class FlightServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.setContentType("text/html");

        String passenger = req.getParameter("passenger");
        String fromCity = req.getParameter("fromCity");
        String toCity = req.getParameter("toCity");
        String travelClass = req.getParameter("travelClass");
        String meal = req.getParameter("meal");
        if(meal == null) meal = "No";

        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>Flight Confirmation</title>");
        out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css' rel='stylesheet'>");
        out.println("</head><body><div class='card'>");
        out.println("<h2> Flight Booking Confirmation</h2>");
        out.println("<p><b>Passenger:</b> " + passenger + "</p>");
        out.println("<p><b>From:</b> " + fromCity + "</p>");
        out.println("<p><b>To:</b> " + toCity + "</p>");
        out.println("<p><b>Class:</b> " + travelClass + "</p>");
        out.println("<p><b>Meal Included:</b> " + meal + "</p>");
        out.println("<p>Have a safe journey!</p>");
        out.println("</div>");
        out.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js'></script>");
        out.println("</body></html>");
    }
}
