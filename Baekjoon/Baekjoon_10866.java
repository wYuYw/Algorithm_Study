// 10866. 덱

// by SonMinji_220728

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BJ10866 {
	public static void main(String[] args) {
		// 입력받기 위해
		Scanner sc = new Scanner(System.in);
		// 명령의 수 (1 <= N <= 10,000)
		int N = sc.nextInt();
		// 정수 저장하는 덱 역할할 리스트
		// 조회가 아니라 삽입 삭제를 많이 하게 되므로 링크드리스트 사용
		List<Integer> deque = new LinkedList<Integer>();
		
		// 명령 실행한 결과 저장할 객체
		StringBuilder sb = new StringBuilder();
		
		// 명령 입력 후 그에 맞게 처리
		// 명령
		String cmd;
		for(int n=1; n<=N; n++) {
			// 명령어 입력
			cmd = sc.next();
			// 명령 시 필요한 정수  (1 <= x <= 100,000)
			int x;
			switch (cmd) {
			case "push_front":
				x = sc.nextInt();
				// 정수 X를 덱의 앞에 넣는다
				deque.add(0, x);
				break;
			case "push_back":
				x = sc.nextInt();
				// 정수 x를 덱의 뒤에 넣는다
				deque.add(x);
				break;
			case "pop_front":
				// 가장 앞에 있는 수를 빼고
				// 그 수를 출력
				// 덱이 비어있으면 -1 출력
				if(deque.isEmpty()) {
					sb.append(-1+"\n");
				} else {
					sb.append(deque.remove(0)+"\n");
				}
				break;
			case "pop_back":
				// 가장 뒤에 있는 수를 빼고
				// 그 수를 출력
				// 덱이 비어있으면 -1 출력
				if(deque.isEmpty()) {
					sb.append(-1+"\n");
				} else {
					sb.append(deque.remove(deque.size()-1)+"\n");
				}
				break;
			case "size":
				sb.append(deque.size()+"\n");
				break;
			case "empty":
				sb.append(deque.isEmpty() ? 1+"\n" : 0+"\n");
				break;
			case "front":
				// 가장 앞에 있는 정수 출력
				// 덱이 비어있으면 -1 출력
				if(deque.isEmpty()) {
					sb.append(-1+"\n");
				} else {
					sb.append(deque.get(0)+"\n");
				}
				break;
			case "back":
				// 가장 뒤에 있는 정수 출력
				// 덱이 비어있으면 -1 출력
				if(deque.isEmpty()) {
					sb.append(-1+"\n");
				} else {
					sb.append(deque.get(deque.size()-1)+"\n");
				}
				break;
			}
		}
		
		// 결과 출력 (명령 수행 결과)
		System.out.println(sb);
	}
}
