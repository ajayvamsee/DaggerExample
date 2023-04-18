package com.ajayvamsee.daggerexample;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ajay Vamsee on 10/14/2022.
 * Time : 17:38 HRS
 */

@Module
public class WheelsModule {

    @Provides
    static Rim provideRims(){
        return new Rim();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rim rim,Tires tires){
        return new Wheels(rim,tires);
    }
}
