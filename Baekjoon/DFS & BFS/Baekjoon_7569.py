# Baekjoon_7569 토마토

# Solution by wYuYw

from collections import deque
import sys
input = lambda: sys.stdin.readline().strip()


def bfs():
    while q:
        z, r, c = q.popleft()
        for i in range(6):
            nr, nc, nz = r + dr[i], c + dc[i], z + dz[i]
            if 0 <= nr < n and 0 <= nc < m and 0 <= nz < h and graph[nz][nr][nc] == 0:
                graph[nz][nr][nc] = graph[z][r][c] + 1
                q.append((nz, nr, nc))


m, n, h = map(int, input().split())
graph = [[list(map(int, input().split())) for _ in range(n)] for _ in range(h)]
q = deque()
for z in range(h):
    for r in range(n):
        for c in range(m):
            if graph[z][r][c] == 1:
                q.append((z, r, c))

# up, right, down, left, top, bottom
dr, dc, dz = [-1, 0, 1, 0, 0, 0], [0, 1, 0, -1, 0, 0], [0, 0, 0, 0, -1, 1]
flag = True
res = -1
bfs()

for i in graph:
    for j in i:
        for k in j:
            if k == 0:
                flag = False
            res = max(res, k)

if not flag: # not finished
    print(-1)
elif res == 1: # already finished
    print(0)
else:
    print(res - 1)
