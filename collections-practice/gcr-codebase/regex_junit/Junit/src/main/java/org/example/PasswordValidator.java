package org.example;

public class PasswordValidator {
    public boolean isValid(String password) {
        if (password == null) return false;

        // checking if password meets all criteria using regex
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*\\d.*");
    }
}