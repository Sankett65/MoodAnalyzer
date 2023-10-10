package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

    @Test
    public void toAnalayseMoodTestToSad(){
        Assertions.assertEquals("SAD",moodAnalyzer.analyaseMood("I am in Sad Mood"));
    }

    @Test
    public void toAnalayseMoodTestToHappy(){
        Assertions.assertEquals("HAPPY",moodAnalyzer.analyaseMood("I am in any Mood"));
    }



}
