package com.codecool.kristofpanna.plants;

import java.util.List;

public abstract class Plant {
    protected List<Trait> traits;

    // package-private -> Trait can modify these
    boolean rotten = false;
    int production;

    private static final int defaultGrowth = 4;


    public boolean isRotten() {
        return rotten;
    }

    public void grow() {
        for (Trait trait : traits) {
            trait.process();
        }
        System.out.println(this.getClass().getName() + " growing...");
    }

    public int produce() {
        return production;
    }

}
