package question100.ex6;

public class Main {
    public static void main(String[] args) {
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();
        System.out.println("==> GCD Result : " + gcd.getGCD(12,18));
        System.out.println("==> GCD Result : " + gcd.getEuclid(12,18));
    }
}
