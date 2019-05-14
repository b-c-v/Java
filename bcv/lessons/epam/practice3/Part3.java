package com.bcv.lessons.epam.practice3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part3 {
    private static final String FILE_NAME = "part3.txt";

    public static void main(String[] args) {

        String input = Util.readFile(FILE_NAME);
        System.out.println(Part3.convert(input));
    }


    public static String convert(String input) {
        Pattern pattern = Pattern.compile("(?Um)(.+)");
        Matcher matcher = pattern.matcher(input);
        String[] lines = {};
        while (matcher.find()) {
            lines = addToArray(matcher.group(), lines);
        }
        StringBuilder result = new StringBuilder();
        String string;
        for (String s : lines) {
            pattern = Pattern.compile("(?Um)(\\S+)");
            matcher = pattern.matcher(s);
            while (matcher.find()) {
                string = matcher.group();
                string = invert(string);
                result.append(string).append(" ");
            }
            result.deleteCharAt(result.length() - 1);
            result.append(System.lineSeparator());
        }
        return result.toString();
    }

    public static String[] addToArray(String str, String[] array) {
        if (array.length != 0) {
            String[] tmpAddToArray = new String[array.length + 1];
            System.arraycopy(array, 0, tmpAddToArray, 0, array.length);
            tmpAddToArray[array.length] = str;
            return tmpAddToArray;
        } else {
            return new String[]{str};
        }
    }

    private static String invert(String string) {
        if (string.length() > 2) {
            char[] chars = string.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '.' || chars[i] == '-' || chars[i] == '\'') {
                    if (i > 2) {
                        chars[0] = toUpperCase(chars[0]);
                    }
                    if ((chars.length - i - 1) > 2) {
                        chars[i + 1] = toUpperCase(chars[i + 1]);
                    }
                }
            }
            String result = new String(chars);
            chars[0] = validation(result, string, chars[0]);
            result = new String(chars);
            return result;
        } else {
            return string;
        }
    }

    private static char toUpperCase(char symbol) {
        char inverse = Character.toUpperCase(symbol);
        if (inverse == symbol) {
            return Character.toLowerCase(symbol);
        }
        return inverse;
    }

    private static char validation(String result, String original, char element) {
        if (result.equals(original)) {
            boolean containCharacter = false;
            for (int i = 0; i < result.length(); i++) {
                if (result.charAt(i) == '.' || result.charAt(i) == '-' || result.charAt(i) == '\'') {
                    containCharacter = true;
                    break;
                }
            }
            if (!containCharacter) {
                return toUpperCase(element);
            }
        }
        return element;
    }
}