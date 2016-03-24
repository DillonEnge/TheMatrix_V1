package com.dillonenge.thematrix_v1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int years;
    int population = 1000;
    Human[] humans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void simulate(View v){
        EditText yearsInput = (EditText) findViewById(R.id.editText);
        years = Integer.parseInt(yearsInput.getText().toString());
        World matrix = new World();
        matrix.beginTime(years);
    }
    public void test(View v){
        World matrix = new World();
        humans = new Human[population];
        humans = matrix.populateWorld(population);
        TextView population = (TextView) findViewById(R.id.textView);
        population.setText(humans.length + " People");
    }
}
