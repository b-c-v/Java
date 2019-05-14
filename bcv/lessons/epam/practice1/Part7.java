package com.bcv.lessons.epam.practice1;

public class Part7 {
    private static final int CON = 64;
    private static final int LETTERS_QUANTITY = 26;

    public static int str2int(String number) {

        int res = 0;
        for (int i = 0, j = number.length() - 1; i < number.length(); i++, j--) {
            res += (number.charAt(j) - CON) * Math.pow(LETTERS_QUANTITY, i);
        }
        return res;
    }

    public static String int2str(int number) {
        StringBuilder chars = new StringBuilder();
        StringBuilder charsMirror = new StringBuilder();
        int modul;
        int divident = number;
        while (divident != 0) {
            modul = divident % LETTERS_QUANTITY;
            if (modul == 0) {
                chars.append("Z");
                divident = (divident - 1) / LETTERS_QUANTITY;
            } else {
                chars.append((char) (modul + CON));
                divident = (divident - modul) / LETTERS_QUANTITY;
            }
        }
        for (int i = 0; i < chars.length(); i++) {
            int index = chars.length() - i - 1;
            charsMirror.append(chars.charAt(index));
        }
        return charsMirror.toString();
    }

    public static String rightColumn(String number) {
        String chars = "";
        int num;
        num = str2int(number);
        num++;
        chars = int2str(num);
        return chars;
    }

    public static void main(String[] args) {
        String arrow = " ==> ";
        final int letterAa = 27;
        final int letterAz = 52;
        final int letterBa = 53;
        final int letterZz = 702;
        final int letterAaa = 703;
        System.out.println("A" + arrow + str2int("A") + arrow + int2str(1));
        System.out.println("B" + arrow + str2int("B") + arrow + int2str(2));
        System.out.println("Z" + arrow + str2int("Z") + arrow + int2str(LETTERS_QUANTITY));
        System.out.println("AA" + arrow + str2int("AA") + arrow + int2str(letterAa));
        System.out.println("AZ" + arrow + str2int("AZ") + arrow + int2str(letterAz));
        System.out.println("BA" + arrow + str2int("BA") + arrow + int2str(letterBa));
        System.out.println("ZZ" + arrow + str2int("ZZ") + arrow + int2str(letterZz));
        System.out.println("AAA" + arrow + str2int("AAA") + arrow + int2str(letterAaa));
    }
}
