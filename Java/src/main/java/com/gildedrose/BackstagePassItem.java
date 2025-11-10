package com.gildedrose;

public class BackstagePassItem extends Item {

    public BackstagePassItem(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void update() {
        increaseQuality();
        if (sellIn < 11) increaseQuality();
        if (sellIn < 6) increaseQuality();

        decreaseSellIn();

        if (isExpired()) {
            quality = 0;
        }
    }
}
