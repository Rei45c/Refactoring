package com.gildedrose;

public enum DayThreshold {
    ELEVEN_DAYS(11),
    SIX_DAYS(6),
    NULL_DAYS(0);

    private final int days;

    DayThreshold(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }
}
