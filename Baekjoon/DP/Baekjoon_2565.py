# Baekjoon_2565 전깃줄

# Solution by wYuYw

n = int(input())
wires = []
for _ in range(n):
    wires.append(tuple(map(int, input().split())))
wires.sort()

dp = [1] * n

for i in range(1, n):
    for j in range(0, i):
        if wires[i][1] > wires[j][1]:
            dp[i] = max(dp[i], dp[j] + 1)

res = n - max(dp)
print(res)
