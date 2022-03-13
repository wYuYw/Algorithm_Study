# Baekjoon_2293 동전 1

# Solution by wYuYw

import sys
input = lambda: sys.stdin.readline().strip()

n, k = map(int, input().split())
coins = []
dp = [0 for _ in range(k + 1)]
dp[0] = 1
for _ in range(n):
    coins.append(int(input()))

for c in coins:
    for i in range(1, k + 1):
        if i - c >= 0:
             dp[i] += dp[i - c]

print(dp[k])
