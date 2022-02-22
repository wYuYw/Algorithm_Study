# Baekjoon_11025 요세푸스 문제 3

# Solution_01 by wYuYw - 시간초과

import sys
input = sys.stdin.readline

n, k = map(int, input().split())
result = 0
for i in range(1, n+1):
    result = (result + k - 1) % i + 1
print(result)


# Solution_02 by wYuYw - Simplify

import sys
input = sys.stdin.readline

n, k = map(int, input().split())
r = 0
for i in range(1, n+1):
    r = (r+k) % i
print(r + 1)
