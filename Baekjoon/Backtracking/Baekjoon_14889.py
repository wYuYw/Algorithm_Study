# Baekjoon_14889 스타트와 링크

# Solution by wYuYw

from itertools import combinations
import sys
input = lambda: sys.stdin.readline().strip()

n = int(input())
s = [list(map(int, input().split())) for _ in range(n)]
members = [i for i in range(n)]
possible = []

for team in list(combinations(members, n//2)):
    possible.append(team)

min_gap = 10000
for i in range(len(possible)//2):
    team = possible[i]
    status_link = 0
    for j in range(n//2):
        member = team[j]
        for k in team:
            status_link += s[member][k]

    team = possible[-i - 1]
    status_start = 0
    for j in range(n//2):
        member = team[j]
        for k in team:
            status_start += s[member][k]

    min_gap = min(min_gap, abs(status_link - status_start))

print(min_gap)
