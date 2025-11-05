package com.xworkz.form;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/driving",loadOnStartup = 1)
public class Driving extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("server running");

        String fname =servletRequest.getParameter("fname");
        String  son = servletRequest.getParameter("name");
        String dob =servletRequest.getParameter("dob");
        String edu =servletRequest.getParameter("Education");
        String gender =servletRequest.getParameter("gender");
        String address =servletRequest.getParameter("address");
        String city =servletRequest.getParameter("city");
        String state =servletRequest.getParameter("state");
        String country =servletRequest.getParameter("country");
        String personal =servletRequest.getParameter("personal");
        String occupation =servletRequest.getParameter("occupation");
        String mark = servletRequest.getParameter("mark");

        System.out.println("Full name :" + fname);
        System.out.println("son/wife/daughter of:"+son);
        System.out.println("Date of Birth :" + dob);
        System.out.println("Education is:"+edu);
        System.out.println("Gender :" + gender);
        System.out.println("Address :" + address);
        System.out.println("City :" + city);
        System.out.println("State:" + state);
        System.out.println("Home number:" + country);
        System.out.println("Personal Mobile Number :" + personal);
        System.out.println("Occupation is"+ occupation);
        System.out.println("mark on body"+mark);


    }
}
