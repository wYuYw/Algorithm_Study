# Baekjoon_11286 절댓값 힙

# Solution by wYuYw

import sys
import heapq
input = lambda : sys.stdin.readline().strip()

h = []
n = int(input())
for _ in range(n):
    num = int(input())
    if num == 0:
        if h:
            print(heapq.heappop(h)[1])
        else:
            print(0)
    else:
        heapq.heappush(h, (abs(num), num))
