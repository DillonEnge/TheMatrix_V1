package com.cypher.thematrix;

import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import org.w3c.dom.Text;

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

    public void checkConditions(Human human, String condition){
        if(condition == "age") {
            if (human.age == 1) human.lifeStage = "Toddler";
            if (human.age >= 2) human.lifeStage = "Infant";
            if (human.age >= 5) human.lifeStage = "Schoolchild";
            if (human.age >= 11) human.lifeStage = "Adolescent";
            if (human.age >= 20) human.lifeStage = "Young adult";
            if (human.age >= 30) human.lifeStage = "Mature adult";
            if (human.age >= 60) human.lifeStage = "Ageing adult";
        }
        if(condition == "weight"){
            if(human.age > 24)human.weight++;
        }

    }

    public double getGaussian(double aMean, double aVariance){
        Random random = new Random();
        return aMean + random.nextGaussian() * aVariance;
    }

}
