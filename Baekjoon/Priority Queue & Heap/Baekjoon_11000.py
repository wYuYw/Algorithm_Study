# Baekjoon_11000 강의실 배정

# Solution by wYuYw

import heapq
import sys
input = lambda: sys.stdin.readline().strip()

n = int(input()) # 1 ≤ N ≤ 200,000
times = [tuple(map(int, input().split())) for _ in range(n)]
times.sort()

classrooms = []
heapq.heappush(classrooms, times[0][1])
for i in range(1, n):
    if times[i][0] < classrooms[0]:
        heapq.heappush(classrooms, times[i][1])
    else:
        heapq.heappop(classrooms)
        heapq.heappush(classrooms, times[i][1])

print(len(classrooms))
