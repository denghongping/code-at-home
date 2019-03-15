package com.expedia.interview.ex1;

public class Exercise1 {

    /**
     * At minutes == 0 use "o'clock"
     * For 1 <= minutes <= 30 use "past"
     * For 30 < minutes use "to".
     * The word "minute(s)" can be singular or plural.
     *
     * @param h
     * @param m
     * @return
     */
    String timeInWords(int h, int m) {

        String[] words = {
                "", "one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine", "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
                "nineteen", "twenty", "twenty one", "twenty two", "twenty three",
                "twenty four", "twenty five", "twenty six", "twenty seven",
                "twenty eight", "twenty nine"
        }

        String result = "";

        if (m == 0) {
            result = words[h] + " o'clock";
        } else if (m == 15) {
            result = "quarter past " + words[h];
        } else if (m == 30) {
            result = "half past " + words[h];
        } else if (m == 45) {
            result = "quarter to " + words[h + 1];
        } else if (m == 1) {
            result = "one minute past " + words[h];
        } else if (m < 30) {
            result = words[m] + " minutes past " + words[h];
        } else {
            result = words[60 - m] + " minutes to " + words[h + 1];
        }
        return result;
    }
}