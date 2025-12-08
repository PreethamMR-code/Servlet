package com.xworkz.pharma.servlet;


import com.xworkz.pharma.dto.SearchDTO;
import com.xworkz.pharma.dto.UserDto;
import com.xworkz.pharma.service.UserService;
import com.xworkz.pharma.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/update", loadOnStartup = 1)
public class UserUpdateServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    public UserUpdateServlet(){
        System.out.println("created  user update servlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running doget in user update servlet");
        System.out.println("forwarding to registration .jsp");

        String mobileNo = req.getParameter("mobileNo");
        SearchDTO searchDTO = new SearchDTO(mobileNo);

        Optional<UserDto> optionalUserDto = userService.findByPhone(searchDTO);
        if(optionalUserDto.isPresent()) {
         //   req.setAttribute("editDTO", optionalUserDto.get());
            req.getSession().setAttribute("editDTO", optionalUserDto.get());

        } else {
            req.setAttribute("message", "Record not found");
        }

        req.getRequestDispatcher("Update.jsp").forward(req,resp);
    }
}
