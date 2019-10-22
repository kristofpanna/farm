package com.codecool.kristofpanna;

import com.codecool.kristofpanna.plants.Almond;
import com.codecool.kristofpanna.plants.Juniper;
import com.codecool.kristofpanna.plants.Plant;
import com.codecool.kristofpanna.plants.Spruce;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    int totalFoodProduced = 0;
    private List<Plant> plants = new ArrayList<>();

    public Farm(int almonds, int junipers, int spruces) {
        for (int i = 0; i < almonds; i++) {
            plants.add(new Almond());
        }
        for (int i = 0; i < junipers; i++) {
            plants.add(new Juniper());
        }
        for (int i = 0; i < spruces; i++) {
            plants.add(new Spruce());
        }
    }

    void advanceOneMonth() {
        for (Plant plant : plants) {
            plant.grow();
            totalFoodProduced += plant.produce();
        }
    }
}
