# Baekjoon_4963 섬의 개수

# Solution_01 by wYuYw - DFS, recursive
# (Runtime, Memory) = (100 ms, 33.14 MB)

import sys
input = lambda : sys.stdin.readline().strip()
sys.setrecursionlimit(10000)

def dfs(r, c):
    dr = [1, 1, -1, -1, 1, -1, 0, 0]
    dc = [0, 1, 0, 1, -1, -1, 1, -1]

    grid[r][c] = 0

    for i in range(8):
        nr = r + dr[i]
        nc = c + dc[i]
        if 0 <= nr < h and 0 <= nc < w and grid[nr][nc] == 1:
            dfs(nr, nc)

while True:
    w, h = map(int, input().split())
    if w == 0 and h == 0:
        break
    grid = []
    for _ in range(h):
        grid.append(list(map(int, input().split())))

    cnt = 0
    for r in range(h):
        for c in range(w):
            if grid[r][c] == 1:
                dfs(r, c)
                cnt += 1
    print(cnt)
    
    
# Solution_02 by wYuYw - BFS, iterative
# (Runtime, Memory) = (108 ms, 32.42 MB)

from collections import deque
import sys
input = lambda : sys.stdin.readline().strip()

def bfs(r, c):
    dr = [1, -1, 0, 0, 1, -1, 1, -1]
    dc = [0, 0, -1, 1, -1, 1, 1, -1]

    grid[r][c] == 0
    q = deque()
    q.append((r, c))
    while q:
        r, c = q.popleft()
        for i in range(8):
            nr = r + dr[i]
            nc = c + dc[i]
            if 0 <= nr < h and 0 <= nc < w and grid[nr][nc] == 1:
                grid[nr][nc] = 0
                q.append((nr, nc))

while True:
    w, h = map(int, input().split())
    if w == 0 and h == 0:
        break
    grid = []
    for _ in range(h):
        grid.append(list(map(int, input().split())))

    cnt = 0
    for r in range(h):
        for c in range(w):
            if grid[r][c] == 1:
                bfs(r, c)
                cnt += 1
    print(cnt)
