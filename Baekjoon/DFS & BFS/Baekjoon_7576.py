# Baekjoon_7576 토마토

# Solution_01 by wYuYw

from collections import deque
import sys
input = lambda: sys.stdin.readline().strip()


def bfs():
    while q:
        r, c = q.popleft()
        for i in range(4):
            nr, nc = r + dr[i], c + dc[i]
            if 0 <= nr < n and 0 <= nc < m and graph[nr][nc] == 0:
                graph[nr][nc] = graph[r][c] + 1
                q.append((nr, nc))


def get_res():
    global res
    for i in graph:
        for j in i:
            if j == 0:
                return -1
        res = max(res, max(i))
    return res - 1


m, n = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(n)]
q = deque()
for r in range(n):
    for c in range(m):
        if graph[r][c] == 1:
            q.append((r, c))

dr, dc = [-1, 0, 1, 0], [0, 1, 0, -1] # up, right, down, left
res = 0
bfs()
res = get_res()
print(res)


# Solution_02 - Using exit(0) instead of function

from collections import deque

m, n = map(int, input().split())
matrix = [list(map(int, input().split())) for _ in range(n)]
queue = deque([])
dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
res = 0

for i in range(n):
    for j in range(m):
        if matrix[i][j] == 1:
            queue.append([i, j])

def bfs():
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx, ny = dx[i] + x, dy[i] + y
            if 0 <= nx < n and 0 <= ny < m and matrix[nx][ny] == 0:
                matrix[nx][ny] = matrix[x][y] + 1
                queue.append([nx, ny])

bfs()
for i in matrix:
    for j in i:
        if j == 0:
            print(-1)
            exit(0)
    res = max(res, max(i))
print(res - 1)
