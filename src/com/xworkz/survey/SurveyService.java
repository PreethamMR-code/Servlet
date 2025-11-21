package com.xworkz.survey;

import com.sun.media.sound.InvalidDataException;

public class SurveyService {

    public void validateDetails(SurveyDTO dto) throws InvalidDataException {

        System.out.println(dto);
        boolean invalid = false;

        if (dto != null) {

            // ---------------- PERSONAL ----------------
            if (invalidString(dto.getName())) invalid = true;
            else if (invalidString(dto.getOccupation())) invalid = true;
            else if (invalidString(dto.getEducation())) invalid = true;
            else if (invalidString(dto.getNativePlace())) invalid = true;

                // ---------------- CONTACT / DOCS ----------------
            else if (invalidString(dto.getBikeNo())) invalid = true;
            else if (invalidString(dto.getCarNo())) invalid = true;
            else if (invalidString(dto.getMobile())) invalid = true;
            else if (invalidString(dto.getAadhar())) invalid = true;
            else if (invalidString(dto.getPan())) invalid = true;
            else if (invalidString(dto.getVoter())) invalid = true;
            else if (invalidString(dto.getPassport())) invalid = true;
            else if (invalidString(dto.getRation())) invalid = true;

                // ---------------- NUMBERS ----------------
            else if (!validNumber(dto.getIncome())) invalid = true;
            else if (!validNumber(dto.getBank())) invalid = true;
            else if (!validNumber(dto.getChildren())) invalid = true;
            else if (!validNumber(dto.getCycle())) invalid = true;
            else if (!validNumber(dto.getFamily())) invalid = true;
            else if (!validNumber(dto.getInsuranceNo())) invalid = true;
            else if (!validNumber(dto.getLand())) invalid = true;
            else if (!validNumber(dto.getSites())) invalid = true;
            else if (!validNumber(dto.getRtc())) invalid = true;
            else if (!validNumber(dto.getTaxes())) invalid = true;
            else if (!validNumber(dto.getGovt())) invalid = true;
            else if (!validNumber(dto.getDisabled())) invalid = true;
            else if (!validNumber(dto.getAge())) invalid = true;
            else if (!validNumber(dto.getHeight())) invalid = true;
            else if (!validNumber(dto.getWeight())) invalid = true;
            else if (!validNumber(dto.getShoe())) invalid = true;
            else if (!validNumber(dto.getNoShoes())) invalid = true;
            else if (!validNumber(dto.getElectric())) invalid = true;
            else if (!validNumber(dto.getWater())) invalid = true;
            else if (!validNumber(dto.getLoanNo())) invalid = true;
            else if (!validNumber(dto.getLoanBalance())) invalid = true;
            else if (!validNumber(dto.getGold())) invalid = true;
            else if (!validNumber(dto.getSilver())) invalid = true;
            else if (!validNumber(dto.getCows())) invalid = true;
            else if (!validNumber(dto.getShare())) invalid = true;
        }

        if (invalid) {
            throw new InvalidDataException("Invalid Details Found!");
        } else {
            System.out.println("All Details Validated Successfully!");
        }
    }

    private boolean invalidString(String value) {
        return value == null || value.length() < 3;
    }

    private boolean validNumber(int value) {
        return value > 0 && value < 1_000_000_000;
    }
}
