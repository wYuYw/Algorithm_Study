// SWEA_1961 숫자 배열 회전

// Solution by wYuYw

import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			// initialize
			int n = sc.nextInt();
			int[][] matrix = new int[n][n];
			for(int r = 0; r < n; r++) {
				for(int c = 0; c < n; c++) matrix[r][c] = sc.nextInt();
			}
			
			// rotate 90, 180, 270
			int[][] matrix90 = rotate(matrix, n);
			int[][] matrix180 = rotate(matrix90, n);
			int[][] matrix270 = rotate(matrix180, n);
			
            System.out.println("#" + tc);
			for(int r = 0; r < n; r++) {
				for(int c = 0; c < n; c++) System.out.print(matrix90[r][c]);
				System.out.print(" ");
				for(int c = 0; c < n; c++) System.out.print(matrix180[r][c]);
				System.out.print(" ");
				for(int c = 0; c < n; c++) System.out.print(matrix270[r][c]);
				System.out.println();
			}
		}
	}
	
	// rotation function
	private static int[][] rotate(int[][] matrix, int n) {
		int[][] result = new int[n][n];
		for(int r = 0; r < n; r++) {
			for(int c = 0; c < n; c++) result[r][c] = matrix[n-1-c][r];
		}
		return result;
	}
}



// Solution01 by SonMinji_220222
/*
import java.util.Scanner;

public class SWEA_D2_1961 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tcNum = 1; tcNum <= T; tcNum++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			StringBuilder sb90 = new StringBuilder();
			for (int c = 0; c < N; c++) {
				for (int r = N - 1; r >= 0; r--) {
					sb90.append(arr[r][c]);
				}
			}
			StringBuilder sb180 = new StringBuilder();
			for (int r = N - 1; r >= 0; r--) {
				for (int c = N - 1; c >= 0; c--) {
					sb180.append(arr[r][c]);
				}
			}
			StringBuilder sb270 = new StringBuilder();
			for (int c = N - 1; c >= 0; c--) {
				for (int r = 0; r < N; r++) {
					sb270.append(arr[r][c]);
				}
			}

			String str90 = sb90.toString();
			String str180 = sb180.toString();
			String str270 = sb270.toString();
			
			String[][] strArr = new String[N][3];
			System.out.println("#" + tcNum);
			for(int r=0; r<N; r++) {
				for(int c=0; c<3; c++) {
					if(c==0) {
						strArr[r][c] = str90.substring(N*r, N*(r+1));
					} else if(c==1) {
						strArr[r][c] = str180.substring(N*r, N*(r+1));
					} else {
						strArr[r][c] = str270.substring(N*r, N*(r+1));
					}
					System.out.print(strArr[r][c]+" ");
				}
				System.out.println();
			}

		}
	}
}
*/


// Solution02 by smj227b_220224 - 메서드 생성
/*
import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
         
        for (int tcNum = 1; tcNum <= T; tcNum++) {
            int N = sc.nextInt();
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
 
            String[][] result = new String[N][3];
            for(int i=0; i<3; i++) {
                arr = spin(arr, N, result, i);
            }
         
            System.out.println("#"+tcNum);
            for(int i=0; i<N; i++) {
                for(int j=0; j<3; j++) {
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
 
    public static int[][] spin(int[][] originArr, int N, String[][] resultArr, int C) {
        int[][] spinArr = new int[N][N];
         
        for (int c = 0; c < N; c++) {
            StringBuilder sb = new StringBuilder();
            for (int r = N - 1; r >= 0; r--) {
                spinArr[c][N-1-r] = originArr[r][c];
                sb.append(originArr[r][c]);
            }
            String val = sb.toString();
            resultArr[c][C] = val;
        }
        return spinArr;
    }
}
*/
