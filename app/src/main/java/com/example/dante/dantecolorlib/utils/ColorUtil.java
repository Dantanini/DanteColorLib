package com.example.dante.dantecolorlib.utils;

import android.graphics.Bitmap;
import android.graphics.Color;

import com.example.dante.dantecolorlib.main.HashBag;

/**
 * Created by dante on 2016/9/30.
 */
public class ColorUtil {
    public static int getPrimaryColor(Bitmap bitmap) {
        HashBag<Integer> colors = new HashBag();
        for (int x = 0; x < bitmap.getWidth(); x++) {
            for (int y = 0; y < bitmap.getHeight(); y++) {
                int pixel = bitmap.getPixel(x, y);
                colors.add(pixel);
            }
        }
        int primaryColor = colors.getMaxCountValue();
        return primaryColor;
    }

    public static boolean isLightColor(int colorCode) {
        double r = (double) Color.red(colorCode) / 255;
        double g = (double) Color.green(colorCode) / 255;
        double b = (double) Color.blue(colorCode) / 255;

        double lum = 0.2126 * r + 0.7152 * g + 0.0722 * b;

        return lum >= 0.5;
    }
}
