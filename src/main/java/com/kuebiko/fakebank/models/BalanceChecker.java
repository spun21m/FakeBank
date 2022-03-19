package com.kuebiko.fakebank.models;

public class BalanceChecker {

    private String firstName;
    private String lastName;
    private float accountNumber;

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

    public float getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(float accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "BalanceChecker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
