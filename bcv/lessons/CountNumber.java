package com.bcv.lessons;


import sun.reflect.generics.tree.Tree;

import java.util.*;

public class CountNumber {


    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));

        Map<Integer, Integer> map = new TreeMap<>();
        fillMap(arr, map);
        TreeMap<Integer, Integer> map1 = new TreeMap<>();
        countMethod(arr, map1);

        TreeMap<Integer, Integer> reverseMap = new TreeMap<>(new ReverseCompare());
        fillMap(arr, reverseMap);
        System.out.println("reverse" + reverseMap);
    }

    //create and fill map with numbers from massive
    static void fillMap(int[] arr, Map map) {
        for (int j = 0; j < arr.length; j++) {
            map.put(j, arr[j]);
        }
        System.out.println("fill: " + map);
    }

    //count quantity of numbers in map
    static void countMethod(int[] arr, Map map) {
        for (int val : arr) {
            Integer integer = (Integer) map.get(val);

            if (integer == null) {
                map.put(val, 1);
            } else {
                map.put(val, integer + 1);
            }
        }
        System.out.println("count: " + map);
        System.out.print(map.keySet());
    }
}

class ReverseCompare implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        int i1 = (int) o1;
        int i2 = (int) o2;
        return i2 - i1;
    }
}

