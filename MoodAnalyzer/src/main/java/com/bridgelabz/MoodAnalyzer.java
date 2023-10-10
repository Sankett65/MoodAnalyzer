package com.bridgelabz;

import java.lang.annotation.Target;



public class MoodAnalyzer {

    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public  String analysemessage() {
        if (this.message.equals("I am in Sad Mood") || this.message.equals("I am in Happy Mood")) {
            return "SAD";
        }
        return null;
    }

    public String toAnalyzeThenullMood(){
            try {
                if (this.message.equals(null)) {
                    throw new NullPointerException();
                }
            } catch (NullPointerException e) {
                System.out.println("Invalid Input"+e);
                e.printStackTrace();
            return "HAPPY";
        }
        return null;
    }

}
