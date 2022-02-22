// Baekjoon_1158 요세푸스 문제

// Solution01 by SonMinji_220222 - 배열[]

import java.util.Scanner;

public class BJ1158 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		
		int select=0;
		int cnt = 0;
		StringBuilder sb = new StringBuilder();
		while(select<N) {
			for(int i=0; i<N; i++) {
				if(arr[i] != 0) {
					cnt++;
					if(cnt % K == 0) {
						if(cnt == K) {
							sb.append(arr[i]);
						} else {
							sb.append(", "+arr[i]);
						}
						select++;
						arr[i] = 0;
					}
				}
			}
		}
		String result = sb.toString();
		System.out.println("<"+result+">");
		
	}
}


// Solution02 by SonMinji_220222 - Queue
/*
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ1158re {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		
		int select = 0;
		int cnt = 0;
		StringBuilder sb = new StringBuilder();
		while(select<N) {
			cnt++;
			if(cnt % K == 0) {
				if(cnt == K) {
					sb.append(queue.remove());
				} else {
					sb.append(", "+queue.remove());					
				}
				select++;
			} else {
				queue.add(queue.element());
				queue.remove();
			}
		}
		String result = sb.toString();
		System.out.println("<"+result+">");
		
	}
}
*/
