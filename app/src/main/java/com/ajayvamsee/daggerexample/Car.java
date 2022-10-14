package com.ajayvamsee.daggerexample;

import android.util.Log;

/**
 * Created by Ajay Vamsee on 10/14/2022.
 * Time : 15:38 HRS
 */
public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive(){
        Log.d(TAG, "driving");
    }
}
