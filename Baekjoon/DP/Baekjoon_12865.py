# Baekjoon_12865 평범한 배낭

# Solution by wYuYw

import sys
input = sys.stdin.readline

n, k = map(int, input().split())
products = []
dp = [0] * (k+1)
for _ in range(n):
    w, v = map(int, input().split())
    products.append((w, v))

for w, v in products:
    for i in range(k, w-1, -1):
        dp[i] = max(dp[i], dp[i-w]+v)

print(dp[-1])
