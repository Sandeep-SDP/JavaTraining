package loops;

import java.util.Scanner;

public class greetWithName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many times do you want to repeat the program?");
        int M = in.nextInt();
        for (int i = 1; i <= M; i++) {
            Scanner obj = new Scanner(System.in);
            System.out.println("How many times do you want to greet : ");
            int N = obj.nextInt();

            String name;
            Scanner nameObj = new Scanner(System.in);
            System.out.println("What is the name Of the person you want to greet?");
            name = nameObj.next();

            for (int j = 1; j <= N; j++) {
                System.out.println("Hello " + name);
            }
        }
    }
}
