package com.xworkz.form;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/buyer",loadOnStartup = 1)
public class Buyer extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String fname =servletRequest.getParameter("fname");
        String lname =servletRequest.getParameter("lname");
        String email =servletRequest.getParameter("email");
        String phone =servletRequest.getParameter("phone");
        String address =servletRequest.getParameter("address");
        String contactTime =servletRequest.getParameter("contactTime");
        String contactMethod =servletRequest.getParameter("ContactMethod");
        String living =servletRequest.getParameter("living");
        String city =servletRequest.getParameter("city");
        String state =servletRequest.getParameter("state");
        String pincode =servletRequest.getParameter("pincode");

        System.out.println("Full name :" + fname);
        System.out.println("Last name :" + lname);
        System.out.println("E mail:" + email);
        System.out.println("Phone Number :" + phone);
        System.out.println("Address :" + address);
        System.out.println("Contact Time:" + contactTime);
        System.out.println("Contact Method :" + contactMethod);
        System.out.println("Living Situation :" + living);
        System.out.println("City :" + city);
        System.out.println("State :" + state);
        System.out.println("Pincode :" + pincode);

    }
}
