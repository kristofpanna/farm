package com.codecool.kristofpanna.plants;

public class Almond extends Plant {

    public Almond() {
        production = 50;
        traits.add(new MagicDoubler(this));
    }
}
