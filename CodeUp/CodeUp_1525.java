//1525 : 크레이지 아케이드

//Solution by wYuYw

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[30][30];
		int[][] arr2 = new int[30][30];
        //padding
		for(int i = 10; i < 20; i++) {
			for(int j= 10; j < 20; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for(int i = 10; i < 20; i++) {
			for(int j= 10; j < 20; j++) {
				arr2[i][j] = arr[i][j];
			}
		}

		int n = sc.nextInt();
		int[][] player = new int[n][2];
		for(int i = 0; i < n; i++) {
			for(int j= 0 ; j < 2 ; j++) {
				player[i][j] = sc.nextInt();
			}
		}
		for(int i = 10; i < 20; i++) {
			for(int j= 10; j < 20; j++) {
				if(arr[i][j] >= 1) {
					arr2[i][j] = -2;
					for(int k = 1; k <= arr[i][j]; k++) {
						if(arr[i+k][j] == -1) break;
						else arr2[i+k][j] = -2;
					}
					for(int k = 1; k <= arr[i][j]; k++) {
						if(arr[i-k][j] == -1) break;
						else arr2[i-k][j] = -2;
					}
					for(int k = 1; k <= arr[i][j]; k++) {
						if(arr[i][j+k] == -1) break;
						else arr2[i][j+k] = -2;
					}
					for(int k = 1; k <= arr[i][j]; k++) {
						if(arr[i][j-k] == -1) break;
						else arr2[i][j-k] = -2;
					}
				}
			}
		}

		for(int i = 0; i < n; i++) {
			if(arr2[player[i][0]+9][player[i][1]+9]==0) {
				arr2[player[i][0]+9][player[i][1]+9] = i+1;
			}
		}
		
		for(int i = 10; i < 20; i++) {
			for(int j= 10; j < 20; j++) {
				System.out.printf("%d ", arr2[i][j]);
			}
			System.out.println();
		}
		System.out.println("Character Information");
		
		for(int i = 0; i < n; i++) {
			if(arr2[player[i][0]+9][player[i][1]+9] == -2) {
				System.out.println("player " + (i+1) + " dead");
			} else if(arr2[player[i][0]+9][player[i][1]+9] == i+1) {
				System.out.println("player " + (i+1) + " survive");
			}
		}
	}
}
