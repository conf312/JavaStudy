package question100.ex2;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int result[] = fibonacci.getFibonacci(10);

        for (int f : result) {
            System.out.print(f + " -> ");
        }
    }
}
