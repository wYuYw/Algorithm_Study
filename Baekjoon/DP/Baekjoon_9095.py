# Baekjoon_9095 1, 2, 3 더하기

# Solution by wYuYw

dp = [0] * 11
dp[1], dp[2], dp[3] = 1, 2, 4

for i in range(4, 11):
    dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]

t = int(input())
for tc in range(t):
    n = int(input())
    print(dp[n])
