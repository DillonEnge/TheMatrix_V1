package com.cypher.thematrix;

/**
 * Created by Alienware on 3/21/2016.
 */
import android.os.Bundle;

public class World {
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

    }
}
