package com.trevorpc.jungleproblem.Objects;

import android.util.Log;

import com.trevorpc.jungleproblem.Jungle;

public class Monkey extends Animal //implements playful
{
    public void getmCount()
    {
        Log.d("TAG", "getmCount: "+mCount);
    }



    public void play() {
        if (energy >= 8) {
            Log.d("TAG", "Play: OooOooOoo");
            energy = energy - 8;
        } else {
            Log.d("TAG", "Play: Monkey is too tired");
        }
    }

    int mCount=0;

    @Override
    public void eat(String input)
    {
        energy = energy-3;
        super.eat(input);

    }

    @Override
    public void makeNoise() {
        this.energy = energy+1;
        super.makeNoise();

    }

    public Monkey(int mcCount)
    {
        mCount++;
    }
}

