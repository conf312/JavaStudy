package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Question2493 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String[] top = br.readLine().split(" ");
        Stack<int[]> stack = new Stack<>();

        for(int i=0; i<len; i++) {
            int n = Integer.parseInt(top[i]);
            while (!stack.isEmpty()) {
                if (stack.peek()[0] < n) {
                    stack.pop();
                }  else {
                    System.out.print(stack.peek()[1] + " ");
                    break;
                }
            }
            if(stack.empty()) System.out.print("0 ");
            stack.push(new int[] {n, i+1});
        }
    }
}
