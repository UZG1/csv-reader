package com.vladyslavmelnikov.csvreader.functional;

import com.vladyslavmelnikov.csvreader.model.Person;

public class OutputingFunc {
    public String MinReturn(float min) {
        if (min % 1 > 0) {
            String minReturn = Integer.toString((int) (min * 100)) + "m";
            return minReturn;
        } else {
            String minReturn = Integer.toString((int)min);
            return minReturn;
        }
    }

    public String MaxReturn(float max) {
        if (max % 1 > 0) {
            String maxReturn = Integer.toString((int) (max * 100)) + "m";
            return maxReturn;
        } else {
            String maxReturn = Integer.toString((int) max);
            return maxReturn;
        }
    }

}
