package com.cypher.thematrix;

/**
 * Created by Alienware on 3/21/2016.
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class World extends AppCompatActivity {
    Human[] humans;
    public Human[] populateWorld(long humanPopulation){

        for(int i = 0; i<humanPopulation; i++){
            humans[i] = new Human();
        }
        for(Human human: humans){
            human.giveBirth();
        }
        return humans;
    }

    public void beginTime(int years){
        RandomMethods rdmm = new RandomMethods();
        for(int i = 0; i < years; i++);
        for(Human human: humans){
            human.age++;
            rdmm.checkConditions(human);
        }
    }
}
