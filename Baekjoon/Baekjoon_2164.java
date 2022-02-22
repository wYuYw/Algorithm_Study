// Baekjoon_2164 카드2

// Solution01 by SonMinji_220222 - Queue

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Queue<Integer> card = new LinkedList<Integer>();
		for(int i=1; i<=N; i++) {
			card.add(i);
		}
		
		int remove = 0;
		while(remove<N-1) {
			card.remove();
			remove++;
			
			card.add(card.remove());
		}
		System.out.println(card.remove());
		
	}
}


// Solution02 by SonMinji_220222 - 배열[]
/*
import java.util.Scanner;

public class BJ2164re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] card = new int[N+1];
		for(int i=0; i<N+1; i++) {
			card[i] = i;
		}
		
		int pointer = 0;
		int remove = 0;
		while(remove<N) {
			for(int i=1; i<=N; i++) {
				if(card[i] != 0) {
					pointer++;
					if(pointer % 2 != 0) {
						remove++;
						if(remove==N) {
							System.out.println(card[i]);
						}
						card[i] = 0;
					}
				}
			}
		}
		System.out.println();
		
	}
}
*/
