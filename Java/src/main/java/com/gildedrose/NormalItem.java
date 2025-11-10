package com.gildedrose;

import com.gildedrose.DayThreshold;

public class NormalItem extends Item {

    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        state.decreaseQuality();
        state.decreaseSellIn();
        if (state.sellInLessThan(DayThreshold.NULL_DAYS)) {
            state.decreaseQuality();
        }
    }
}
