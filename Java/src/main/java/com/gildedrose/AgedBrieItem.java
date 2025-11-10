package com.gildedrose;

import com.gildedrose.DayThreshold;

public class AgedBrieItem extends Item {

    public AgedBrieItem(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void update() {
        increaseQuality();

        decreaseSellIn();

        if (sellInLessThan(DayThreshold.NULL_DAYS)) {
            increaseQuality();
        }
    }
}
