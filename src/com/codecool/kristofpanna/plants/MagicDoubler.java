package com.codecool.kristofpanna.plants;

public class MagicDoubler extends Trait {

    public MagicDoubler(Plant plant) {
        super(plant);
    }

    @Override
    void process() {
        if (plant.production < 40) {
            plant.production = plant.production * 2;
        }
    }
}
