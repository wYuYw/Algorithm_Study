// 7236. 저수지의 물의 총 깊이 구하기

// Solution by wYuYw

import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            String[][] water = new String[n][n];
            int[][] result = new int[n][n];
            for(int r = 0; r < n; r++) {
            	for(int c = 0; c < n; c++) water[r][c] = sc.next();
            }
            
            for(int r = 0; r < n; r++) {
            	for(int c = 0; c < n; c++) {
                    int cnt = 0;
                    int defaultVal = 1;
                    if(water[r][c].equals("W")) {
                		if(r-1 >= 0 && c-1 >= 0 && water[r-1][c-1].equals("W")) {
                			cnt += 1;
                			defaultVal = 0;
                		}
                    	if(r-1 >= 0 && water[r-1][c].equals("W")) {
                    		cnt += 1;
                    		defaultVal = 0;
                    	}
                    	if(r-1 >= 0 && c+1 < n && water[r-1][c+1].equals("W")) {
                    		cnt += 1;
                    		defaultVal = 0;
                    	}
                    	if(c+1 < n && water[r][c+1].equals("W")) {
                    		cnt += 1;
                    		defaultVal = 0;
                    	}
                    	if(c-1 >= 0 && water[r][c-1].equals("W")) {
                    		cnt += 1;
                    		defaultVal = 0;
                    	}
                    	if(r+1 < n && c-1 >= 0 && water[r+1][c-1].equals("W")) {
                    		cnt += 1;
                    		defaultVal = 0;
                    	}
                    	if(r+1 < n && water[r+1][c].equals("W")) {
                    		cnt += 1;
                    		defaultVal = 0;
                    	}
                    	if(r+1 < n && c+1 < n && water[r+1][c+1].equals("W")) {
                    		cnt += 1;
                    		defaultVal = 0;
                    	}
                    } result[r][c] = cnt + defaultVal;
                }
            }
            int maxVal = 0;
            for(int r = 0; r < n; r++) {
            	for(int c = 0; c < n; c++) {
                	maxVal = (result[r][c] > maxVal) ? result[r][c] : maxVal;
                }
            }
            System.out.println("#" + test_case + " " + maxVal);
		}
	}
}
