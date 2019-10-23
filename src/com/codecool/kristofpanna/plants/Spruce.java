package com.codecool.kristofpanna.plants;

public class Spruce extends Plant {

    public Spruce() {
        production = 26;
        traits.add(new Evergreen(this));
    }
}
