# Baekjoon_2295 세 수의 합

# Solution by wYuYw

import sys
input = sys.stdin.readline

n = int(input())
u = set(int(input()) for _ in range(n))

a_b_sums = set()
for i in u:
    for j in u:
        a_b_sums.add(i + j)

ans = set()
for i in u:
    for j in u:
        if (i - j) in a_b_sums:
            ans.add(i)

print(max(ans))
