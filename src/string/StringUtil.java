package string;

public class StringUtil {

    private static String compressionString(String str) {
        String newStr = compression(str);
        return newStr.length() >= str.length() ? str : newStr;
    }

    private static String compression(String str) {
        String newStr = "";
        int count = 0;

        for (int i=0; i < str.length(); i++) {
            count++;
            if (str.length() == i+1 || str.charAt(i) != str.charAt(i + 1)) {
                newStr += String.valueOf(str.charAt(i)) + count;
                count = 0;
            }
        }

        return newStr;
    }

    public static void main(String[] args) {
        System.out.println("compressionString : " + compressionString("aaaabbbccccd"));
    }
}
