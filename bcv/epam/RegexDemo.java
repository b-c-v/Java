package com.bcv.epam;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    private static String load(String fileName) throws IOException {
        StringBuilder res = new StringBuilder();
        Scanner s = new Scanner(new File(fileName));
        while (s.hasNextLine()) {
            res.append(
                    s.nextLine()).append(System.lineSeparator());
        }
        s.close();
        return res.toString().trim();
    }

    public static void main(String[] args) throws IOException {
        String input = load("input.txt");
        System.out.println(input);
        System.out.println("~~~");
        String regex;

//       regex = "[a-z][a-b[m-r]]ov."; //anov  anov@ trov  trov@
        /* \w: Словообразующий символ. Эквивалентно [a-zA-Z_0-9] встречающийся {4} раза */
//        regex = "\\w{4}"; //ivan ivan ivan mail petr petr petr gmai lenn john lenn live
//        regex = "\\w.ov"; //anov anov trov trov
//        regex = "\\n[a-z]";
//        regex = "[a-z&&[d-f]] == d,e,f
//        regex = "[a-f%%[^a-c]&&[^e]] == d,f


        regex = "(?U)(\\W)*(\\S)";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);

        while (m.find()) {
            System.out.print(m.group());
        }
    }
}
