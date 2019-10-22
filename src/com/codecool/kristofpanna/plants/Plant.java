package com.codecool.kristofpanna.plants;

import java.util.List;

public abstract class Plant {
    protected List<Trait> traits;

    // package-private -> Trait can modify these
    int actualProduction;
    int monthlyProduction;

    public void grow() {
        // TODO
        System.out.println(this.getClass().getName() + " growing...");
    }

    public int produce(){
        return actualProduction;
    }

}
