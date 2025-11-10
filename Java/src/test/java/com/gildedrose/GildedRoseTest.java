package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new NormalItem("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].getName());
    }

    @Test
    void agedBrieIncreasesQuality() {
        Item[] items = new Item[] { new AgedBrieItem(2, 0) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(1, app.items[0].getState().getQuality());
        assertEquals(1, app.items[0].getState().getSellIn());
    }

    @Test
    void backstagePassesIncreaseAndDrop() {
        Item[] items = new Item[] {
            new BackstagePassItem(15, 20),
            new BackstagePassItem(10, 45),
            new BackstagePassItem(5, 45)
        };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(21, app.items[0].getState().getQuality()); // sellIn > 10
        assertEquals(47, app.items[1].getState().getQuality()); // 10 >= sellIn > 5
        assertEquals(48, app.items[2].getState().getQuality()); // sellIn <= 5
    }

    @Test
    void sulfurasNeverChanges() {
        Item[] items = new Item[] { new SulfurasItem(0, 80) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(80, app.items[0].getState().getQuality());
        assertEquals(0, app.items[0].getState().getSellIn());
    }

}
