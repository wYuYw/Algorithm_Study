# Leetcode_1753 최단경로

# Solution_01 by wYuYw

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

        
# Solution_02 - Faster code

import heapq as hq
import sys
input = sys.stdin.readline
V, E = map(int, input().split())
S = int(input())
graph, dist, INF = [[] for _ in range(V + 1)], [int(1e10)] * (V + 1), int(1e10)
for _ in range(E):
    s, e, d = map(int, input().split())
    graph[s].append((e, d))
#input end
def dijkstra(start: int, dist: list):
    q = [(0, start)]
    dist[start] = 0
    while q:
        cost, cur = hq.heappop(q)
        if dist[cur] < cost: continue
        for nxt, d in graph[cur]:
            nxt_cost = cost + d
            if dist[nxt] > nxt_cost:
                dist[nxt] = nxt_cost
                hq.heappush(q, (nxt_cost, nxt))

dijkstra(S, dist)
for i in range(1, V + 1):
    print("INF" if dist[i] == INF else dist[i])
