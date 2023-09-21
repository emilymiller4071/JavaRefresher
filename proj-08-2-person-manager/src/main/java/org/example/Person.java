package org.example;

public class Person {

    private String firstName;
    private String lastName;

    public Person() {}
    public Person(String first, String last) {
        firstName = first;
        lastName = last;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name: " + Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1) +
                " " + Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1);
    }
}
