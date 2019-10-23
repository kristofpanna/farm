package com.codecool.kristofpanna.utils;

import java.util.Random;

public class Randomize {
    private static Random random = new Random();

    public static boolean eventWithChanceInPercent(int percent) {
        int randomNumberTo100 = random.nextInt(100);
        return randomNumberTo100 < percent;
    }
}
