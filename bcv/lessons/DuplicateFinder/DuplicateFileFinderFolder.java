package com.bcv.lessons.DuplicateFinder;

import java.io.*;
import java.util.*;

public class DuplicateFileFinderFolder {
    static int compareFiles(File f1, File f2) throws IOException {
        try (BufferedInputStream first = new BufferedInputStream(new FileInputStream(f1));
             BufferedInputStream second = new BufferedInputStream(new FileInputStream(f2))) {
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

    public static ArrayList<File> getAllFiles(File f) {
        ArrayList<File> files = new ArrayList<>();
        File[] folders = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
        for (File folder : folders) {
            files.addAll(getAllFiles(folder));
        }
        File[] files1 = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        });
        files.addAll(Arrays.asList(files1));
        return files;

    }

    public static void main(String[] args) {
        List<File> files = getAllFiles(new File("d:\\Downloads\\photo_welding\\"));
        TreeSet<File> ts = new TreeSet<>(new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                try {
                    return compareFiles(o1, o2);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        });
        try {
            for (File f : files) {
                if (!ts.contains(f)) {
                    ts.add(f);
                } else {
                    File old = ts.floor(f);
                    System.out.println("File " + f + " duplicate " + old);
                }
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}

