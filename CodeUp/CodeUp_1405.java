// 1405 : 숫자 로테이션

// by SonMinji_220204

import java.util.Scanner;

public class CU1405 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				System.out.printf("%d ",arr[j]);
			}
			for(int k=0; k<i; k++) {
				System.out.printf("%d ",arr[k]);
			}
			System.out.println();
		}
		
	}
}
