package com.example.dante.dantecolorlib.main;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by dante on 2016/9/30.
 */

public class HashBagTest {
    private HashBag<Integer> mHashBag;

    @Before
    public void setupHashBag() {
        mHashBag = new HashBag<>();
    }

    @Test
    public void testSizeIsCorrect() {
        // Arrange.
        int size = 0;
        mHashBag.add(1);
        size++;
        mHashBag.add(1);
        size++;
        mHashBag.add(1);
        size++;
        mHashBag.add(2);
        size++;
        mHashBag.add(2);
        size++;
        mHashBag.add(3);
        size++;

        // Act.
        int getSize = mHashBag.getSize();

        // Assert.
        assertThat(getSize).isEqualTo(size);
    }

    @Test
    public void testGetValueCountIsCorrect() {
        // Arrange.
        int value1 = 1;
        int value2 = 2;
        int value3 = 3;
        int value1Count = 0;
        int value2Count = 0;
        int value3Count = 0;

        mHashBag.add(value1);
        value1Count++;
        mHashBag.add(value1);
        value1Count++;
        mHashBag.add(value1);
        value1Count++;

        mHashBag.add(value2);
        value2Count++;
        mHashBag.add(value2);
        value2Count++;

        mHashBag.add(value3);
        value3Count++;

        // Act.
        int count1 = mHashBag.getValueCount(value1);
        int count2 = mHashBag.getValueCount(value2);
        int count3 = mHashBag.getValueCount(value3);

        // Assert.
        assertThat(count1).isEqualTo(value1Count);
        assertThat(count2).isEqualTo(value2Count);
        assertThat(count3).isEqualTo(value3Count);
    }

    @Test
    public void testGetMaxCountValueIsCorrect() {
        // Arrange.
        int maxCountValue = 1; // Must be added max count.
        mHashBag.add(maxCountValue);
        mHashBag.add(maxCountValue);
        mHashBag.add(maxCountValue);
        mHashBag.add(2);
        mHashBag.add(2);
        mHashBag.add(3);

        // Act.
        int getMaxCountValueCount = mHashBag.getMaxCountValue();

        // Assert.
        assertThat(getMaxCountValueCount).isEqualTo(maxCountValue);
    }
}
