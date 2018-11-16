package com.trevorpc.jungleproblem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.trevorpc.jungleproblem.Objects.Animal;
import com.trevorpc.jungleproblem.Objects.Monkey;

public class Jungle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jungle);



        one.getEnergy();
        one.makeNoise();
        one.getEnergy();
        one.getmCount();
        four.getmCount();
    }
    public int mCount;
    public int sCount;
    public int tCount;


// Monkeys each have a separate mCount???
    Monkey one = new Monkey(mCount);
    Monkey two = new Monkey(mCount);
    Monkey three = new Monkey(mCount);
    Monkey four = new Monkey(mCount);



 //   public void soundOff()
 //   {
 //       //loop all animals
 //          this.makeNoise();
 //    }
}
