//1512 : 숫자 등고선

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x_start = sc.nextInt()-1;
        int y_start = sc.nextInt()-1;
        int[][] arr = new int[n][n];

        for(int x=0; x<n; x++) {
            for(int y=0; y<n; y++) {
                arr[x][y] = Math.abs(x-x_start)+Math.abs(y-y_start)+1;
            }
        }

        for(int x=0; x<n; x++) {
            for(int y=0; y<n; y++) {
                System.out.printf("%d ", arr[x][y]);
            }System.out.println();
        }

    }
}


// by SonMinji
/*
import java.util.Scanner;

public class CU1512 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [][] arr = new int[N+1][N+1];
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		arr[x][y] = 1;
		
		for(int i=0; i<=N; i++) {
			for(int j=0; j<=N; j++) {
				int xplus = x-i<0 ? (x-i)*(-1) : (x-i);
				int yplus = y-j<0 ? (y-j)*(-1) : (y-j);

				arr[i][j] = arr[x][y]+xplus+yplus;
			}
		}
        
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

