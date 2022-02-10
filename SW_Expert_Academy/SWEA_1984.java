// 1984. 중간 평균값 구하기

// by SonMinji_220210

import java.util.Scanner;

public class SWEA_D2_1984 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int[] arr = new int[10];
			int sum = 0;
			for(int i=0; i<10; i++) {
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
      
			for(int i=0+1; i<10-1; i++) {
				sum += arr[i];
			}
      
			int avg = (sum+4)/(10-2);
			System.out.printf("#%d %d\n", tcNum, avg);
		}
    
	}
}
