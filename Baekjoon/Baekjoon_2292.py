# Baekjoon_2292 벌집

# Solution by wYuYw

import sys
input = sys.stdin.readline

n = int(input().rstrip())

a = 1
cnt = 1
while n>a:
    a += 6 * cnt
    cnt += 1

print(cnt)
