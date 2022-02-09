// 1442 : 선택 정렬

// by SonMinji_220209

import java.util.Scanner;

public class CU1442 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length-1; i++) {
			int minIdx = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[minIdx] > arr[j]) {
					minIdx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
