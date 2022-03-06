# Baekjoon_2606 바이러스

# Solution by wYuYw

import sys
from collections import defaultdict
input = lambda : sys.stdin.readline().strip()

def dfs(graph, v, visited):
    global cnt
    visited[v] = True
    cnt += 1
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)

n = int(input())
m = int(input())
graph = defaultdict(list)
for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

for i in range(1, n + 1):
    graph[i].sort()

cnt = -1
visited = [False] * (n+1)
dfs(graph, 1, visited)
print(cnt)
