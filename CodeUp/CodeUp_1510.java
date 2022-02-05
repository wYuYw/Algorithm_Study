//1510 : 홀수 마방진

//Solution by wYuYw

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int i = 0;
        int j = n/2;
        int value = 0;

        for(int k=0; k<(n*n); k++) {
            arr[i][j] = ++value;
            if(value%n==0) i++;
            else {
                i--;
                j++;
            }
            if(i<=-1) i = n-1;
            if(j>=n) j = 0;
        }

        for(int p=0; p<n; p++) {
            for(int q=0; q<n; q++) {
                System.out.printf("%d ", arr[p][q]);
            } System.out.println();
        }
    }
}



// by SonMinji_220205
/*
import java.util.Scanner;

public class CU1510 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		int num = 0;
		int r = 0;
		int c = n/2;
        
		while(num < n*n) {

			arr[r][c] = ++num;
			
			if(num % n != 0) {
				if(r == 0) {
					r = n-1;
				} else {
					r = r-1;
				}
			} else {
				r = r+1;
			}
			
			if(num % n != 0) {
				if(c == n-1) {
					c = 0;
				} else {
					c = c+1;
				}
			} 
			
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
*/
