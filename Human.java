package com.cypher.thematrix;

import java.util.Random;

/**
 * Created by Dillon on 3/21/2016.
 */
public class Human {
    int height;
    int weight;
    String race;
    String gender;
    String bodyType;
    int stressLevel;
    int age;
    Random rdm;
    RandomMethods rdmMethods;
    public void giveBirth(){
        height = rdm.nextInt((21 - 17) + 1) + 17;
        weight = rdm.nextInt((8-6) + 1) + 6;
        race = rdmMethods.generateRace();
        gender = rdmMethods.generateGender();
        bodyType = rdmMethods.generateBodyType();
        stressLevel = 0;
        age = 0;
    }
}
