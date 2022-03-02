// 1493. 수의 새로운 연산

// by SonMinji_220302

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SWEA_D3_1493 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcNum=1; tcNum<=T; tcNum++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			
			List<Integer> numList = new ArrayList<Integer>();
			numList.add(0);
			int plus = 0;
			for(int i=1; i<100000000; i+=plus) {
				numList.add(i);
				plus++;
			}
			
			boolean pFind = false;
			boolean qFind = false;
			int pX = 0;
			int pY = 0;
			int qX = 0;
			int qY = 0;
			for(int i=0; i<numList.size(); i++) {
				if(pFind == false && numList.get(i) > p) {
					int d = p-numList.get(i-1);
					pX = 1+d;
					pY = (i-1)-d;
					pFind = true;
				}
				if(qFind == false && numList.get(i) > q) {
					int d = q-numList.get(i-1);
					qX = 1+d;
					qY = (i-1)-d;
					qFind = true;
				}
				if(pFind && qFind) {
					break;
				}
			}
			int X = pX + qX;
			int Y = pY + qY;
			int result = numList.get(Y);
			for(int i=1; i<X; i++) {
				result += (Y+i);
			}
			
			System.out.printf("#%d %d\n", tcNum, result);
		}
	}
}
