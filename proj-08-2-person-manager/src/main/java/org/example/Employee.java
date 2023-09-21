package org.example;

public class Employee extends Person {

    private String Ssn;

    public Employee(String first, String last, String ssn) {
        super(first, last);
        Ssn = ssn;
    }

    public String getSsn() {
        return "xxx-xx-" + Ssn.substring(Ssn.length() - 4);
    }

    public void setSsn(String Ssn) {
        this.Ssn = Ssn;
    }

    @Override
    public String toString() {
        String name = super.toString();
        return name + "\n" + "SSN: " + getSsn();
    }

}
