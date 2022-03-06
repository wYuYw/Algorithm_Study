# Baekjoon_2667 단지번호붙이기

# Solution by wYuYw

from collections import deque
import sys
input = lambda : sys.stdin.readline().strip()

# down, up, left, right
dr, dc = [1, -1, 0, 0], [0, 0, -1, 1]
cnt_house = 0


def bfs(r, c):
    global cnt_house
    grid[r][c] = 0
    cnt_house += 1
    q = deque()
    q.append((r, c))
    while q:
        r, c = q.popleft()
        for i in range(4):
            nr = r + dr[i]
            nc = c + dc[i]
            if 0 <= nr < n and 0 <= nc < n and grid[nr][nc] == '1':
                grid[nr][nc] = 0
                cnt_house += 1
                q.append((nr, nc))


n = int(input())
grid = []
for _ in range(n):
    grid.append(list(input()))

cnt_village = []
for r in range(n):
    for c in range(n):
        if grid[r][c] == '1':
            bfs(r, c)
            cnt_village.append(cnt_house)
            cnt_house = 0
cnt_village.sort()
print(len(cnt_village))
for i in range(len(cnt_village)):
    print(cnt_village[i])
