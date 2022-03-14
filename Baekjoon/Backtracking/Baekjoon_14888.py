# Baekjoon_14888 연산자 끼워넣기

# Solution by wYuYw

import sys
input = lambda: sys.stdin.readline().strip()

n = int(input())
nums = list(map(int, input().split()))
ops = list(map(int, input().split())) # +, -, *, //
max_val, min_val = -1e9, 1e9

def dfs(depth, res, plus, minus, multiply, divide):
    global max_val, min_val
    # base case
    if depth == n:
        max_val = max(max_val, res)
        min_val = min(min_val, res)
        return

    if plus:
        dfs(depth + 1, res + nums[depth], plus - 1, minus, multiply, divide)
    if minus:
        dfs(depth + 1, res - nums[depth], plus, minus - 1, multiply, divide)
    if multiply:
        dfs(depth + 1, res * nums[depth], plus, minus, multiply - 1, divide)
    if divide:
        dfs(depth + 1, int(res / nums[depth]), plus, minus, multiply, divide - 1)

dfs(1, nums[0], ops[0], ops[1], ops[2], ops[3])
print(max_val)
print(min_val)
