package org.example.Day05.regex.advancedproblems.validatecreditcardnumber;


import static org.example.Day05.regex.advancedproblems.validatecreditcardnumber.ValidateCreditCardNumber.validateCardNumber;

public class Main {

    public static void main(String[] args) {
        String cardNumber = "40298504050902958";
        if (validateCardNumber(cardNumber)) {
            System.out.println("Valid card number.");
        } else {
            System.out.println("Invalid card number.");
        }
    }
}

