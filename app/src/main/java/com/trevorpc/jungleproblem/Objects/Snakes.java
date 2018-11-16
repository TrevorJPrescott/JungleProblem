package com.trevorpc.jungleproblem.Objects;

import android.util.Log;

public class Snakes extends Animal
{
    public void getsCount()
    {
        Log.d("TAG", "getsCount: "+sCount);
    }

    int sCount=0;
public void snakes(int sCount)
{
    energy =20;
    sCount++;

}


}
