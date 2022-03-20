// Baekjoon_2851 슈퍼 마리오

// by SonMinji_220320

import java.util.Scanner;

public class BJ2851 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] mushroom = new int[10];
		for(int i=0; i<10; i++) {
			mushroom[i] = sc.nextInt();
		}
		
		int result = 0;
		int idx = -1;
		while(result < 100 && idx < 9) {
			idx++;
			result += mushroom[idx];				
		}
		if(Math.abs(100-result) > 100-(result-mushroom[idx])) {
			result = result-mushroom[idx];
		}
        
		System.out.println(result);
	}
}
