// 2206. 벽 부수고 이동하기

// by SonMinji_220407

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ2206 {
	
	static class Node {
		// 행 위치
		int r;
		// 열 위치
		int c;
		// 이동거리
		int d;
		// 벽 부순 경험 유무
		// 0 : 벽을 부순 적이 없다
		// 1 : 벽을 부순 적이 있다
		int w;
		
		public Node(int r, int c, int d, int w) {
			this.r = r;
			this.c = c;
			this.d = d;
			this.w = w;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// N개의 줄에 M개의 정수로 미로가 입력됨
		int N = sc.nextInt();
		int M = sc.nextInt();
		// 맵 저장 (1: 벽(이동 불가), 0: 이동 가능 )
		char[][] map = new char[N][M];
		for (int i = 0; i < N; i++) {
			map[i] = sc.next().toCharArray();
			// 배열에 값 잘 들어갔나 확인
			//System.out.println(Arrays.toString(map[i]));
		}
		
		// 큐 생성
		Queue<Node> queue = new LinkedList<>();
		// 시작점 관련 정보(시작점의 좌표, 거리, 벽 부순 유무)를 Node클래스 객체 만들어서 저장
		Node start = new Node(0, 0, 1, 0);
		// 큐에 시작점을 넣기
		queue.add(start);
		// 방문 처리 표시할 배열 생성 
		// 벽 안 부수고 온 경우 [][][0]에 처리
		// 벽 부수고 온 경우 [][][1]에 처리
		boolean[][][] visited = new boolean[N][M][2];
		// 시작점 방문 처리
		visited[start.r][start.c][start.w] = true;
		
		// 인접한 좌표 중 큐 넣을 조건에 맞는 좌표 찾기
		// 현재 좌표 기준 상하좌우로 검사
		int[] dr = { -1, 1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };
		// 결과로 출력할 최단 거리
		// 도착점에 도달하지 못하면 -1 출력해야 하므로 -1로 초기화
		int minD = -1;
		// 큐가 빌 때(다 탐색할 때)까지 while문 돌도록 만들고 
		// while문 안에서 break 조건을 줘서 빠져나오게 함
		while (!queue.isEmpty()) {
			// 큐에서 하나 빼고
			Node curr = queue.poll();
			// 큐에 저장되어 있던 값 확인
			//System.out.println("r:"+curr.r+" c:"+curr.c+" d:"+curr.d+" w:"+curr.w);
			// 도착점에 도착하면 BFS로 구했기 때문에 그 거리가 최소 이동거리
			if(curr.r == N-1 && curr.c == M-1) {
				// 최소 이동거리 저장
				minD = curr.d;
				// 최소 이동거리 찾았으므로 탐색 종료
				break;
			}
			
			// 현재 내가 보고있는 좌표의 인접한 좌표를 큐에 넣는다
			// 큐에 넣을 좌표는 
			// 이동할 수 있고 방문한 적이 없는 좌표여야 한다
			for(int i=0; i<dr.length; i++) {
				// 현재 내가 보고있는 좌표의 인접한 4방향의 좌표를 탐색
				int moveR = curr.r+dr[i];
				int moveC = curr.c+dc[i];
				
				// 맵을 벗어나면 다음 방향 확인
				if(moveR < 0 || moveR == N || moveC < 0 || moveC == M) {
					continue;
				}
				// 방문한 적이 있는 좌표면 continue를 해서 다음 방향 확인
				if(visited[moveR][moveC][0]) {
					continue;
				}
				// 이동할 수 없는 좌표(1: 벽)지만 벽을 부순 적이 없다면
				if(map[moveR][moveC] == '1' && curr.w == 0) {
					// 벽을 부수고 이동할 수 있으므로
					// 그 좌표와 이동거리, 벽 부순 유무(1)를 큐에 넣는다
					queue.add(new Node(moveR, moveC, curr.d+1, 1));
					// 그 벽이 있던 좌표를 방문처리
					visited[moveR][moveC][1] = true;
				} else if(map[moveR][moveC] == '0' && !visited[moveR][moveC][curr.w]) {
					// 이동할 수 있고 방문한 적 없는 좌표라면 
					// 그 좌표와 이동거리, 벽 부순 유무를 큐에 넣는다
					// curr.w를 그대로 받아서 이 전까지의 벽 부순 유무를 유지해야함
					queue.add(new Node(moveR, moveC, curr.d+1, curr.w));
					// 그 좌표를 방문처리
					visited[moveR][moveC][curr.w] = true;					
				}
			}
		}
		// 결과 출력
		System.out.println(minD);
	}
	
}
