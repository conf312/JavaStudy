package question100.ex5;

public class ReverseString {

    // 문자열 대소문자 뒤집기
    public String getReverseString(String str) {
        StringBuilder resultStr = new StringBuilder();

        int len = str.length();

        for (int i=0; i<len; i++) {
            int charIndex = str.charAt(i);
            if (charIndex > 64 && charIndex < 91) {
                resultStr.append((char)(charIndex+32));
            } else if (charIndex > 90 && charIndex < 123) {
                resultStr.append((char)(charIndex-32));
            }
        }

        return resultStr.toString();
    }
}
