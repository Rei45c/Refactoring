package com.gildedrose;

import com.gildedrose.DayThreshold;

public class SellState {

    private int sellIn;
    private int quality;

    public SellState(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void increaseQuality() {
        if (quality < 50) quality++;
    }

    public void decreaseQuality() {
        if (quality > 0) quality--;
    }

    public void setQualityNull() {
        quality = 0;
    }

    public void decreaseSellIn() {
        sellIn--;
    }

    public boolean sellInLessThan(DayThreshold threshold) {
        return sellIn < threshold.getDays();
    }

    @Override
    public String toString() {
        return sellIn + ", " + quality;
    }
}
