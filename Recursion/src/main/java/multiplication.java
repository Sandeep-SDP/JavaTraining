public class multiplication {
    public static void multiply(int N, int i){
        if (i > 10)
        return;

        System.out.println(N + " * " + i + " = " + N * i);
        multiply(N,i+1);
    }

    public static void main(String[] args) {
        int N = 12;
        multiply(N, 1);
    }
}
