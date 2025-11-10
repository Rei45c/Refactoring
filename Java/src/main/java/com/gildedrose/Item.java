package com.gildedrose;

public abstract class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public abstract void update();

    protected void increaseQuality() {
        if (quality < 50) {
            quality++;
        }
    }

    protected void decreaseQuality() {
        if (quality > 0) {
            quality--;
        }
    }

    protected void decreaseSellIn() {
        sellIn--;
    }

    protected boolean isExpired() {
        return sellIn < 0;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
