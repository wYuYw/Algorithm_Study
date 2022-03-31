# Baekjoon_11727 2×n 타일링 2

# Solution by wYuYw

n = int(input())
dp = [0] * 1001
dp[1], dp[2] = 1, 3

for i in range(3, n + 1):
    dp[i] = dp[i - 1] + dp[i - 2] * 2

print(dp[n] % 10007)
