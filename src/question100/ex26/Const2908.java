package question100.ex26;

public class Const2908 {
    public int getConst(String n) {
        String[] arr = n.split(" ");

        int left = Integer.parseInt(getReverse(arr[0]));
        int right = Integer.parseInt(getReverse(arr[1]));

        if (left > right) {
            return left;
        } else {
            return right;
        }
    }

    public String getReverse(String n) {
        return new StringBuilder(n).reverse().toString();
    }
}
