package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        String capitalized = word.substring(0,1).toUpperCase();
        String restOfTheWord = word.substring(1);
        return capitalized + restOfTheWord;
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.substring(0,1) + "." + lastName.substring(0,1);
    }

    public double addVat(double originalPrice, double vatRate) {
        Double vatAmount = (vatRate/100) * originalPrice;
        return Math.round((originalPrice + vatAmount) * 100.0) / 100.0;
    }

    public String reverse(String sentence) {
        // Add your code here
        return "";
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}
