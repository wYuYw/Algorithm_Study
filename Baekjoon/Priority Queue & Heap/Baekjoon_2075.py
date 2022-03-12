# Baekjoon_2075 N번째 큰 수

# Solution by wYuYw

import sys
import heapq
input = lambda : sys.stdin.readline().strip()

heap = []
n = int(input())
for _ in range(n):
    nums = list(map(int, input().split()))
    for num in nums:
        heapq.heappush(heap, num)
        while len(heap) > n:
            heapq.heappop(heap)

print(heap[0])
