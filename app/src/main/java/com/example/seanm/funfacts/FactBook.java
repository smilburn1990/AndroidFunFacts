package com.example.seanm.funfacts;

import java.util.Random;

public class FactBook {

    public String[] mFacts = {
        "Ants stretch when they wake up in the morning.",
        "Ostriches can run faster than horses.",
        "Olympic medals are made mostly of silver."
    };

    public String getFact() {

        String fact = "";

        //Randomly select a fact
        Random randomGenerator = new Random(); //Construct a new random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];
        return fact;
    }
}
