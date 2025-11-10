package com.gildedrose;

import com.gildedrose.DayThreshold;

public class BackstagePassItem extends Item {

    public BackstagePassItem(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void update() {
        increaseQuality();
        if (sellInLessThan(DayThreshold.ELEVEN_DAYS)) increaseQuality();
        if (sellInLessThan(DayThreshold.SIX_DAYS)) increaseQuality();

        decreaseSellIn();

        if (sellInLessThan(DayThreshold.NULL_DAYS)) {
            quality = 0;
        }
    }
}
