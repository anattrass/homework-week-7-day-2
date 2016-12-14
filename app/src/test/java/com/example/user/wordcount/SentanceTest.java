package com.example.user.wordcount;

import org.junit.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 13/12/2016.
 */
public class SentanceTest {

    Sentance sentance;

    @Before
    public void before() {
        sentance = new Sentance("Hello my name is Bill Oddy and I like looking at Birds");
    }

    @Test
    public void getSentance() {
        assertEquals("Hello my name is Bill Oddy and I like looking at Birds", sentance.getSentance());
    }

    @Test
    public void setSentance() {
        sentance.setSentance("I love animals");
        assertEquals("I love animals", sentance.getSentance());
    }

    @Test
    public void countWordsTest() {
        assertEquals(12, sentance.wordCount());
    }

}
