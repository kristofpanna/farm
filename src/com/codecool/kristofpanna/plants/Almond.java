package com.codecool.kristofpanna.plants;

public class Almond extends Plant {

    public Almond() {
        production = 50;
        traits.add(new ShroomGrower(this, 8, 10, 13, 18));
        traits.add(new MagicDoubler(this));
    }
}
