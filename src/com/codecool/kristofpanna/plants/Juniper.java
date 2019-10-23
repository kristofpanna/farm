package com.codecool.kristofpanna.plants;

public class Juniper extends Plant {

    public Juniper() {
        production = 14;
        traits.add(new Evergreen(this));
    }

    @Override
    public String toString() {
        return "Juniper";
    }
}
