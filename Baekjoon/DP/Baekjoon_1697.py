# Baekjoon_1697 숨바꼭질

# Solution by wYuYw

from collections import deque
import sys
input = lambda: sys.stdin.readline().strip()

def bfs():
    q = deque()
    q.append(n)
    while q:
        temp = q.popleft()
        if temp == k:
            return
        for i in (temp - 1, temp + 1, temp * 2):
            if 0 <= i < 100_001 and dp[i] == 0:
                dp[i] = dp[temp] + 1
                q.append(i)

n, k = map(int, input().split())
dp = [0] * 100_001

bfs()
print(dp[k])
