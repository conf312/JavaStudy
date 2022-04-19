package question100.ex4;


import java.util.Stack;

public class ConvertBinary {

    // 10진수 19 -> 2진수 10011 변환
    public String getConvertBinary(int val) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int mok = val;

        while (mok != 0) {
            stack.push(mok % 2);
            mok = mok / 2;
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}
