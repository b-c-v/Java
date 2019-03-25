package com.bcv.lessons;

public class BigLettersInSentence {
    public static void main(String[] args) {
        String in = "это строка в которой каждое слово с маленькой буквы";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < in.length(); i++) {
            String c = in.substring(i, i + 1); //код не будет работать если сделать ++i, т.к. получает что мы переопределяем значение i и постоянно работаем с одним символом в следующей итерации
            if (i == 0 || in.charAt(i - 1) == ' ') {
                c = c.toUpperCase();
            } else {
                c = c.toLowerCase();
            }
            sb.append(c);
        }
        System.out.println(sb);
    }
}
