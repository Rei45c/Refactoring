package com.gildedrose;

import com.gildedrose.DayThreshold;

public class BackstagePassItem extends Item {

    public BackstagePassItem(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void update() {
        state.increaseQuality();
        if (state.sellInLessThan(DayThreshold.ELEVEN_DAYS)) state.increaseQuality();
        if (state.sellInLessThan(DayThreshold.SIX_DAYS)) state.increaseQuality();

        state.decreaseSellIn();

        if (state.sellInLessThan(DayThreshold.NULL_DAYS)) {
            state.setQualityNull();
        }
    }
}
