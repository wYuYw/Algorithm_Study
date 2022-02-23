# Baekjoon_9184 신나는 함수 실행

# Solution by wYuYw

import sys
input = sys.stdin.readline

def w(a, b, c):
    if a <= 0 or b <= 0 or c <= 0:
        return 1

    elif a > 20 or b > 20 or c > 20:
        return w(20, 20, 20)

    if dp[a][b][c]:
        return dp[a][b][c]

    elif a < b < c:
        dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c)
        return dp[a][b][c]
    else:
        dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1)
        return dp[a][b][c]

dp = [[[0]*(21) for _ in range(21)] for _ in range(21)]

result = 0
while True:
    a, b, c = map(int, input().split()) # -50 <= a, b, c <= 50
    if a == -1 and b == -1 and c == -1:
        break
    result = w(a, b, c)
    print(f"w({a}, {b}, {c}) = {result}")
