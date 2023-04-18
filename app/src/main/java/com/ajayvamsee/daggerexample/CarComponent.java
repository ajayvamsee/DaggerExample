package com.ajayvamsee.daggerexample;

import dagger.Component;

/**
 * Created by Ajay Vamsee on 10/14/2022.
 * Time : 15:41 HRS
 */

@Component ( modules = WheelsModule.class)
public interface CarComponent {

    Car getCar();

    void inject(MainActivity activity);

}
