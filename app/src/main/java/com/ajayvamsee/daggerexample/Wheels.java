package com.ajayvamsee.daggerexample;

import javax.inject.Inject;

/**
 * Created by Ajay Vamsee on 10/14/2022.
 * Time : 15:39 HRS
 */
public class Wheels {

    private Rim rims;
    private Tires tires;

    public Wheels(Rim rim, Tires tires){
        this.rims = rim;
        this.tires = tires;
    }
}
