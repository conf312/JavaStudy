package question100.ex25;

public class Cycle1110 {

    public int getCycle1110(int n) {
        int res = n;
        int tmp = 0;
        int cnt = 0;

        do {
            tmp = res / 10 + res % 10;
            res = res % 10 * 10 + tmp % 10;
            cnt++;
        } while (n != res);

        return cnt;
    }

    public int getCycle1110(String n, String answer, int cnt) {
        int result = cnt;

        if (n.length() == 1) n = "0" + n;

        String[] arr = answer.isEmpty() ? n.split("") : answer.split("");

        int left = Integer.parseInt(arr[0]);
        int right = Integer.parseInt(arr[1]);

        String sum = String.valueOf(left + right);

        if (sum.length() == 1) sum = 0 + sum;

        String[] answerArr = sum.split("");

        String sumRight = answerArr[1];

        String rAnswer = right + sumRight;

        if (n.equals(rAnswer)) return result + 1;

        return getCycle1110(n, rAnswer,result + 1);
    }
}
