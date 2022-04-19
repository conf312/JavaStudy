package question100.ex14;

public class CountNumeber {
    public void getCountNumber(int n) {
        int[] numArr = new int[10];
        String[] strArr = String.valueOf(n).split("");

        for (String s : strArr) {
            int i = Integer.parseInt(s);
            numArr[i]++;
        }

        for (int i=0; i<numArr.length; i++) {
            System.out.println(i + " : " + numArr[i]);
        }
    }
}
