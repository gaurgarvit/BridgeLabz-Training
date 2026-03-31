package org.example.model;

import java.util.Objects;

public class Contact {

    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String phone;

    public Contact(String firstName, String lastName,
                   String city, String state, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.phone = phone;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getPhone() { return phone; }

    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }

    // Duplicate check based on firstName
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contact)) return false;
        Contact c = (Contact) obj;
        return firstName.equalsIgnoreCase(c.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName.toLowerCase());
    }

    @Override
    public String toString() {
        return firstName + " " + lastName +
                " | " + city + " | " + state +
                " | " + phone;
    }
}

