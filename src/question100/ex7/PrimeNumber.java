package question100.ex7;

public class PrimeNumber {
    public String getPrimeNumber(int a) {
        int index = 2;
        while (a > index) {
            if (a % index == 0) return a + "은 소수가 아닙니다.";
            else index++;
        }
        return a + "은 소수입니다.";
    }
}
