// 11399. ATM

// by SonMinji_220404 - PriorityQueue

import java.util.PriorityQueue;
import java.util.Scanner;

public class BJ11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 사람 수 (1 <= N <= 1000)
		int N = sc.nextInt();
		
		// 각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값 구하기
		// 앞 사람의 수가 반복적으로 더해지므로 돈을 인출하는 데 걸리는 시간이 작은 순으로 서야함
		// 따라서 입력된 시간을 오름차순으로 정렬하고 시간의 합 구하기
		// 우선 순위 큐 라이브러리 사용
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for(int i=0; i<N; i++) {
			// 우선 순위 큐 라이브러리를 사용하여 입력 받은 시간 큐에 추가
      // 우선순위 큐에 add하면 오름차순으로 정렬됨
			queue.add(sc.nextInt());
		}
		int result = 0;
		for(int i=0; i<N; i++) {
			// 오름차순으로 정렬된 값을 하나씩 꺼내 N-i 곱하고 다 더해줌
			// 첫번째 나온 값은 N번 더해지고
			// 두번째 나온 값은 N-1번 더해지므로
			// 각 값에 N-i를 곱하여 더한다
			result += queue.poll() * (N-i);
		}

		// 결과 출력
		System.out.println(result);
	}
}
