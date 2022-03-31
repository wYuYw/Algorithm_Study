# Baekjoon_2579 계단 오르기

# Solution by wYuYw

n = int(input())
stair = [0] * 301
dp = [0] * 301
for i in range(1, n + 1):
    stair[i] = int(input())

dp[1], dp[2], dp[3] = stair[1], stair[1] + stair[2], max(stair[1], stair[2]) + stair[3]
for i in range(4, n + 1):
    dp[i] = stair[i] + max((stair[i - 1] + dp[i - 3]), dp[i - 2])

print(dp[n])
