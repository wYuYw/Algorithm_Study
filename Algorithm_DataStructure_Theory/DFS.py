# 비선형구조인 그래프 구조는 그래프로 표현된 모든 자료를 빠짐없이 검색하는 것이 중요
# 그래프 탐색 알고리즘 2가지
# 1.DFS(Depth First Search, 깊이 우선 탐색)
# 2.BFS(Breadth First Search, 너비 우선 탐색)

# DFS
# 스택을 활용

# 방법
# 1.시작 정점의 한 방향으로 갈 수 있는 경로가 있는 곳까지 깊이 탐색
# 2.더 이상 갈 곳이 없게 되면, 가장 마지막에 만났던 갈림길 간선이 있는 정점으로 되돌아옴
# 3.다른 방향의 정점으로 탐색으 계속 반복하여 결국 모든 정점을 방문하여 순회
# 가장 마지막에 만났던 갈림길의 정점으로 되돌아가서 다시 깊이 우선 탐색을 반복해야 하므로 후입선출 구조의 스택을 사용

# pseudo code
visited[], stack[] 초기화
DFS(v)
  v 방문;
  visited[v] <- true;
  do {
    if (v의 인접 정점 중 방문 안 하 w 찾기)
      push(v);
    while(w) {
      w 방문;
      visited[w] <- true;
      push(w);
      v <- w;
      v의 인접 정점 중 방문 안 한 w 찾기
    }
    v <- pop(stack);
  } while(v)
end DFS()
