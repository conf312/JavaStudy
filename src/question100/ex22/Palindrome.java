package question100.ex22;

public class Palindrome {
    public boolean getPalindrome(String n) {
        boolean result = true;
        String[] arr = n.split("");

        int len = arr.length;

        for (int i=0; i<len / 2; i++) {
            if (!arr[i].equals(arr[(len-1)-i])) {
                result = false;
                break;
            }
        }

        return result;
    }

}
