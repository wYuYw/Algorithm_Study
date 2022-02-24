// 1225. [S/W 문제해결 기본] 7일차 - 암호생성기

// Solution by wYuYw

import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int tests = 1; tests < 11; tests++){
        	// initialize
            int tc = sc.nextInt();
            int[] nums = new int[8];
            for(int i = 0; i < 8; i++) nums[i] = sc.nextInt() % 75;
            
            // get result if the process ends
            int k = 1;
            while(nums[7] > 0) {
            	if(k == 6) k = 1;
                int temp = nums[0];
            	for(int i = 1; i < 8; i++) nums[i-1] = nums[i];
                nums[7] = temp - k;
            	k += 1;
            } nums[7] = 0;
            
            // print result
            System.out.print("#" + tc + " ");
            for(int i = 0; i < 8; i++) {
            	System.out.print(nums[i] + " ");
            } System.out.println();
        }
    }
}
