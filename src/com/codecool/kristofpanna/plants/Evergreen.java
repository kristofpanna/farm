package com.codecool.kristofpanna.plants;

class Evergreen extends Trait {

    private int time = 0;

    Evergreen(Plant plant) {
        super(plant);
    }

    @Override
    void process() {
        final int LEAF_GROWING_TIME= 5;
        final int LEAF_BOOST = 8;
        final int MAX_PRODUCTION = 70;

        time += 1;
        if (time % LEAF_GROWING_TIME == 0) {
            // grow leaf
            plant.production += LEAF_BOOST;
        }
        if (plant.production >= MAX_PRODUCTION) {
            plant.production = MAX_PRODUCTION;
            System.out.println(plant.toString() + " at full production!");
        }
    }
}
