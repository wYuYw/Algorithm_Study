# Baekjoon_11729 하노이 탑 이동 순서

# Solution by wYuYw

import sys
# to increase python recursion_limit
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

# separate view and data
def move(a, c):
    print(a, c)

def hanoi(n, a, b, c):
    if n == 1:
        move(a, c)
    else:
        hanoi(n-1, a, c, b)
        move(a, c)
        hanoi(n-1, b, a, c)

n = int(input())
cnt = 2 ** n - 1 # general term

print(cnt)
hanoi(n, 1, 2, 3)
