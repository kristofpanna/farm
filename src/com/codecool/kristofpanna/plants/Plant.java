package com.codecool.kristofpanna.plants;

import java.util.ArrayList;
import java.util.List;

public abstract class Plant {
    protected List<Trait> traits = new ArrayList<>();

    // package-private -> Trait can modify these
    boolean rotten = false;
    int production;


    public boolean isRotten() {
        return rotten;
    }

    public void grow() {
        final int DEFAULT_GROWTH = 4;
        for (Trait trait : traits) {
            production += DEFAULT_GROWTH;
            trait.process();
        }
    }

    public int produce() {
        System.out.println(this.toString() + " producing " + production);
        return production;
    }

}
