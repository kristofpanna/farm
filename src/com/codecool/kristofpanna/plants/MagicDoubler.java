package com.codecool.kristofpanna.plants;

class MagicDoubler extends Trait {

    MagicDoubler(Plant plant) {
        super(plant);
    }

    @Override
    void process() {
        if (plant.production < 40) {
            plant.production = plant.production * 2;
            System.out.println("Double Power!");
        }
    }
}
