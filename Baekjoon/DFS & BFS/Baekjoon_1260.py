# Baekjoon_1260 DFS와 BFS

# Solution by wYuYw

import sys
from collections import defaultdict, deque
input = lambda : sys.stdin.readline().strip()

def dfs(graph, v, visited):
    visited[v] = True
    print(v, end=' ')
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)

def bfs(graph, v, visited):
    visited[v] = True
    q = deque([v])
    while q:
        v = q.popleft()
        print(v, end=' ')
        for i in graph[v]:
            if not visited[i]:
                q.append(i)
                visited[i] = True

n, m, v = map(int, input().split())
graph = defaultdict(list)
for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)
for i in range(1, n + 1):
    graph[i].sort()

visited = [False] * (n+1)
dfs(graph, v, visited)
print()
visited = [False] * (n+1)
bfs(graph, v, visited)
