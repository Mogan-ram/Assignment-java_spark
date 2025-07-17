package com.revature.day04;

public class InvalidDeposit extends RuntimeException {
    public InvalidDeposit(String message) {
        super(message);
    }
}
