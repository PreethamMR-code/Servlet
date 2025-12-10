package com.realestate.app.servlet;


import com.realestate.app.dto.RealEstateDTO;
import com.realestate.app.dto.SearchDTO;
import com.realestate.app.service.RealEstateService;
import com.realestate.app.service.RealEstateServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/Update",loadOnStartup = 1)
public class UpdateServlet extends HttpServlet {

    private RealEstateService realEstateService  = new RealEstateServiceImpl();

    public UpdateServlet(){
        System.out.println("update servlet started");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running do get in update servlet");
        System.out.println("forwarding to registration .jsp");

        String emailId = req.getParameter("emailId");
        SearchDTO searchDTO = new SearchDTO(emailId);

        Optional<RealEstateDTO> optionalRealEstateDTO = realEstateService.findByGmail(searchDTO);
        if(optionalRealEstateDTO.isPresent())
        {
            req.getSession().setAttribute("editDTO",optionalRealEstateDTO.get());

        }else {
            req.setAttribute("message", "record not found");
        }
        req.getRequestDispatcher("Update.jsp").forward(req,resp);
    }
}
