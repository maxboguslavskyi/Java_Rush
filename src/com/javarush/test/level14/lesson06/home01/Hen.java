package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Макс on 02.05.2015.
 */
abstract class Hen {

    abstract int getCountOfEggsPerMonth();

    String getDescription() {
        return "Я курица.";
    }
}