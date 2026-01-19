package org.example;

public class StringUtils {
    public String reverse(String str) {
        if (str == null) return null;

        return new StringBuilder(str).reverse().toString();
    }

    public boolean isPalindrome(String str) {
        if (str == null) return false;

        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public String toUpperCase(String str) {
        return (str == null) ? null : str.toUpperCase();
    }
}