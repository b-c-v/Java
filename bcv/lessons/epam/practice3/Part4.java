package com.bcv.lessons.epam.practice3;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Part4 {

    public static void main(String[] args) {
            System.out.println(hash("asdf", "MD5"));
            System.out.println(hash("asdf", "SHA-256"));
    }

    public static String hash(String input, String algorithm) {

        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance(algorithm);
            digest.update(input.getBytes("Cp1251"));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        byte[] hash = new byte[0];
        if (digest != null) {
            hash = digest.digest();
        }
        char[] chars = new char[hash.length * 2];

        for (int i = 0; i < hash.length; i++) {
            toChars(hash[i], chars, i);
        }

        return new String(chars);
    }

    private static void toChars(byte b, char[] chars, int i) {
        final int upNum = 0b1111_0000;
        final int num = 16;
        int upper = b & upNum;
        upper = Math.abs(upper / num);
        chars[i * 2] = toHex(upper);
        final int loNum = 0b0000_1111;
        int lower = b & loNum;
        chars[i * 2 + 1] = toHex(lower);
    }

    private static char toHex(int a) {
        return (a < 10) ? (char) (a + '0') : (char) (a + 'A' - 10);
    }
}
