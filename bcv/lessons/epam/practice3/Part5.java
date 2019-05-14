package com.bcv.lessons.epam.practice3;

public class Part5 {
    private static final String[] ROMAN =
            new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] ARAB =
            new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static void main(String[] args) {
        final int number = 100;
        for (int j = 1; j <= number; j++) {
            String roman = decimal2Roman(j);
            int decimal = roman2Decimal(roman);
            System.out.printf("%d --> %s --> %d%n", j, roman, decimal);
        }
    }

    public static int roman2Decimal(String s) {
        StringBuilder sb = new StringBuilder(s);

        int arab = 0;
        int number = 0;
        while (sb.length() != 0) {
            if (sb.indexOf(ROMAN[number]) == 0) {
                arab += ARAB[number];
                sb.delete(0, ROMAN[number].length());
                continue;
            }
            number++;
        }
        return arab;
    }

    public static String decimal2Roman(int x) {
        StringBuilder res = new StringBuilder();
        int k = 0;
        while (x != 0) {
            int d = x % 10;
            if ((1 <= d && d <= 3) || (5 <= d && d <= 8)) {
                for (int i = 0; i < d % 5; i++) {
                    appendRomanDigit(res, k, 0);
                }
                if (d >= 5) {
                    appendRomanDigit(res, k, 1);
                }
            }
            if (d == 4) {
                appendRomanDigit(res, k, 1);
                appendRomanDigit(res, k, 0);
            }
            if (d == 9) {
                appendRomanDigit(res, k, 2);
                appendRomanDigit(res, k, 0);
            }
            x /= 10;
            k++;
        }
        return res.reverse().toString();
    }

    private static void appendRomanDigit(StringBuilder sb, int k, int delta) {
        sb.append("IVXLCDM".charAt(2 * k + delta));
    }


}
