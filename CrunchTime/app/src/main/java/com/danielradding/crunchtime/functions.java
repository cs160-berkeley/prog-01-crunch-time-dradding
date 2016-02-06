package com.danielradding.crunchtime;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by daniel on 2/6/16.
 */
public class functions {
    public double convert(double num, String ex, String ex2) {

        Map<String, Double> map = new HashMap<String, Double>();
        map.put("Pushup", 350.0);
        map.put("Situp", 200.0);
        map.put("Jumping Jacks", 10.0);
        map.put("Jogging", 12.0);
        map.put("Squats", 225.0);
        map.put("Leg-lift", 25.0);
        map.put("Plank", 25.0);
        map.put("Pullup", 100.0);
        map.put("Cycling", 12.0);
        map.put("Walking", 20.0);
        map.put("Swimming", 13.0);
        map.put("Stair-Climbing", 15.0);

        double val = map.get(ex);
        double val2 = map.get(ex2);

        double rtn = val * num;
        rtn = rtn/val2;
        return rtn;

    }
}
