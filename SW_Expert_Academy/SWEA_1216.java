// 1216. [S/W 문제해결 기본] 3일차 - 회문2

// by SonMinji_220216

import java.util.Scanner;

public class SWEA_D3_1216 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc=1; tc<=10; tc++) {
			int tcNum = sc.nextInt();
			char[][] arr = new char[100][100];
			int max = 1;
			
			// 값 입력 & 행 검사
			for(int i=0; i<100; i++) {
				arr[i] = sc.next().toCharArray();
                
				for(int idx=0; idx<99; idx++) {
					int length = 0;
					int plusIdx = 0;
					for(int j=99; j>=idx+plusIdx; j--) {
						if(arr[i][idx+plusIdx] == arr[i][j]) {
							if(idx+plusIdx == j) {
								length++;
								break;
							} else if(idx+plusIdx+1 == j) {
								length += 2;
								break;
							} else {
								length += 2;
								plusIdx++;
							}
						} else {
							length = 0;
							j=j+plusIdx;
							plusIdx = 0; 
						}
					}
					max = Math.max(max, length);
				}
			}
			
			// 열 검사
			for(int j=0; j<100; j++) {
				for(int idx=0; idx<99; idx++) {
					int length = 0;
					int plusIdx = 0;
					for(int i=99; i>=idx+plusIdx; i--) {
						if(arr[idx+plusIdx][j] == arr[i][j]) {
							if(idx+plusIdx == i) {
								length++;
								break;
							} else if(idx+plusIdx+1 == i) {
								length += 2;
								break;
							} else {
								length += 2;
								plusIdx++;
							}
						} else {
							length = 0;
							i=i+plusIdx;
							plusIdx = 0;
						}
					}
					max = Math.max(max, length);
				}
			}
			
			System.out.printf("#%d %d\n", tcNum, max);
		}
	}
}
