# Baekjoon_7562 나이트의 이동

# Solution by wYuYw

from collections import deque
import sys
input = lambda: sys.stdin.readline().strip()

def bfs(r, c):
    q = deque()
    q.append((r, c))
    while q:
        r, c = q.popleft()
        if r == target_r and c == target_c:
            return
        for i in range(8):
            nr, nc = r + dr[i], c + dc[i]
            if 0 <= nr < size and 0 <= nc < size and graph[nr][nc] == 0:
                graph[nr][nc] = graph[r][c] + 1
                q.append((nr, nc))


t = int(input())
for tc in range(1, t+1):
    size = int(input())
    current_r, current_c = map(int, input().split())
    target_r, target_c = map(int, input().split())
    graph = [[0] * size for _ in range(size)]

    dr, dc = [-2, -1, 1, 2, 2, 1, -1, -2], [1, 2, 2, 1, -1, -2, -2, -1]
    bfs(current_r, current_c)
    print(graph[target_r][target_c])
