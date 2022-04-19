package question100.ex24;

public class Avg4344 {
    public float getAvg4344(String n) {
        float result = 0;

        String[] arr = n.split(" ");

        int len = arr.length;
        int avg = 0;
        int sum = 0;
        int person = 0;

        int[] intArr = new int[len];

        for (int i=0; i<len; i++) {
            int val = Integer.parseInt(arr[i]);
            intArr[i] = val;
            sum += val;
        }

        avg = sum / len;

        for (int i : intArr) {
            if (i >= avg) {
                person++;
            }
        }

        result = Math.round(((float) person / len) * 100 * 100 * 10);

        return (result / 1000);
    }
}
