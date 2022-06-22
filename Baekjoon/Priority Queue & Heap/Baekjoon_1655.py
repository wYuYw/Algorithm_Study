# Baekjoon_1655 가운데를 말해요

# Solution by wYuYw

import heapq
import sys
input = lambda : sys.stdin.readline().strip()

smaller_values, bigger_values = [], []
n = int(input())

for _ in range(n):
    num = int(input())
    if len(smaller_values) == len(bigger_values):
        heapq.heappush(smaller_values, -num)
    else:
        heapq.heappush(bigger_values, num)

    if bigger_values and -smaller_values[0] > bigger_values[0]:
        heapq.heappush(smaller_values, -heapq.heappop(bigger_values))
        heapq.heappush(bigger_values, -heapq.heappop(smaller_values))

    print(-smaller_values[0])
