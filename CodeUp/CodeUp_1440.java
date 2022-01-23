// 1440 : 비교

// by SonMinji_220123

import java.util.Scanner;

public class CU1440 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int j=0; j<n; j++) {
			String str = "";
			for(int k=0; k<n; k++) {
				if(j!=k) {
					if(arr[j] == arr[k]) {
						str += "= ";
					} else {
						str += arr[j] > arr[k] ? "> " : "< ";
					}
				}
			}
			System.out.printf("%d: %s\n", j+1, str);
		}
	}
}
