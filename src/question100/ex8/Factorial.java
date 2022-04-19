package question100.ex8;

public class Factorial {

    public int getFactorial(int a) {
// for example
//        int result = a;
//        for (int i=1; i<a; i++) {
//            result = result * (a-i);
//        }
//        return result;
        if (a == 1) return 1;
        return a * getFactorial(a-1);
    }
}
