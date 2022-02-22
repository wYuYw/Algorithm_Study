# Baekjoon_11025 요세푸스 문제 3

# Solution by wYuYw

import sys
input = sys.stdin.readline

n, k = map(int, input().split())
r = 0
for i in range(1, n+1):
    r = (r+k) % i
print(r + 1)
