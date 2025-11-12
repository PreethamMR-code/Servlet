package com.xworkz.booking.movie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/blood",loadOnStartup = 1)
public class BloodServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        String name = req.getParameter("donorName");
        String group = req.getParameter("bloodGroup");
        String hospital = req.getParameter("hospital");
        String message = req.getParameter("message");
        String urgent = req.getParameter("urgent");
        if(urgent == null) urgent = "No";

        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>Blood Booking</title>");
        out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css' rel='stylesheet'>");

        out.println("</head><body><div class='card'>");
        out.println("<h2> Blood Request Confirmation</h2>");
        out.println("<p><b>Donor Name:</b> " + name + "</p>");
        out.println("<p><b>Blood Group:</b> " + group + "</p>");
        out.println("<p><b>Hospital:</b> " + hospital + "</p>");
        out.println("<p><b>Message:</b> " + message + "</p>");
        out.println("<p><b>Urgent:</b> " + urgent + "</p>");
        out.println("<p>Your request has been recorded successfully!</p>");
        out.println("</div>");
        out.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js'></script>");
        out.println("</body></html>");

    }
}
