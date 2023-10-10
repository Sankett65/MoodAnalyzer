package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    MoodAnalyzer moodAnalyzer;

    @Test
    public void toAnalayseMoodTestToSad(){
        moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        Assertions.assertEquals("SAD",moodAnalyzer.analysemessage());
    }

    @Test
    public void toAnalayseMoodTestToHappy(){
        moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        Assertions.assertEquals("SAD",moodAnalyzer.analysemessage());
    }

    @Test
    public void toAnalayseMoodTestToNull(){
        moodAnalyzer = new MoodAnalyzer(null);
        Assertions.assertEquals("HAPPY",moodAnalyzer.toAnalyzeThenullMood());
    }



}
