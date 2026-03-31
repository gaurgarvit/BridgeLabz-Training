package org.example;

public class UserRegistration {
    public void registerUser(String username, String email, String password) {
        // validating that no fields are null or empty
        if (username == null || username.isEmpty() ||
                email == null || email.isEmpty() ||
                password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Invalid input provided");
        }

        // simulating successful registration logic here
        System.out.println("User registered: " + username);
    }
}