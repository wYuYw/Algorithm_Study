# Baekjoon_1012 유기농 배추

# Solution by wYuYw

from collections import deque
import sys
input = lambda: sys.stdin.readline().strip()

dr, dc = [-1, 0, 1, 0], [0, 1, 0, -1] # top, right, down, left
def bfs(r, c):
    q = deque()
    grid[r][c] = 0
    q.append((r, c))
    while q:
        r, c = q.popleft()
        for i in range(4):
            nr, nc = r + dr[i], c + dc[i]
            if 0 <= nr < n and 0 <= nc < m and grid[nr][nc] == 1:
                grid[nr][nc] = 0
                q.append((nr, nc))


t = int(input())
for tc in range(1, t+1):
    m, n, k = map(int, input().split())
    grid = [[0] * m for _ in range(n)]
    for _ in range(k):
        c, r = map(int, input().split())
        grid[r][c] = 1

    cnt = 0
    for r in range(n):
        for c in range(m):
            if grid[r][c] == 1:
                bfs(r, c)
                cnt += 1

    print(cnt)
