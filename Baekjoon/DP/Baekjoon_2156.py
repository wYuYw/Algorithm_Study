# Baekjoon_2156 포도주 시식

# Solution by wYuYw

n = int(input())
wines = [0] * 10001
for i in range(1, n + 1):
    wines[i] = int(input())
dp = [0] * 10001
dp[1], dp[2] = wines[1], wines[2] + wines[1]

for i in range(3, n + 1):
    dp[i] = max(dp[i - 1], wines[i - 1] + dp[i - 3] + wines[i], dp[i - 2] + wines[i])

print(dp[n])
