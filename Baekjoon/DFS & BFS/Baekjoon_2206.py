# Baekjoon_2206 벽 부수고 이동하기

# Solution

from collections import deque
import sys
input = lambda: sys.stdin.readline().strip()

def bfs():
    q = deque()
    q.append((0, 0, 1))
    visit = [[[0] * 2 for _ in range(m)] for _ in range(n)]
    visit[0][0][1] = 1
    while q:
        r, c, w = q.popleft()
        if r == n - 1 and c == m - 1:
            return visit[r][c][w]
        for i in range(4):
            nr, nc = r + dr[i], c + dc[i]
            if 0 <= nr < n and 0 <= nc < m:
                if graph[nr][nc] == 1 and w == 1:
                    visit[nr][nc][0] = visit[r][c][1] + 1
                    q.append((nr, nc, 0))
                elif graph[nr][nc] == 0 and visit[nr][nc][w] == 0:
                    visit[nr][nc][w] = visit[r][c][w] + 1
                    q.append((nr, nc, w))
    return -1


dr, dc = [1, -1, 0, 0], [0, 0, 1, -1]
n, m = map(int, input().split())
graph = [list(map(int, input())) for _ in range(n)]
print(bfs())
