package question100.ex22;

public class Main {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.getPalindrome("1123443211");
        System.out.println("==> Palindrome : " + result);
    }
}
