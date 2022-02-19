# Baekjoon_1592 영식이와 친구들

# Solution by wYuYw

import sys
input = sys.stdin.readline

# 3<=n<=50, 1<=m<=50, 1<=l<=n-1
n, m, l = map(int, input().split())

count = [0] * (n+1)
count[1] = 1
idx = 1

while True:
    if m in count:
        break
    if count[idx] % 2 != 0:
        idx = (idx + l) % n
        if idx == 0:
            idx == n
        count[idx] += 1
    else:
        idx = ((idx - l) + n) % n
        if idx == 0:
            idx == n
        count[idx] += 1

print(sum(count)-1)
