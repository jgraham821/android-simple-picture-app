package com.thegrahamidentity.simplepictureapp;

/**
 * Created by graham on 11/22/15.
 */
public class PhotoCycler {
    private int[] photoIds = new int[] { R.drawable.pattern_test, R.drawable.pattern_test2 };

    private int cursor = -1;

    public int next() {
        cursor++;
        if (cursor >= photoIds.length) {
            cursor = 0;
        }

        return photoIds[cursor];
    }
}
