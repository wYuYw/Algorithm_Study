// Baekjoon_2309 일곱 난쟁이

// by SonMinji_220224

import java.util.Arrays;
import java.util.Scanner;

public class BJ2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] height = new int[9];
		for(int idx=0; idx<9; idx++) {
			height[idx] = sc.nextInt();
		}

		check: for(int i=0; i<9-1; i++) {
			for(int j=i+1; j<9; j++) {
				
				int sum = 0;
				for(int idx=0; idx<9; idx++) {
					if(idx != i && idx != j) {
						sum += height[idx];
					}
				}
                
				if(sum == 100) {
					height[i] = 0;
					height[j] = 0;
					break check;
				}
			}
		}

		Arrays.sort(height);
		for(int i=2; i<9; i++) {
			System.out.println(height[i]);
		}
		
	}
}
