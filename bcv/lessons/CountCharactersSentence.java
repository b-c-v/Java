package com.bcv.lessons;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountCharactersSentence {


    public static void main(String[] args) {
        String sentence = "Java сильно типизированный объектно-ориентированный язык программирования".toLowerCase();

        HashMap<Character, Integer> sentenceHashMap = new HashMap<>(); //несортированный массив работает 3 мс
        TreeMap<Character, Integer> sentenceTreeMap = new TreeMap<>(); //сортированный массив работает значительно дольше - 19 мс
        long t1 = System.currentTimeMillis();
        myMap(sentence, sentenceHashMap);
        long t2 = System.currentTimeMillis();
        myMap(sentence, sentenceTreeMap);
        long t3 = System.currentTimeMillis();
        System.out.println("HashMap " + (t2 - t1) + " TreeMap " + (t3 - t2));

    }


    static void myMap(String sentence, Map sentenceMap) {
        for (int i = 0; i < sentence.length(); i++) {
            char k = sentence.charAt(i);
            if (!sentenceMap.containsKey(k)) {
                sentenceMap.put(k, 1);
            } else {
                int oldValue = (int) sentenceMap.get(k); //возвращает int значение, которое соответствует данному ключу
                sentenceMap.put(k, ++oldValue);
            }
        }
        System.out.println(sentenceMap);
    }

}
