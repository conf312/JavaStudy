package question100.ex3;

import java.util.HashMap;
import java.util.Scanner;

public class NumberCount {

    // 제일 많이 반복되는 숫자와 횟수
    public String getNumberCount() {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.next().split("");

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (String s : arr) {
            int val = Integer.parseInt(s);
            hashMap.put(val, hashMap.get(val) == null ? 1 : hashMap.get(val) + 1);
        }

        int max = 0;
        int index = 0;
        for (Integer r : hashMap.keySet()) {
            if (hashMap.get(r) > max) {
                max = hashMap.get(r);
                index = r;
            }
        }

        return index + "번" + " (" + max + ")회";
    }

}
