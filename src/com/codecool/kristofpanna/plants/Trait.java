package com.codecool.kristofpanna.plants;

abstract class Trait {
    protected Plant plant;

    public Trait(Plant plant) {
        this.plant = plant;
    }

    abstract void process();
}
