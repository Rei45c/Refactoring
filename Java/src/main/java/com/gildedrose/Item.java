package com.gildedrose;

import com.gildedrose.DayThreshold;

public abstract class Item {

    private final String name;
    protected final SellState state;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.state = new SellState(sellIn, quality);
    }

    public String getName() {
        return name;
    }

    public SellState getState() {
        return state;
    }

    public abstract void update();

    @Override
    public String toString() {
        return name + ", " + state.toString();
    }
}
