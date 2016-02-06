package com.danielradding.crunchtime;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by daniel on 2/6/16.
 */
public class functions {
    public double convert(double num, String ex, String ex2) {

        Map<String, Double> map = new HashMap<String, Double>();
        map.put("Pushups", 350.0);
        map.put("Situps", 200.0);
        map.put("Jumping Jacks", 10.0);
        map.put("Jogging", 12.0);
        map.put("Squats", 225.0);
        map.put("Leg-lifts", 25.0);
        map.put("Planks", 25.0);
        map.put("Pullups", 100.0);
        map.put("Cycling", 12.0);
        map.put("Walking", 20.0);
        map.put("Swimming", 13.0);
        map.put("Stair-Climbing", 15.0);

//        System.out.println("Hello World");
//        System.out.println(ex);
//        System.out.println(ex2);


        double val = map.get(ex);
        double val2 = map.get(ex2);

        double rtn = val * num;
        rtn = rtn/val2;
        System.out.println("func result" + String.valueOf(rtn));
        return rtn;

    }

    public String exType(String ex) {
        Set<String> reps = new HashSet<String>();
        reps.add("Pushups");
        reps.add("Situps");
        reps.add("Squats");
        reps.add("Pullups");
        if (reps.contains(ex)) {
            return "reps of";
        }
        return "minutes of";
    }
}
