package com.atmmachine;

import java.util.Scanner;

class ATM {

    float balance;
    int PIN = 5678;

    public void checkPin() {
        System.out.println("Enter Your PIN: ");
        Scanner sc = new Scanner(System.in);
        int enterPin = sc.nextInt();
        if(enterPin == PIN) {
            menu();
        } else {
            System.out.println("Enter a Valid PIN: ");
            menu();
        }
    }

    public void menu() {
        System.out.println("Enter your choice: ");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Deposit Amount");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if(option == 1) {
            checkBalance();
        } else if(option == 2) {
            withdrawAmount();
        } else if(option == 3) {
            depositAmount();
        } else if(option == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice");
            menu();
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
        menu();
    }

    public void withdrawAmount() {
        System.out.println("Enter Amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Collect Money");
        }
        menu();
    }

    public void depositAmount() {
        System.out.println("Enter the amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance += amount;
        System.out.println("Money deposited successfully");
        menu();
    }
}
public class Main {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();
//        System.out.println("Hello, World!");
    }
}