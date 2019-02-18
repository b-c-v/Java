package com.bcv.lessons;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SampleLogger {
    private static Logger log = Logger.getLogger(SampleLogger.class.getName());
    public static void logMethod(){
        log.info("Start");
        System.out.println("Work");
        log.info("End");
    }
    private static void logException(){
        try {
            throw new Exception("Sample");

        } catch (Exception e) {
            log.log(Level.SEVERE, "Exception", e);
        }
    }
    private static void logFineLevel(){
        log.fine("some minor, debug message");
        if(log.isLoggable(Level.FINE)){
            log.fine("Some strange message");
        }
    }

    public static void main(String[] args) {
        logMethod();
        logException();
        logFineLevel();
    }
}
