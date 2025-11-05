package com.xworkz.info;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/Person",loadOnStartup = 1)
public class Information extends GenericServlet {

public Information(){
    System.out.println("server running");
}


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("information server running ");

       String name= servletRequest.getParameter("fullName");
       String  email= servletRequest.getParameter("email");
      String number= servletRequest.getParameter("number");
      String age= servletRequest.getParameter("Age");
     String add=  servletRequest.getParameter("address");
        String dob=servletRequest.getParameter("Dob");
     String school=   servletRequest.getParameter("school");
      String student=servletRequest.getParameter("student");
       String pass= servletRequest.getParameter("pass");
       String per= servletRequest.getParameter("percantage");

        String col= servletRequest.getParameter("college");
        String stu= servletRequest.getParameter("student");
        String pass1= servletRequest.getParameter("pass");
        String percantage= servletRequest.getParameter("percantage");

        String collge= servletRequest.getParameter("colleg");
        String student1= servletRequest.getParameter("student");







        System.out.println("name is"+name);
        System.out.println("email is"+email);
        System.out.println("number is"+number);
        System.out.println("age is"+age);
        System.out.println("address is"+add);
        System.out.println("dob is"+dob);
        System.out.println("school is"+school);
        System.out.println("student is"+student);
        System.out.println("pass is"+pass);
        System.out.println("percentage is"+per);


        System.out.println("college is"+col);

        System.out.println("student is"+stu);

        System.out.println(" pass is"+pass1);

        System.out.println("percentage is"+percantage);

        System.out.println("college is"+collge);
        System.out.println("student is"+student1);

    }
}
