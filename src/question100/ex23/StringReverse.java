package question100.ex23;

public class StringReverse {
    public String getStringReverse(String n) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] arr = n.split("");

        int len = arr.length;

        for (int i=0; i<len; i++) {
            stringBuilder.append(arr[(len-1)-i]);
        }

        return stringBuilder.toString();
    }
}
