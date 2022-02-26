// 7236. 저수지의 물의 총 깊이 구하기

// Solution by wYuYw
// for문으로 코드 간소화 가능; for(int d = 0; d < 8; d++), if(nx >= 0 && nx < n && ny >= 0 && ny < n && reservoir[nx][ny])

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



// by SonMinji_220226

import java.util.Scanner;

public class SWEA_D3_7236 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int N = sc.nextInt();
			char[][] map = new char[N+2][N+2];
			for(int i=1; i<=N; i++) {
				for(int j=1; j<=N; j++) {
					map[i][j] = sc.next().charAt(0);
				}
			}
            
			int max = 0;
			for(int r=1; r<=N; r++) {
				for(int c=1; c<=N; c++) {
					
					if(map[r][c] == 'W') {
						int sum = -1;
						for(int mr=r-1; mr<=r+1; mr++) {
							for(int mc=c-1; mc<=c+1; mc++) {
								if(map[mr][mc] == 'W') {
									sum++;
								}
							}
						}
						if(sum == 0) {
							sum = 1;
						}
						max = Math.max(max, sum);
					}
                    
				}
			}
			
			System.out.printf("#%d %d\n", tcNum, max);
		}	
		
	}
}
