package com.example.dnddiceroller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class dicePermutation {
    private int result;
    private String timestamp;
    private Random rand = new Random();

    public dicePermutation() {
        result = 0;
        timestamp = "";
    }

    public int getResult() {
        return result;
    }

    public void addRoll(int sides) {
        result += rand.nextInt(sides) + 1;
        timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    }
}
