package com.codecool.kristofpanna;

public class Main {

    public static void main(String[] args) {
        advanceFarmForMonths(80);
    }

    private static void advanceFarmForMonths(int months) {
        Farm farm = new Farm(2,3,4);
        for (int time = 0; time < months; time++) {
            farm.advanceOneMonth();
        }
        System.out.println("Total food produced after " + months + " months: " + farm.getTotalFoodProduced());
    }
}
