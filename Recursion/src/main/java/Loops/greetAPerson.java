package Loops;

import java.util.Scanner;

public class greetAPerson {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many times to greet the person: ");
        int k = in.nextInt();
        for (int i = 1; i <= k; i++) {
            System.out.println("Hello Sandeep.");
        }
    }
}
