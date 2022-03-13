# Baekjoon_15686 치킨 배달

# Solution by wYuYw

from itertools import combinations
import sys
input = lambda : sys.stdin.readline().strip()

n, m = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(n)]

house = []
chicken = []
for r in range(n):
    for c in range(n):
        if graph[r][c] == 1: house.append((r, c))
        elif graph[r][c] == 2: chicken.append((r, c))

min_val = 10 ** 9
for ch in combinations(chicken, m):
    sum_val = 0
    for h in house:
        sum_val += min([abs(h[0] - c[0]) + abs(h[1] - c[1]) for c in ch])
        if min_val <= sum_val: break
    if sum_val < min_val: min_val = sum_val

print(min_val)
