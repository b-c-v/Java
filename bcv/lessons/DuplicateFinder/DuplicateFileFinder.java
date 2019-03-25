package com.bcv.lessons.DuplicateFinder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DuplicateFileFinder {
    static int compare(File f1, File f2) throws IOException {
        try (FileInputStream first = new FileInputStream(f1);
                FileInputStream second=new FileInputStream(f2)){
            while (true) {
                int b1 = first.read();
                int b2 = second.read();
                if (b1 == -1 && b2 == -1) {
                    return 0;
                }
                if (b1 != b2) return b1 - b2;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        int a = compare(new File("./src/com/bcv/lessons/DuplicateFinder/Dup.txt"), new File("./src/com/bcv/lessons/DuplicateFinder/Dup1.txt"));
        System.out.println(a);
    }
}
