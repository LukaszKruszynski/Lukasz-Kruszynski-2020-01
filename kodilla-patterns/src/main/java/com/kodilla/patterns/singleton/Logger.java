package com.kodilla.patterns.singleton;

import sun.rmi.runtime.Log;

public class Logger {
    private String lastLog = "";
    private static Logger loggerInstance = null;

    private Logger() {
    }

    public static Logger getLoggerInstance() {
        if(loggerInstance == null) {
            synchronized (Logger.class) {
                if (loggerInstance == null) {
                    loggerInstance = new Logger();
                }
            }
        }
        return loggerInstance;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}