package com.xworkz.form;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/seller",loadOnStartup = 1)
public class Sell extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String cname = servletRequest.getParameter("cname");
        String acname = servletRequest.getParameter("acname");
        String city = servletRequest.getParameter("city");
        String state = servletRequest.getParameter("state");
        String pincode = servletRequest.getParameter("pincode");
        String email = servletRequest.getParameter("email");
        String contact = servletRequest.getParameter("contact");
        String reason = servletRequest.getParameter("reason");
        String range = servletRequest.getParameter("range");
        String firstTime = servletRequest.getParameter("firsTime");


        System.out.println("Full name :" + cname);
        System.out.println("Last name :" + acname);
        System.out.println("City :" + city);
        System.out.println("State:" + state);
        System.out.println("Pin code :" + pincode);
        System.out.println("E-mail:" + email);
        System.out.println("Contact Method :" + contact);
        System.out.println("Reason for Buying :" + reason);
        System.out.println("Price Range :" + range);
        System.out.println("First Time Buyer :" + firstTime);

    }
}
