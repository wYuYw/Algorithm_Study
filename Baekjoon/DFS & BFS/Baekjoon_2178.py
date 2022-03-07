# Baekjoon_2178 미로 탐색

# Solution by wYuYw

from collections import deque
import sys
input = lambda: sys.stdin.readline().strip()

dr, dc = [-1, 0, 1, 0], [0, 1, 0, -1] # up, right, down, left
def bfs(r, c):
    q = deque()
    q.append((r, c))
    while q:
        r, c = q.popleft()
        for i in range(4):
            nr, nc = r + dr[i], c + dc[i]
            if 0 <= nr < n and 0 <= nc < m and graph[nr][nc] == 1:
                graph[nr][nc] = graph[r][c] + 1
                q.append((nr, nc))
    return graph[n - 1][m - 1]

n, m = map(int, input().split())
graph = []
for _ in range(n):
    graph.append(list(map(int, input())))

print(bfs(0, 0))
