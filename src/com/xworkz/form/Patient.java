package com.xworkz.form;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/servlet" ,loadOnStartup = 1)
public class Patient extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("server running");


        String hospital= servletRequest.getParameter("hospital");
        String add =servletRequest.getParameter("address");
        String con = servletRequest.getParameter("contact");
        String reg = servletRequest.getParameter("regDate");

        String fname =servletRequest.getParameter("fullname");
        String dob =servletRequest.getParameter("dob");
        String gender =servletRequest.getParameter("gender");
        String mail= servletRequest.getParameter("mail");
        String address =servletRequest.getParameter("address");
        String city =servletRequest.getParameter("city");
        String state =servletRequest.getParameter("state");
        String conn = servletRequest.getParameter("contact");
        String status =servletRequest.getParameter("status");
        String insurance = servletRequest.getParameter("insurance");


        System.out.println("hospital name :"+hospital);
        System.out.println("hospital address:"+add);
        System.out.println("contact:"+con);
        System.out.println("registration date:"+reg);

        System.out.println("Full name :" + fname);
        System.out.println("Date of Birth :" + dob);
        System.out.println("Gender :" + gender);
        System.out.println("email:"+mail);
        System.out.println("Address :" + address);
        System.out.println("City :" + city);
        System.out.println("State:" + state);
        System.out.println("contact:"+conn);
        System.out.println("Meritial Status:" + status);
        System.out.println("Insurance is:"+insurance);


    }
}
