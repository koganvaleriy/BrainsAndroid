package com.example.valeriy.brainsandroid.entities;

/**
 * Created by Valeriy on 28.11.2017.
 */

public class Level {

    private int mId;
    private int mAmountOfNumbers;


    public Level(int id, int mAmountOfNumbers) {
        this.mId = id;
        this.mAmountOfNumbers = mAmountOfNumbers;
    }

    public Level(int id) {
        this.mId = id;
    }

    public Level() {
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public int getmAmountOfNumbers() {
        return mAmountOfNumbers;
    }

    public void setmAmountOfNumbers(int mAmountOfNumbers) {
        this.mAmountOfNumbers = mAmountOfNumbers;
    }
}
