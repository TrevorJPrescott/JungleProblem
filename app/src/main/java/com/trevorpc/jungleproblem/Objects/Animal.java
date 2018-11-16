package com.trevorpc.jungleproblem.Objects;

import android.util.Log;

public class Animal
{
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    int count = 0;
    int energy = 100;
    //food; meat, fish, bugs and grain
    public void eat(String input)
    {
        if(input.equals("meat")||input.equals("fish")||input.equals("bugs")||input.equals("grain"))
        {
            Log.d("TAG", "Eat: Munch");
            energy = energy+5;
            Log.d("TAG", "eat: energy:"+this.energy);
        }
        else
        {
            Log.d("TAG", "eat: Blah!");
        }

    }
    public void makeNoise()
    {
        Log.d("TAG", "makeNoise: Roar! ");
        energy = energy-5;
        Log.d("TAG", "makeNoise: "+this.energy);
    }
    public void sleep()
    {
        Log.d("TAG", "sleep: ZzzZzz");
        energy = energy+10;
        Log.d("TAG", "sleeping energy: "+this.energy);

    }
    public Animal(int energy)
    {
        count++;
        this.energy = energy;
    }
    public Animal ()
    {
        count++;
        this.energy =50;
    }
}


