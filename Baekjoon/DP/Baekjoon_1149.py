# Baekjoon_1149 RGB거리

# Solution by wYuYw

import sys
input = sys.stdin.readline

n = int(input())
dp = []
for r in range(n):
    dp.append(list(map(int, input().split())))

for i in range(1, n):
    dp[i][0] = dp[i][0] + min(dp[i - 1][1], dp[i - 1][2])
    dp[i][1] = dp[i][1] + min(dp[i - 1][0], dp[i - 1][2])
    dp[i][2] = dp[i][2] + min(dp[i - 1][0], dp[i - 1][1])

result = min(dp[-1][0], dp[-1][1], dp[-1][2])
print(result)
