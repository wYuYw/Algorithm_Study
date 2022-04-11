# Baekjoon_17471 게리맨더링

# Solution by wYuYw

from collections import deque, defaultdict
from itertools import combinations


def bfs(lst):
    q = deque([lst[0]])
    visited = set([lst[0]])
    while q:
        v = q.popleft()
        for u in graph[v]:
            if u not in visited and u in lst:
                q.append(u)
                visited.add(u)
    return len(visited), sum(population[i] for i in visited)


n = int(input())
population = [0] + list(map(int, input().split()))
graph = defaultdict(list)
for i in range(1, n + 1):
    tmp, *graph[i] = map(int, input().split())

res = float('inf')
for i in range(1, n // 2 + 1):
    possibles = combinations(range(1, n + 1), i)
    for possible in possibles:
        districts_a, val_a = bfs(possible)
        districts_b, val_b = bfs(list(set(range(1, n + 1)) - set(possible)))
        if districts_a + districts_b == n:
            res = min(res, abs(val_a - val_b))

print(res if res != float('inf') else -1)
