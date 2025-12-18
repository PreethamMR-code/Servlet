package com.realestate.app.servlet;


import com.realestate.app.dto.RealEstateDTO;
import com.realestate.app.dto.SearchDTO;
import com.realestate.app.exception.RealEstateException;
import com.realestate.app.service.RealEstateService;
import com.realestate.app.service.RealEstateServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/RealEstateServlet",loadOnStartup = 1)
public class RealEstateServlet  extends HttpServlet {

    RealEstateService realEstateService = new RealEstateServiceImpl();

    public RealEstateServlet(){
        System.out.println("Real Estate servlet started");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("DO POST stated");
        resp.setContentType("text/html");


        String fullName = req.getParameter("fullName");
        String email = req.getParameter("email");
        String propertyType = req.getParameter("propertyType");
        double budget = Double.parseDouble(req.getParameter("budget"));
        String message = req.getParameter("message");

        RealEstateDTO realEstateDTO = new RealEstateDTO(fullName,email,propertyType,budget,message);


        try{
            realEstateService.validateAndSave(realEstateDTO);


            req.setAttribute("fullName",fullName);
            req.setAttribute("email",email);
            req.setAttribute("propertyType",propertyType);
            req.setAttribute("budget",budget);
            req.setAttribute("message",message);

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("Result.jsp");
            requestDispatcher.forward(req,resp);

            System.out.println("realEstateDTO: "+realEstateDTO);

        }catch (RealEstateException e){
            e.printStackTrace();
        }

        System.out.println("Do post ended");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String mail = req.getParameter("email");
        SearchDTO searchDTO = new SearchDTO(mail);

        Optional<RealEstateDTO> optionalRealEstateDTO = this.realEstateService.findByGmail(searchDTO);

        if(optionalRealEstateDTO.isPresent())
        {
            RealEstateDTO dto = optionalRealEstateDTO.get();


            req.setAttribute("realEstateDTO", dto);

//            req.getSession().setAttribute("realEstateDTO",dto);

            req.setAttribute("message","");

        }else {
            req.setAttribute("message","search  results not found");
//            req.setAttribute("realEstateDTO",null);
        }
        req.getRequestDispatcher("Search.jsp").forward(req,resp);
    }
}
