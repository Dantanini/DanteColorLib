package com.example.dante.dantecolorlib.main;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by dante on 2016/9/30.
 */
//Must be follow 3a format.
// Arrange.
// Act.
// Assert.
public class CountedColorTest {
    @Test
    public void testGetColorIsRight() {
        // Arrange.
        int color = 123;
        int colorCount = 1;
        CountedColor countedColor = new CountedColor(color, colorCount);

        // Act.
        int getColor = countedColor.getColor();

        // Assert.
        assertThat(getColor).isEqualTo(color);
    }

    @Test
    public void testGetColorCountIsRight() {
        // Arrange.
        int color = 123;
        int colorCount = 1;
        CountedColor countedColor = new CountedColor(color, colorCount);

        // Act.
        int getCount = countedColor.getCount();

        // Assert.
        assertThat(getCount).isEqualTo(colorCount);
    }
}
