# Baekjoon_1931 회의실 배정

# Solution by wYuYw

import sys
input = sys.stdin.readline

n = int(input()) # 1 <= n <= 100_000
meetings = sorted([tuple(map(int, input().split())) for _ in range(n)], key=lambda x: (x[1], x[0]))
# print(meetings) # debug
result, end_time = 0, 0
for start, end in meetings:
    if start >= end_time:
        result += 1
        end_time = end

print(result)
