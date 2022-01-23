//1511 : 테두리의 합

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int value = 0;
        int k = 1;

        for(int p=0; p<n; p++) {
            for(int q=0; q<n; q++) {
                arr[p][q] = k++;
            }
        }

        for(int i=0; i<n; i++) value += arr[0][i];
        for(int i=1; i<n; i++) value += arr[i][n-1];
        for(int i=0; i<(n-1); i++) value += arr[n-1][i];
        for(int i=1; i<(n-1); i++) value += arr[i][0];

        System.out.println(value);
    }
}


// by SonMinji_220123
/*
import java.util.Scanner;

public class CU1511 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[][] arr = new int[N][N];
		int num=1;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j] = num++;
				// System.out.print(arr[i][j]);
			}
			// System.out.println();
		}
		
		int sum = 0;
		for(int r=0; r<N; r++) {
			if(r==0 || r==N-1) {
				for(int c=0; c<N; c++) {
					sum += arr[r][c];
				}	
			} else {
				// 조건이 꼭 c++일 필요는 없지! 고정관념 버리자
				for(int c=0; c<N; c=c+N-1) {
					sum += arr[r][c];
				}
			}
		}
		System.out.println(sum);
	}
}
*/


// Solution2 by SonMinji_220123
/*
import java.util.Scanner;

public class CU1511re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[][] arr = new int[N][N];
		int num=1;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j] = num++;
				// System.out.print(arr[i][j]);
			}
			// System.out.println();
		}
		
        // 테두리말고 나머지 값 0으로 바꾸기
		for(int r=1; r<N-1; r++) {
			for(int c=1; c<N-1; c++) {
				arr[r][c] = 0;
			}
		}
		
		int sum = 0;
        // 배열의 모든 값 더하기
		for(int r=0; r<N; r++) {
			for(int c=0; c<N; c++) {
				sum += arr[r][c];
			}
		}
		System.out.println(sum);
	}
}
*/
