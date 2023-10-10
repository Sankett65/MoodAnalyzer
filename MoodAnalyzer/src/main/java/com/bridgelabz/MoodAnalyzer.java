package com.bridgelabz;

import java.lang.annotation.Target;



public class MoodAnalyzer {

    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public  String analysemessage() {
        if (this.message.equals("I am in Sad Mood") || this.message.equals("I am in Happy Mood")){
            return "SAD";
        }

            try {
                if (this.message.equals("Null Mood")) {
                    throw new NullPointerException("Invalid Input");
                }
            } catch (Exception e) {
                System.out.println("Invalid Input"+e);
                e.printStackTrace();

            return "HAPPY";
        }
        return null;
    }

}
