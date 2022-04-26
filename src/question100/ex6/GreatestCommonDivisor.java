package question100.ex6;

public class GreatestCommonDivisor {
    //최대 공약수 구하기
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

    /*
    유클리드 호제법(-互除法, Euclidean algorithm) 또는 유클리드 알고리즘은 2개의 자연수 또는 정식(整式)의 최대공약수를 구하는 알고리즘의 하나이다.
    호제법이란 말은 두 수가 서로(互) 상대방 수를 나누어(除)서 결국 원하는 수를 얻는 알고리즘을 나타낸다.
    2개의 자연수(또는 정식) a, b에 대해서 a를 b로 나눈 나머지를 r이라 하면(단, a>b), a와 b의 최대공약수는 b와 r의 최대공약수와 같다.
    이 성질에 따라, b를 r로 나눈 나머지 r'를 구하고, 다시 r을 r'로 나눈 나머지를 구하는 과정을 반복하여
    나머지가 0이 되었을 때 나누는 수가 a와 b의 최대공약수이다.
     */
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
