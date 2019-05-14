package com.bcv.epam.practice3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part6 {
    private static final String FILE_NAME = "part6.txt";

    public static void main(String[] args) {
        String input = Util.readFile(FILE_NAME);
        System.out.println(input);
        System.out.println(convert(input));
    }

    public static String convert(String input) {
        Matcher m = Pattern.compile("(?Us)\\b(\\w+?)\\b(?=.+?\\b\\1\\b)").matcher(input);
        StringBuffer duplicates = new StringBuffer();
        while (m.find()) {
            duplicates.append(m.group()).append(' ');
        }

        StringBuilder unique = new StringBuilder();
        m = Pattern.compile("(?U)\\b(\\w+?)\\b(?!.+?\\b\\1\\b)").matcher(duplicates);
        while (m.find()) {
            unique.append(m.group()).append('|');
        }
        if (unique.length() > 0) {
            unique.deleteCharAt(unique.length() - 1);
        }

        m = Pattern.compile("(?Us)\\b(" + unique + ")\\b").matcher(input);
        StringBuffer res = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(res, '_' + m.group());
        }
        m.appendTail(res);
        return res.toString();
    }

}
