// 1267. [S/W 문제해결 응용] 10일차 - 작업순서

// by SonMinji - 위상 정렬(Topological Sorting)_220414

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_D6_1267 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 개수 10개
		for(int tcNum=1; tcNum<=10; tcNum++) {
			// 정점의 총 개수 (5 <= V <= 1000)
			int V = sc.nextInt();
			// 정점 번호는 1부터 V까지의 정수값
			// 각 정점의 진입차수 저장할 배열
			int[] Vedge = new int[V+1];
			// 간선의 총 개수
			int E = sc.nextInt();
			// 간선 정보 담을 리스트배열
			ArrayList<Integer>[] edges = new ArrayList[V+1];
			// 배열을 리스트로 초기화
			for(int v=0; v<V+1; v++) {
				edges[v] = new ArrayList<>();
			}
			// 간선 정보
			for(int e=1; e<=E; e++) {
				// 간선의 시작점
				int start = sc.nextInt();
				// 간선의 도착점
				int end = sc.nextInt();
				// 진입차수 저장하는 배열의 도착점 인덱스에 해당하는 값 +1
				Vedge[end]++;
				// 간선 정보 저장하는 배열의 시작점 인덱스에 해당 정점과 연결된 도착점 번호 저장
				edges[start].add(end);
			}
			
			// 정렬 순서 저장
			StringBuilder sb = new StringBuilder();
			// 정렬할 때 사용할 큐
			Queue<Integer> q = new LinkedList<>();
			// 위상 정렬
			// 진입차수가 0인 정점들(선행될 정점이 없는 정점들) 큐에 담기
			for(int v=1; v<V+1; v++) {
				if(Vedge[v] == 0) {
					q.add(v);
				}
			}
			// 큐에서 하나씩 빼면서 그 정점과 연결된 정점의 진입차수를 하나씩 감소
			while(!q.isEmpty()) {
				// 큐에 들어온 정점은 진입차수가 0인 (선행될 정점이 없는) 정점이므로
				// 큐에서 하나 빼서 스트링빌더에 입력하여 정렬시킴
				int v = q.poll();
				sb.append(" "+v);
				
				// 큐에서 뺀 정점과 연결된 정점들은 edges[큐에서 뺀 정점 번호]에 리스트로 저장되어 있음
				for(int i=0; i<edges[v].size(); i++) {
					int vNum = edges[v].get(i);
					// 큐에서 뺀 정점과 연결된 정점들은 
					// 선행될 정점이 하나 사라진 것이므로 진입차수를 -1 해줌
					Vedge[vNum]--;
					// 진입차수가 0인 정점은(선행될 정점이 없는 정점) 큐에 담기
					if(Vedge[vNum] == 0) {
						q.add(vNum);
					}
				}
			}
			
			// 결과 출력
			System.out.printf("#%d%s\n", tcNum, sb);
		}
	}
}
