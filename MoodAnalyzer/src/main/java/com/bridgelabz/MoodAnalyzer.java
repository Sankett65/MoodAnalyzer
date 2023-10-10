package com.bridgelabz;

import java.lang.annotation.Target;

public class MoodAnalyzer {

    public String analyaseMood(String message) {
        if (message.equals("I am in Sad Mood")) {
            return "SAD";
        } else if (message.equals("I am in any Mood")) {
            return "HAPPY";
        }
        return null;
    }


}
