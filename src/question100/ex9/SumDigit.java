package question100.ex9;

public class SumDigit {
    public int getSumDegit(int n) {
        int result = 0;
        String[] arr = String.valueOf(n).split("");

        for (String s : arr) {
            result += Integer.parseInt(s);
        }

        return result;
    }
}
