/*
package com.bcv.lessons.JavaIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkWithFileSample {
    private static WorkWithFileSample fileSample;

    private WorkWithFileSample() {
    }

    public static void main(String[] args) {
        WorkWithFileSample sample = WorkWithFileSample.getInstance();
        try {
            File simpleFile = sample.getFile("java1009.txt");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public static WorkWithFileSample getInstance() {
        if (fileSample == null) {
            fileSample = new WorkWithFileSample();
            return fileSample;
        } else {
            return fileSample;
        }
    }

    private File getFile() throws IOException {
        File file = new File("java1009.txt");
        checkAndCreate(file);
        return file;
    }

    public static void checkAndCreate(File file) throws IOException {
        if (file.exists()) {
            System.out.println("File exists");

        } else {
            file.createNewFile();
            System.out.println("File was created");

        }
    }

    private static void writeBullshit(String bullShit, File file) {
        System.out.println("START writeBullshit()");
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            byte[] bullshitInBytes = bullShit.getBytes();
        } catch (IOException e) {

        }
        System.out.println("END writeBullshit()");
    }

    private static String readBullshit(File file) {
        System.out.println("S");
    }


}
*/
