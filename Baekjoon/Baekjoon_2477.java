// Baekjoon_2477. 참외밭

// by SonMinji_220316

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int[][] map = new int[6][2];
		int[] D = new int[5];
		for(int i=0; i<6; i++) {
			map[i][0] = sc.nextInt();
			map[i][1] = sc.nextInt();
			D[map[i][0]]++;
			
		}
        
		int dd1 = 0;
		int dd2 = 0;
		int d1 = 0;
		int d2 = 0;
		for (int d = 1; d <= 4; d++) {
			if (D[d] == 1) {
				if (d1 == 0) {
					d1 = d;
				} else {
					d2 = d;
				}
			}
			if (D[d] == 2) {
				if (dd1 == 0) {
					dd1 = d;
				} else {
					dd2 = d;
				}
			}
		}

		int bigSquare = 1;
		for(int i=0; i<6; i++) {
			if(map[i][0] == d1 || map[i][0] == d2) {
				bigSquare *= map[i][1];
			}
		}
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		int idx = -1;
		for(int i=0; i<6; i++) {
			if(map[i][0] == dd1 || map[i][0] == dd2) {
				list1.add(map[i][1]);
			} else {
				idx = i;
				break;
			}
		}
		for(int i=idx; i<6; i++) {
			if(map[i][0] == dd1 || map[i][0] == dd2) {
				list2.add(map[i][1]);
			}
		}
		while(!list1.isEmpty()) {
			list2.add(list1.remove(0));
		}
		int smallSquare = list2.get(1)*list2.get(2);
        
		int cnt = (bigSquare-smallSquare)*K;
		System.out.println(cnt);
	}
}
