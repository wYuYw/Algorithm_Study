# Baekjoon_11279 최대 힙

# Solution by wYuYw

import sys
import heapq
input = lambda : sys.stdin.readline().strip()

h = []
n = int(input())
for i in range(n):
    num = int(input())
    if num == 0:
        if h:
            print(-heapq.heappop(h))
        else:
            print(0)
    else:
        heapq.heappush(h, -num)
