package com.example.dante.dantecolorlib.utils;

import android.graphics.Bitmap;

import org.junit.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.Mockito.when;

/**
 * Created by dante on 2016/9/30.
 */
//Must be follow 3a format.
// Arrange.
// Act.
// Assert.
public class ColorUtilTest {
    @Test
    public void testGetPrimaryColorIsCorrect() {
        // Arrange.
        int color1 = 0xFFFF6663;
        int color2 = 0xFFFF6665;
        int maxCountColor = 0xFFFF6666;
        Bitmap bitmap = Mockito.mock(Bitmap.class);
        when(bitmap.getPixel(0, 0)).thenReturn(color1);
        when(bitmap.getPixel(0, 1)).thenReturn(color2);
        when(bitmap.getPixel(0, 2)).thenReturn(color2);
        when(bitmap.getPixel(0, 3)).thenReturn(maxCountColor);
        when(bitmap.getPixel(0, 4)).thenReturn(maxCountColor);
        when(bitmap.getPixel(0, 5)).thenReturn(maxCountColor);

        // Bitmap's range is (0, 0) -> (0, 5).
        when(bitmap.getWidth()).thenReturn(1);
        when(bitmap.getHeight()).thenReturn(6);

        // Act.
        int primaryColor = ColorUtil.getPrimaryColor(bitmap);

        // Assert.
        assertThat(primaryColor).isEqualTo(maxCountColor);
    }
}
