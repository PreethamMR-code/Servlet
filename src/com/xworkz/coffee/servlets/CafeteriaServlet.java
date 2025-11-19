package com.xworkz.coffee.servlets;

import com.xworkz.coffee.dto.CafeteriaDTO;
import com.xworkz.coffee.exception.InvalidDataException;
import com.xworkz.coffee.impl.CafeteriaImpl;
import com.xworkz.coffee.inter.Cafeteria;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/CafeteriaResult",loadOnStartup = 1)
public class CafeteriaServlet extends HttpServlet {

    public CafeteriaServlet() {
        System.out.println("CafeteriaServlet object created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("CafeteriaServlet doPost started");
        resp.setContentType("text/html");

        // Getting form data
        String name = req.getParameter("name");
        String location = req.getParameter("location");
        String type = req.getParameter("type");
        String price = req.getParameter("price");
        String franchise = req.getParameter("franchise");
        String owner = req.getParameter("owner");
        String gst = req.getParameter("gst");

        // Creating DTO object
        CafeteriaDTO dto = new CafeteriaDTO(name, location, type, price, franchise, owner, gst);

        Cafeteria cafeteria = new CafeteriaImpl();
        RequestDispatcher rd = req.getRequestDispatcher("CafeteriaResult.jsp");

        try {
            cafeteria.validateDetails(dto);  // validation
            System.out.println("Cafeteria details valid");

            // success attributes
            req.setAttribute("name", name);
            req.setAttribute("location", location);
            req.setAttribute("type", type);
            req.setAttribute("price", price);
            req.setAttribute("franchise", franchise);
            req.setAttribute("owner", owner);
            req.setAttribute("gst", gst);

            req.setAttribute("success", "Cafeteria data validated successfully!");

        } catch (InvalidDataException e) {
            req.setAttribute("fail", "Invalid cafeteria data!");
            System.err.println("Validation failed: " + e.getMessage());
        }

        rd.forward(req, resp);
        System.out.println("CafeteriaServlet doPost ended...");
    }
}
