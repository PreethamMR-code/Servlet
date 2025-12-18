package com.realestate.app.servlet;

import com.realestate.app.service.RealEstateService;
import com.realestate.app.service.RealEstateServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Delete",loadOnStartup = 1)
public class DeleteServlet extends HttpServlet {


    private RealEstateService service = new RealEstateServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String emailId = req.getParameter("emailId");
        String source = req.getParameter("source");

        boolean deleted = service.deleteByEmail(emailId);

        if (deleted) {
            req.setAttribute("message", "Record deleted successfully");
        } else {
            req.setAttribute("message", "Delete failed or record not found");
        }

        if ("property".equals(source)) {
            // go back to property search page
          resp.sendRedirect("RealEstateSearch.jsp");

//            req.getRequestDispatcher("RealEstateSearch.jsp").forward(req,resp);

        } else {
            // default → search by email
            resp.sendRedirect("Search.jsp");

//            req.getRequestDispatcher("Search.jsp").forward(req, resp);
        }

    }
}
