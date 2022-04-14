// 2606. 바이러스

// by SonMinji_220415

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BJ2606 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 컴퓨터 개수
		// 컴퓨터 번호는 1~N
		int N = sc.nextInt();
		// 컴퓨터 연결 쌍 개수
		int E = sc.nextInt();
		// 컴퓨터 연결 정보 저장할 리스트배열
		List<Integer>[] adjList = new ArrayList[N+1];
		for(int n=0; n<N+1; n++) {
			// 각 인덱스에 해당하는 배열 값을 리스트 객체 생성하여 초기화
			adjList[n] = new ArrayList<>();
		}
		// 컴퓨터 연결 정보 입력
		for(int e=1; e<=E; e++) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			// 무향 간선
			// 입력된 컴퓨터 번호와 일치하는 배열의 인덱스에 해당하는 리스트에 해당 컴퓨터에 연결된 컴퓨터 번호 저장
			adjList[c1].add(c2);
			adjList[c2].add(c1);
		}
		
		// BFS
		Queue<Integer> q = new LinkedList<>();
		// 컴퓨터 체크 유무(바이러스 감염 유무) 체크할 배열
		boolean[] visited = new boolean[N+1];
		// 시작 컴퓨터 번호 큐에 넣기
		q.add(1);
		// 방문 처리 (감염 표시)
		visited[1] = true;
		
		// 1번 컴퓨터에 의해 바이러스 걸린 컴퓨터 개수
		int cnt = 0;
		// 큐가 빌 때까지 (큐가 비었다는 것은 더이상 감염된 컴퓨터가 없다는 것)
		while(!q.isEmpty()) {
			// 큐에서 바이러스 걸린 컴퓨터 번호 하나 빼기
			int virus = q.poll();
			// 바이러스 걸린 컴퓨터와 연결된 컴퓨터 번호들 찾아서 바이러스 감염 처리
			for(int i=0; i<adjList[virus].size(); i++) {
				int v = adjList[virus].get(i);
				if(!visited[v]) { // 바이러스 감염되지 않은 경우
					// 감염 처리
					visited[v] = true;
					// 큐에 감염된 컴퓨터 번호를 넣어줘서
					// 해당 컴퓨터와 연결된 컴퓨터도 찾아 바이러스 감염 처리할 수 있도록 함
					q.add(v);
					// 1번 컴퓨터에 의해 감염된 컴퓨터 개수 하나 증가
					cnt++; 
				}
			}
		}
		
		// 결과 출력
		System.out.println(cnt);
	}
}
