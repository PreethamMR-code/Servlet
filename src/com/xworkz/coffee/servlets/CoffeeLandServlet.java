package com.xworkz.coffee.servlets;

import com.xworkz.coffee.dto.CoffeeLandDTO;
import com.xworkz.coffee.exception.InvalidDataException;
import com.xworkz.coffee.impl.CoffeeLandImpl;
import com.xworkz.coffee.inter.CoffeeLand;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/CoffeeLandResult",loadOnStartup = 1)
public class CoffeeLandServlet extends HttpServlet {

    public CoffeeLandServlet() {
        System.out.println("CoffeeLand servlet object created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("CoffeeLandServlet doPost started");

        resp.setContentType("text/html");

        // Taking input from UI
        String acre = req.getParameter("acre");
        String plants = req.getParameter("plants");
        String yield = req.getParameter("yield");
        String expenditure = req.getParameter("expenditure");
        String profit = req.getParameter("profit");
        String fertilizer = req.getParameter("fertilizer");

        // Creating DTO
        CoffeeLandDTO dto = new CoffeeLandDTO(acre, plants, yield, expenditure, profit, fertilizer);

        // Validation Object
        CoffeeLand landService = new CoffeeLandImpl();

        try {
            landService.validateDetails(dto);
            System.out.println("Coffee Land valid");

            // Success Attributes
            req.setAttribute("acre", acre);
            req.setAttribute("plants", plants);
            req.setAttribute("yield", yield);
            req.setAttribute("expenditure", expenditure);
            req.setAttribute("profit", profit);
            req.setAttribute("fertilizer", fertilizer);

            req.setAttribute("success", "Coffee Land Details Validated Successfully!");

        } catch (InvalidDataException e) {

            System.err.println("Invalid Coffee Land details");
            req.setAttribute("fail", "Validation failed: " + e.getMessage());
        }

        // Forwarding to JSP Page
        RequestDispatcher dispatcher = req.getRequestDispatcher("CoffeeLandResult.jsp");
        dispatcher.forward(req, resp);

        System.out.println("CoffeeLandServlet doPost ended...");
    }
}
