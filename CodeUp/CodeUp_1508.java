//1508 : 나도 IQ 150

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) {
            arr[i][0] = sc.nextInt();
        }

        for(int i=1; i<n; i++) {
            for(int j=1; j<n; j++) {
                arr[i][j] = arr[i][j-1] - arr[i-1][j-1];
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<i+1; j++){
                System.out.printf("%d ", arr[i][j]);
            } System.out.println();
        }
    }
}


// by SonMinji_220123
/*
import java.util.Scanner;

public class CU1508 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] arr = new int [N][N];
		for(int num=0; num<N; num++) {
			arr[num][0] = sc.nextInt();
		}
		
		for(int r=1; r<N; r++) {
			for(int c=1; c<=r; c++) {
				arr[r][c] = arr[r][c-1] - arr[r-1][c-1];
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
*/
