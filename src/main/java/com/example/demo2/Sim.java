package com.example.demo2;

public class Sim {

    public Sim (int newAge, String newSurname, String newFirstname, double newWalletCashAmount) {
        age = newAge;
        surname = newSurname;
        firstname = newFirstname;
        walletCashAmount = newWalletCashAmount;
    }
    public void setFirstname(String newName) {
        firstname = newName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setSurname(String newSurname) {
        surname = newSurname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    public double getWalletCashAmount() {
        return walletCashAmount;
    }

    public void setWalletCashAmount(double newWalletCashAmount) {
        walletCashAmount = newWalletCashAmount;
    }

        private int age;
        private String surname;
        private String firstname;
        private double walletCashAmount;

        public String toString() {
            return "Hi! "+ surname + " " + firstname;
        }
    }

