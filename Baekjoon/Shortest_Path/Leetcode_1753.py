# Leetcode_1753 최단경로

# Solution by wYuYw

from collections import defaultdict
import heapq
import sys
input = lambda: sys.stdin.readline().strip()

V, E = map(int, input().split())
start = int(input())

graph = defaultdict(list)
for _ in range(E):
    u, v, w = map(int, input().split())
    graph[u].append((v, w))

q = [(0, start)]
dist = defaultdict(int)
while q:
    d, now = heapq.heappop(q)
    if now not in dist:
        dist[now] = d
        for v, w in graph[now]:
            alt = d + w
            heapq.heappush(q, (alt, v))

for i in range(1, V + 1):
    if i not in dist:
        print("INF")
    else:
        print(dist[i])
