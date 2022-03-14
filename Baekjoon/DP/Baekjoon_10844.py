# Baekjoon_10844 쉬운 계단 수

# Solution_01 by wYuYw - Brute Force; Time limit exceeded

import sys
input = lambda: sys.stdin.readline().strip()

n = int(input())
start, end = int('1' + '0' * (n - 1)), int('1' + '0' * n)
flag = True
cnt = 0

for i in range(start, end):
    if i == 1:
        flag = False
        break
    num = str(i)
    for j in range(1, len(num)):
        if abs(int(num[j - 1]) - int(num[j])) != 1:
            break
        if j == len(num) - 1:
            cnt += 1


if flag:
    print(cnt % 1000000000)
else:
    print(9)
    

# Solution_02 by wYuYw - DP
# 규칙성 찾기

n = int(input())
dp = [[0 for i in range(10)] for j in range(101)]
for i in range(1, 10):
    dp[1][i] = 1
for i in range(2, n + 1):
    for j in range(10):
        if j == 0:
            dp[i][j] = dp[i - 1][1]
        elif j == 9:
            dp[i][j] = dp[i - 1][8]
        else:
            dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j + 1]
print(sum(dp[n]) % 1000000000)
