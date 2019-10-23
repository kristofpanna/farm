package com.codecool.kristofpanna.plants;

import com.codecool.kristofpanna.utils.Randomize;

class ShroomGrower extends Trait {

    private int shroomBoostChancePercent;
    private int shroomBoostAmount;
    private int rotChancePercent;
    private int rotReduceAmount;

    ShroomGrower(Plant plant,
                        int shroomChancePercent, int shroomBoostAmount,
                        int rotChancePercent, int rotReduceAmount) {
        super(plant);
        this.shroomBoostChancePercent = shroomChancePercent;
        this.shroomBoostAmount = shroomBoostAmount;
        this.rotChancePercent = rotChancePercent;
        this.rotReduceAmount = rotReduceAmount;
    }

    @Override
    void process() {
        GrowShroom();
        Rot();
    }

    private void GrowShroom() {
        if (Randomize.eventWithChanceInPercent(shroomBoostChancePercent)) {
            plant.production += shroomBoostAmount;
            System.out.println("Shrooom boost!");
        }
    }

    private void Rot() {
        if (Randomize.eventWithChanceInPercent(rotChancePercent)) {
            plant.production -= rotReduceAmount;
            plant.rotten = true;
        } else {
            plant.rotten = false;
        }
    }
}
