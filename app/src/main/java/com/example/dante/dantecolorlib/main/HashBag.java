package com.example.dante.dantecolorlib.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by dante on 2016/9/30.
 */
public class HashBag<K> extends HashMap<K, Integer> {
    public HashBag() {
        super();
    }

    public int getSize() {
        int size = 0;
        for (int v : values()) {
            size += v;
        }
        return size;
    }

    public int getValueCount(K value) {
        if (get(value) == null) {
            return 0;
        } else {
            return get(value);
        }
    }

    public void add(K value) {
        if (get(value) == null) {
            put(value, 1);
        } else {
            put(value, get(value) + 1);
        }
    }

    public K getMaxCountValue() {
        ArrayList<Integer> values = new ArrayList<>();
        values.addAll(values());
        int maxCount = Collections.max(values);
        for (K o : keySet()) {
            if (get(o) == maxCount) {
                return o;
            }
        }
        return null;
    }

    public Iterator<K> iterator() {
        return keySet().iterator();
    }
}
