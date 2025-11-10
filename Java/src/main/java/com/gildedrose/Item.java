package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void update() {
        boolean isAgedBrie = name.equals("Aged Brie");
        boolean isBackstagePass = name.equals("Backstage passes to a TAFKAL80ETC concert");
        boolean isSulfuras = name.equals("Sulfuras, Hand of Ragnaros");

        if (isAgedBrie) {
            increaseQuality();

            decreaseSellIn();

            if (sellIn < 0) {
                increaseQuality();
            }
        } else if (isBackstagePass) {
            if (quality < 50) {
                quality = quality + 1;

                if (sellIn < 11) {
                    increaseQuality();
                }

                if (sellIn < 6) {
                    increaseQuality();
                }
            }

            decreaseSellIn();

            if (sellIn < 0) {
                quality = 0;
            }
        } else if  (isSulfuras) {
            // does nothing
        } else {
            decreaseQuality();

            decreaseSellIn();

            if (sellIn < 0) {
                decreaseQuality();
            }
        }
    }

    private void increaseQuality() {
        if (quality < 50) {
            quality++;
        }
    }

    private void decreaseQuality() {
        if (quality > 0) {
            quality--;
        }
    }

    private void decreaseSellIn() {
        sellIn--;
    }

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
