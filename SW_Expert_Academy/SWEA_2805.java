// 2805. 농작물 수확하기

// by SonMinji_220215

import java.util.Scanner;

public class SWEA_D3_2805 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();

			int sum = 0;
			int startIdx = N/2;
			int endIdx = N/2;
			for(int i=0; i<N; i++) {
				String str = sc.next();
				for(int idx=startIdx; idx<=endIdx; idx++) {
					sum += (str.charAt(idx)-'0');
				}
				if(i < N/2) {
					startIdx--;
					endIdx++;
				} else {
					startIdx++;
					endIdx--;
				}
			}
      
			System.out.printf("#%d %d\n", tcNum, sum);
		}
	}
}


// Solution by wYuYw

import java.util.Scanner;
 
class Solution {
    public static void main(String args[]) throws Exception {
         
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
 
        for(int test_case = 1; test_case <= T; test_case++) {
            int result = 0;
            int n = sc.nextInt();
            int[][] farm = new int[n][n];
             
            // Form a farm
            for ( int i = 0; i < n; i++ ) {
                String temp = sc.next();
                for ( int j = 0; j < n; j++ ) {
                    farm[i][j] = Character.getNumericValue(temp.charAt(j));
                }
            }
            // Middle area
            for ( int i = 0; i < n; i++ ) result += farm[n/2][i];
            for ( int i = 0; i < n/2; i++ ) {
                for ( int j = n/2 - i; j <= n/2 + i; j++ ) {
                    // Upper area
                    result += farm[i][j];
                    // Lower area
                    result += farm[n-i-1][j];
                }
            }
 
            System.out.printf("#%d %d%n", test_case, result);
        }
    }
}
