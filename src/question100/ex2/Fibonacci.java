package question100.ex2;

public class Fibonacci {
    // An = An-1 + An-2
    // 1 1 2 3 5 8 13
    public int[] getFibonacci(int param) {
        int[] arr = new int[param];
        arr[0] = 1;
        arr[1] = 1;

        for (int i=2; i<arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr;
    }


}
