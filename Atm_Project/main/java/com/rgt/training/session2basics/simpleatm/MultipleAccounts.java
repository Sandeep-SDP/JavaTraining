package com.rgt.training.session2basics.simpleatm;

import java.util.Scanner;

public class MultipleAccounts {

    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);
        Account currentAccount = null;
        int choice;
        while (true) {
            if (currentAccount == null) {
                System.out.println("Welcome to the ATM");
                System.out.println("1. Create Account");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter account number: ");
                        int accountNumber = scanner.nextInt();
                        System.out.println("Createaccount:" + accountNumber);
                        System.out.print("Enter PIN: ");
                        int pin = scanner.nextInt();
                        //System.out.println("Create PIN:" + pin);
                        System.out.print("Enter initial balance: ");
                        double balance = scanner.nextDouble();
                        atm.deposit(balance);
                        System.out.println("Enter balance:" + balance);
                        scanner.nextLine();
                        break;

                    case 2:
                        System.out.print("Enter account number: ");
                        int accountnumber = scanner.nextInt();
                        System.out.println("AccountNumber:" + accountnumber);
                        System.out.print("Enter PIN: ");
                        int pinNumber = scanner.nextInt();
                        //System.out.println("Create PIN:" + pinNumber);
                        if (currentAccount != null) {
                            System.out.println("Login successful!");
                            do {
                                System.out.println("Welcome to the ATM");
                                System.out.println("1. Check Balance");
                                System.out.println("2. Deposit");
                                System.out.println("3. Withdraw");
                                System.out.println("4. Exit");
                                System.out.print("Choose an option: ");
                                choice = scanner.nextInt();

                                switch (choice) {
                                    case 1:
                                        System.out.println("Current balance: $" + atm.checkBalance());
                                        break;
                                    case 2:
                                        System.out.print("Enter deposit amount: $");
                                        double depositAmount = scanner.nextDouble();
                                        atm.deposit(depositAmount);
                                        break;
                                    case 3:
                                        System.out.print("Enter withdrawal amount: $");
                                        double withdrawalAmount = scanner.nextDouble();
                                        atm.withdraw(withdrawalAmount);
                                        break;
                                    case 4:
                                        System.out.println("Goodbye!");
                                        break;
                                    default:
                                        System.out.println("Invalid option. Please try again.");
                                }
                                System.out.println();

                            } while (choice != 4);
                        } else {
                            System.out.println("Invalid account number or PIN.");
                        }
                        break;

                    case 3:
                        System.out.println("Goodbye!");
                        scanner.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }

                System.out.println();
            }
        }
    }
}
