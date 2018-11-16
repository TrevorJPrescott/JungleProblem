package com.trevorpc.jungleproblem.Objects;

import android.util.Log;

public class Tiger extends Animal {
    public void gettCount() {

        Log.d("TAG", "gettCount: There are this many Tigers "+tCount);
    }

    int tCount = 0;

    @Override
    public void sleep() {
        energy = energy - 5;
        super.sleep();

    }

    @Override
    public void eat(String input) {
        if(input.equals("grain"))
        {
            Log.d("TAG", "eat: Blah");
        }
        else
        super.eat(input);
    }

    public Tiger(int tCount)
    {
        tCount++;
    }

}