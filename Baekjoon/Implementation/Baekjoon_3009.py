# Baekjoon_3009 네 번째 점

# Solution by wYuYw

import sys
from collections import Counter
input = sys.stdin.readline

xs = []
ys = []
for _ in range(3):
    x, y = map(int, input().split())
    xs.append(x)
    ys.append(y)

for i in range(3):
    if xs.count(xs[i]) == 1:
        x = xs[i]
    if ys.count(ys[i]) == 1:
        y = ys[i]

print(x, y)
