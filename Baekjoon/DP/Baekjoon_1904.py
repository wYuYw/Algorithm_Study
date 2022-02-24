# Baekjoon_1904 01타일

# Solution by wYuYw

import sys
input = sys.stdin.readline

n = int(input())
dp = [0] * 1_000_001
dp[1] = 1
dp[2] = 2
for i in range(3, n + 1):
    dp[i] = (dp[i-1] + dp[i-2]) % 15746
print(dp[n])
