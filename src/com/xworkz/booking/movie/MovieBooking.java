package com.xworkz.booking.movie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/movie",loadOnStartup = 1)
public class MovieBooking extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        String name = req.getParameter("userName");
        String movie = req.getParameter("movieName");
        String showtime = req.getParameter("showTime");
        String seat = req.getParameter("seatPref");
        String payment = req.getParameter("payment");

        PrintWriter print= resp.getWriter();

        print.println("<html>");
        print.println("<head><title>Booking Confirmation</title>");
        print.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css' rel='stylesheet'>");
        print.println("</head>");
        print.println("<body>");
        print.println("<h2> Booking Confirmation</h2>");
        print.println("<pre>");
        print.println("Name:"+name);
        print.println("movie:"+movie);
        print.println("showtime:"+showtime);
        print.println("seat:"+seat);
        print.println("payment:"+payment);
        print.println("</pre>");
        print.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js'></script>");
        print.println("</body>");
        print.println("</html>");
    }
}
