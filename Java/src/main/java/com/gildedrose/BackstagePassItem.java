package com.gildedrose;

public class BackstagePassItem extends Item {

    public BackstagePassItem(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void update() {
        increaseQuality();
        if (sellInLessThan(11)) increaseQuality();
        if (sellInLessThan(6)) increaseQuality();

        decreaseSellIn();

        if (sellInLessThan(0)) {
            quality = 0;
        }
    }
}
