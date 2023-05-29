package MathsLogic;

import java.util.*;

public class multiplication {
    public static void multiply(int N, int i){
        if (i > 10)
        return;
        System.out.println(N + " * " + i + " = " + N * i);
        multiply(N,i+1);
    }

    public static void main(String[] args) {
        int N;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a integer digit.");
        N = in.nextInt();
        multiply(N, 1);
    }
}
