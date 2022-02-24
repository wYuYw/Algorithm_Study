# Baekjoon_1018 체스판 다시 칠하기

# Solution by wYuYw

import sys
input = sys.stdin.readline

n, m = map(int, input().split())
board = []
result = 2500

for _ in range(n):
    board.append(input().strip())

for i in range(n - 7):
    for j in range(m - 7):
        cnt_first_white = 0
        cnt_first_black = 0
        for p in range(i, i + 8):
            for q in range(j, j + 8):
                if (p + q) % 2 == 0:
                    if board[p][q] != "W": cnt_first_white += 1
                    if board[p][q] != "B": cnt_first_black += 1
                else:
                    if board[p][q] != "B": cnt_first_white += 1
                    if board[p][q] != "W": cnt_first_black += 1
        result = min(result, cnt_first_black, cnt_first_white)

print(result)
