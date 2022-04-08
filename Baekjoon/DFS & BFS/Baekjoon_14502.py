# Baekjoon_14502 연구소

# Solution by wYuYw

from collections import deque
from itertools import combinations


def bfs(q):
    while q:
        r, c = q.popleft()
        for dir in range(4):
            nr, nc = r + dr[dir], c + dc[dir]
            if 0 <= nr < rows and 0 <= nc < cols and tmp_graph[nr][nc] == 0:
                tmp_graph[nr][nc] = 2
                q.append((nr, nc))


rows, cols = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(rows)]
dr, dc = [0, 0, 1, -1], [1, -1, 0, 0]
q = deque([])

# for all possible cases of building 3 walls
coords = []
for r in range(rows):
    for c in range(cols):
        if graph[r][c] == 0:
            coords.append((r, c))
        if graph[r][c] == 2:
            q.append((r, c))

# # find max room size by bfs
res, size = 0, 0
for possible in combinations(coords, 3):
    # deepcopy
    tmp = deque([])
    for i in range(len(q)):
        tmp.append(q[i])
    tmp_graph = []
    for _ in range(rows):
        tmp_graph = [item[:] for item in graph]

    for i in range(3):
        tmp_graph[possible[i][0]][possible[i][1]] = 1
    bfs(tmp)
    for r in range(rows):
        for c in range(cols):
            if tmp_graph[r][c] == 0:
                size += 1
    res = max(res, size)
    size = 0

print(res)
