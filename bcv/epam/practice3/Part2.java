package com.bcv.epam.practice3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part2 {
    private static final String FILE_NAME = "part2.txt";

    public static void main(String[] args) {
        String input = Util.readFile(FILE_NAME);

        System.out.println(convert(input));

    }
    public static String convert(String input) {
        return getMin(input) +"\n" + getMax(input);

    }

    public static String getMin(String input) {
        StringBuilder sb = new StringBuilder();
        int count = Integer.MAX_VALUE;
        sb.append("Min: ");
        Pattern p = Pattern.compile("(?Us)\\w+");
        Matcher m = p.matcher(input);
        while (m.find()) {
            Pattern p2 = Pattern.compile(m.group());
            Matcher m2 = p2.matcher(sb.toString().substring(5));
            if (count > m.group().length()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Min: ");
                count = m.group().length();
                sb2.append(m.group());
                sb = sb2;
            } else if (count == m.group().length() && !(m2.find())) {
                sb.append(", " + m.group());

            }
        }
        return sb.toString();
    }

    public static String getMax(String input) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        sb.append("Max: ");
        Pattern p = Pattern.compile("(?Us)\\w+");
        Matcher m = p.matcher(input);
        while (m.find()) {
            Pattern p2 = Pattern.compile(m.group());
            Matcher m2 = p2.matcher(sb.toString().substring(5));
            if (count < m.group().length()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Max: ");
                count = m.group().length();
                sb2.append(m.group());
                sb = sb2;
            } else if (count == m.group().length() && !(m2.find())) {
                sb.append(", " + m.group());

            }
        }
        return sb.toString();
    }


}
