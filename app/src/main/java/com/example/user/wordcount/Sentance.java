package com.example.user.wordcount;

import java.util.ArrayList;

/**
 * Created by user on 13/12/2016.
 */
public class Sentance {

    private ArrayList<String> words;
    private String sentance;

    public Sentance(String sentance) {
        words = new ArrayList<String>();
        this.sentance = sentance;
    }

    public String getSentance() {
        return sentance;
    }

    public void setSentance(String sentance) {
        this.sentance = sentance;
    }

    public int wordCount() {
        for (String word : sentance.split(" ")) {
        words.add(word);
        }
        return words.size();
    }

}
