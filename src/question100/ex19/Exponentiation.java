package question100.ex19;

public class Exponentiation {
    public int getExponentiation(int n, int m) {
        if (m == 0) return 1;
        return n * getExponentiation(n, m-1);
    }
}
