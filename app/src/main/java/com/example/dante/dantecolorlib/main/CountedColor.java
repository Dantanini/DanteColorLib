package com.example.dante.dantecolorlib.main;

/**
 * Created by dante on 2016/9/30.
 */
public class CountedColor implements Comparable<CountedColor> {
    private final int mColor;
    private final int mCount;

    /**
     * Create a CountedColor.
     *
     * @param color Color value.
     * @param count How many this color be counted in some list.
     */
    public CountedColor(int color, int count) {
        mColor = color;
        mCount = count;
    }

    @Override
    public int compareTo(CountedColor another) {
        return getCount() < another.getCount() ? -1 : (getCount() == another.getCount() ? 0 : 1);
    }

    public int getCount() {
        return mCount;
    }

    public int getColor() {
        return mColor;
    }
}
