package question100.ex6;

public class GreatestCommonDivisor {
    //최소 공배수 구하기
    public int getGCD(int a, int b) {
        boolean flag = true;
        int fa = a;
        int fb = b;
        int result = 1;
        int index = 2;
        int min = a > b ? b : a;
        while (flag) {
            if (fa % index == 0 && fb % index == 0) {
                result = result * index;
                fb = fb / index;
                fa = fa / index;
            } else {
                index++;
            }
            if (index > min) flag = false;
        }
        return result;
    }

    public int getEuclid(int a, int b) {
        if (b == 0) return a;

        int max = a;
        int min = b;

        if (b > a) {
            max = b;
            min = a;
        }

        int r = max % min;

        return getEuclid(min, r);
    }

}
