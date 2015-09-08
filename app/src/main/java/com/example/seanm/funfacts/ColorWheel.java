package com.example.seanm.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by seanm on 01-Sep-15.
 */
@SuppressWarnings("ALL")
public class ColorWheel {

    public String[] mColor = {
            "#39add1",
            "#3079ab",
            "#f9845b"
    };

    public int getColor() {

        String color = "";

        //Randomly select a fact
        Random randomGenerator = new Random(); //Construct a new random number generator
        int randomNumber = randomGenerator.nextInt(mColor.length);
        color = mColor[randomNumber];
        int colorAsInt;
        colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }
}
