package com.cypher.thematrix;

import java.util.Random;

/**
 * Created by Dillon on 3/21/2016.
 */
public class Human {
    double maxHeight;
    double height;
    int weight;
    String race;
    String gender;
    String bodyType;
    int stressLevel;
    int age;
    double iq;
    String lifeStage;
    Random rdm;
    RandomMethods rdmMethods;
    public void giveBirth(){
        height = rdmMethods.getGaussian(19.5, 0.55);
        maxHeight = rdmMethods.getGaussian(177.8, 5.08);
        weight = rdm.nextInt((8-6) + 1) + 6;
        race = rdmMethods.generateRace();
        gender = rdmMethods.generateGender();
        bodyType = rdmMethods.generateBodyType();
        stressLevel = 0;
        age = 0;
        iq = rdmMethods.getGaussian(100, 15); //generates a double of iq from a normal distribution
        lifeStage = "Babe-in-arms";
    }
}
