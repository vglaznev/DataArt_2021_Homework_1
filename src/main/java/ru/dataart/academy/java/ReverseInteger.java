package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber) {
        int reversedNumber = 0;
        int digit;

        while (inputNumber != 0) {
            reversedNumber *= 10;
            digit = inputNumber % 10;
            inputNumber /= 10;
            reversedNumber += digit;
        }
        return reversedNumber;
    }
}
