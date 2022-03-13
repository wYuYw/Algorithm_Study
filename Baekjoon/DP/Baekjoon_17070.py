# Baekjoon_17070 파이프 옮기기 1

# Solution by wYuYw

import sys
input = lambda: sys.stdin.readline().strip()

n = int(input())
matrix = [list(map(int, input().split())) for _ in range(n)]

dp = [[[0 for _ in range(3)] for _ in range(n)] for _ in range(n)] # direction 0, 1, 2 = 가로, 세로, 대각성
for i in range(1, n):
    if matrix[0][i] != 0:
        break
    dp[0][i][0] = 1

for r in range(1, n):
    for c in range(2, n):
        if matrix[r][c] == 0 and matrix[r - 1][c] == 0 and matrix[r][c - 1] == 0:
            dp[r][c][2] = sum(dp[r - 1][c - 1])
        if matrix[r][c] == 0:
            dp[r][c][0] = dp[r][c - 1][0] + dp[r][c - 1][2]
            dp[r][c][1] = dp[r - 1][c][1] + dp[r - 1][c][2]

print(sum(dp[n - 1][n - 1]))
