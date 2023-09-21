package org.example;

public class Customer extends Person{

    private String customerNumber;
    public Customer(String first, String last, String number) {
        super(first, last);
        customerNumber = number;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    public String toString() {
        String name = super.toString();
        return name + "\n" + "Customer Number: " + customerNumber.toUpperCase() + "\n";
    }
}
