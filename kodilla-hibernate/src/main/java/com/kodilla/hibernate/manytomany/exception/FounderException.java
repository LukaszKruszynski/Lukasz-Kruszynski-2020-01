package com.kodilla.hibernate.manytomany.exception;

public class FounderException extends Exception{

    public static String ERR_VALUE_MUST_CONTAIN_AT_LEAST_ONE_CHARACTER;

    public FounderException(String message) {
        super(message);
    }
}
