package com.cypher.thematrix;

import java.util.Random;

/**
 * Created by Alienware on 3/23/2016.
 */
public class RandomMethods {
    Random rdm;
    public String generateRace(){
        String race;
        int raceInt = rdm.nextInt((3 - 1) + 1) + 1;
        switch (raceInt) {
            case 1:  race = "White";
                break;
            case 2:  race = "Asian";
                break;
            case 3:  race = "Black";
                break;
            default: race = "White";
                break;
        }
        return race;
    }

    public String generateGender(){
        String gender;
        int raceInt = rdm.nextInt((2 - 1) + 1) + 1;
        switch (raceInt) {
            case 1:  gender = "Male";
                break;
            case 2:  gender = "Female";
                break;
            default: gender = "Female";
                break;
        }
        return gender;
    }

    public String generateBodyType(){
        String bodyType;
        int bodyTypeInt = rdm.nextInt((5 - 1) + 1) + 1;
        switch (bodyTypeInt) {
            case 1:  bodyType = "Skinny";
                break;
            case 2:  bodyType = "Fat";
                break;
            case 3:  bodyType = "Fit";
                break;
            case 4:  bodyType = "Attractive";
                break;
            case 5: bodyType = "Average";
                break;
            default: bodyType = "Average";
                break;
        }
        return bodyType;
    }
}
