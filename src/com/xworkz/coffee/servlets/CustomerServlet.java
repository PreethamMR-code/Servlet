package com.xworkz.coffee.servlets;

import com.xworkz.coffee.dto.CustomerDTO;
import com.xworkz.coffee.exception.InvalidDataException;
import com.xworkz.coffee.impl.CustomerImpl;
import com.xworkz.coffee.inter.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Customer", loadOnStartup = 1)
public class CustomerServlet extends HttpServlet {


    public CustomerServlet() {
        System.out.println("CustomerServlet object created...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("CustomerServlet doPost started");

        resp.setContentType("text/html");

        // Form-data
        String name = req.getParameter("name");
        String mobile = req.getParameter("mobile");
        String flavour = req.getParameter("flavour");
        String quantity = req.getParameter("quantity");
        String payment = req.getParameter("payment");

        // Create DTO
        CustomerDTO dto = new CustomerDTO(name, mobile, flavour, quantity, payment);

        // Create service
        Customer customerService = new CustomerImpl();

        // Prepare dispatcher
        RequestDispatcher dispatcher = req.getRequestDispatcher("CustomerResult.jsp");

        try {
            // VALIDATE
            customerService.validateDetails(dto);

            // Success
            req.setAttribute("success", "Successfully Validated...");

            req.setAttribute("name", name);
            req.setAttribute("mobile", mobile);
            req.setAttribute("flavour", flavour);
            req.setAttribute("quantity", quantity);
            req.setAttribute("payment", payment);

            System.out.println("Customer details valid");

        } catch (InvalidDataException e) {

            req.setAttribute("fail", "Validation Failed!!");

            System.err.println("Invalid data: " + e.getMessage());
        }

        // Forward ALWAYS after setting values
        dispatcher.forward(req, resp);

        System.out.println("CustomerServlet doPost ended");
    }
}
