package com.xworkz.survey;

import com.sun.media.sound.InvalidDataException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Serv,/home", loadOnStartup = 1)
public class SurveyServlet extends HttpServlet {

    private SurveyService service = new SurveyService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        SurveyDTO dto = new SurveyDTO();

        dto.setName(req.getParameter("name"));
        dto.setOccupation(req.getParameter("occupation"));
        dto.setEducation(req.getParameter("education"));
        dto.setNativePlace(req.getParameter("nativePlace"));

        dto.setBikeNo(req.getParameter("bikeNo"));
        dto.setCarNo(req.getParameter("carNo"));
        dto.setMobile(req.getParameter("mobile"));
        dto.setAadhar(req.getParameter("aadhar"));
        dto.setPan(req.getParameter("pan"));
        dto.setVoter(req.getParameter("voter"));
        dto.setPassport(req.getParameter("passport"));
        dto.setRation(req.getParameter("ration"));


        dto.setIncome(parse(req.getParameter("income")));
        dto.setBank(parse(req.getParameter("bank")));
        dto.setChildren(parse(req.getParameter("children")));
        dto.setCycle(parse(req.getParameter("cycle")));
        dto.setFamily(parse(req.getParameter("family")));
        dto.setInsuranceNo(parse(req.getParameter("insuranceNo")));
        dto.setLand(parse(req.getParameter("land")));
        dto.setSites(parse(req.getParameter("sites")));
        dto.setRtc(parse(req.getParameter("rtc")));
        dto.setTaxes(parse(req.getParameter("taxes")));
        dto.setGovt(parse(req.getParameter("govt")));
        dto.setDisabled(parse(req.getParameter("disabled")));
        dto.setAge(parse(req.getParameter("age")));
        dto.setHeight(parse(req.getParameter("height")));
        dto.setWeight(parse(req.getParameter("weight")));
        dto.setShoe(parse(req.getParameter("shoe")));
        dto.setNoShoes(parse(req.getParameter("noShoes")));
        dto.setElectric(parse(req.getParameter("electric")));
        dto.setWater(parse(req.getParameter("water")));
        dto.setLoanNo(parse(req.getParameter("loanNo")));
        dto.setLoanBalance(parse(req.getParameter("loanBalance")));
        dto.setGold(parse(req.getParameter("gold")));
        dto.setSilver(parse(req.getParameter("silver")));
        dto.setCows(parse(req.getParameter("cows")));
        dto.setShare(parse(req.getParameter("share")));

        try {
            service.validateDetails(dto);  // VALIDATE ALL FIELDS
            req.setAttribute("dto", dto);
            req.getRequestDispatcher("Success.jsp").forward(req, resp);

        } catch (InvalidDataException e) {
            req.setAttribute("error", e.getMessage());
            req.getRequestDispatcher("Error.jsp").forward(req, resp);
        }
    }

    private int parse(String value) {
        try {
            return Integer.parseInt(value);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Survey.jsp").forward(req,resp);
    }

}
