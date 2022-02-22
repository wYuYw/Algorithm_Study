# Baekjoon_11025 요세푸스 문제

# Solution_01 by wYuYw - Using deque

from collections import deque
import sys
input = sys.stdin.readline

n, k = map(int, input().split())

deq = deque([i for i in range(1, n+1)])
result = []

while deq:
    deq.rotate(-k+1)
    result.append(str(deq.popleft()))

sys.stdout.write("<" + ", ".join(result) + ">")


# Solution_02 by wYuYw - Using modulo

import sys
input = sys.stdin.readline

n, k = map(int, input().split())
arr = [i for i in range(1, n + 1)]

result = []
idx = 0

for _ in range(n):
    idx += k - 1
    if idx >= len(arr):
        idx = idx % len(arr)
    result.append(str(arr.pop(idx)))

print("<", ", ".join(result), ">")
