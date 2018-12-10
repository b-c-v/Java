package com.bcv.lessons.JavaIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropertiesSample {
    public static void main(String[] args) {
        Properties properties = new Properties();
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("config.properties");
            properties.load(inputStream);
            System.out.println(properties.getProperty("dbname"));
            System.out.println(properties.getProperty("dbuser"));
            System.out.println("dbpass");

        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if
            (inputStream != null) {
                try {
                    inputStream.close();

                } catch (IOException io) {
                    io.printStackTrace();
                }
            }

        }
    }
}
