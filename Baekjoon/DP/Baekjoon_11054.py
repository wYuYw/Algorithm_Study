# Baekjoon_11054 가장 긴 바이토닉 부분 수열

# Solution by wYuYw

import sys
input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))

dp_original = [1] * n
for i in range(1, n):
    for j in range(0, i):
        if nums[j] < nums[i]:
            dp_original[i] = max(dp_original[i], dp_original[j] + 1)

nums.reverse()
dp_reversed = [1] * n
for i in range(1, n):
    for j in range(0, i):
        if nums[j] < nums[i]:
            dp_reversed[i] = max(dp_reversed[i], dp_reversed[j] + 1)
dp_reversed.reverse()

dp = [0] * n
for i in range(n):
    dp[i] = dp_original[i] + dp_reversed[i]

result = max(dp) - 1
print(result)
