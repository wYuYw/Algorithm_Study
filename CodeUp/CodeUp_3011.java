// 3011 : 거품 정렬(Bubble Sort)

// by SonMinji_220209

import java.util.Scanner;

public class CU3011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		for(int i=arr.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			cnt++;
			
			boolean sortResult = true;
			for(int k=0; k<arr.length-1; k++) {
				if(arr[k] > arr[k+1]) {
					sortResult = false;
					break;
				}
			}
			
			if(sortResult) {
				System.out.println(cnt);
				break;
			}
		}

	}
}
