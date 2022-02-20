// Baekjoon_2839 설탕 배달

// Solution_01 by wYuYw - Brute Force

import java.util.Scanner;

class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int minVal = n;
		int val = 0;
		// i : 3kg, j : 5kg
		for(int i = 0; i < (n/3)+1; i++) {
			for(int j = 0; j < (n/5)+1; j++) {
				val = 3*i + 5*j;
				if(val == n) {
					minVal = (minVal > i+j) ? i+j : minVal;
				}
			}
		}
		if(minVal == n) System.out.println(-1);
		else System.out.print(minVal);
	}
}

// Solution_02 by wYuYw - Greedy

import java.util.Scanner;

class Practice {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int val = 0;
		
		while(true) {
			if(n % 5 == 0) {
				System.out.println(n/5 + val);
				break;
			} else if(n < 0) {
				System.out.println(-1);
				break;
			}
			n = n - 3;
			val += 1;
		}
	}
}
