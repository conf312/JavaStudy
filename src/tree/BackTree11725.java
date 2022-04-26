package tree;

import java.io.*;
import java.util.ArrayList;

public class BackTree11725 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] parent = new int[n+1];
        boolean[] visit = new boolean[n+1];
        ArrayList<Integer>[] list = new ArrayList[n+1];

        for(int i=0; i<n; i++) {
            list[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<n-1; i++) {
            String[] nums = (br.readLine()).split(" ");
            int n1 = Integer.parseInt(nums[0]); // 1,6,3,4,2,4
            int n2 = Integer.parseInt(nums[1]); // 6,3,5,1,4,7

            list[n1].add(n1);
        }
    }
}
