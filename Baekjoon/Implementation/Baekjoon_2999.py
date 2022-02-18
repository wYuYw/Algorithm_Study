# Baekjoon_2999 비밀 이메일

# Solution by wYuYw

import sys
from math import sqrt
input = sys.stdin.readline

msg = input().strip()
n = len(msg)

for i in range(1, int(sqrt(n))+1):
    if n % i == 0:
        r = i
        c = n // i

matrix = [[0] * c for _ in range(r)]
k = 0
for j in range(c):
    for i in range(r):
        matrix[i][j] = msg[k]
        k += 1

for i in range(r):
    for j in range(c):
        print(matrix[i][j], end='')
