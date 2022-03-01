# Baekjoon_17298 오큰수

# Solution_01 by wYuYw - 시간초과

import sys
from collections import deque
input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))
stack = deque([])
result = []


for i in range(0, n-1):
    flag = True
    for j in range(i+1, n):
        if nums[i] < nums[j]:
            result.append(nums[j])
            flag = False
            break
    if flag:
        result.append(-1)
result.append(-1)

print(*result)

# Solution_02 by wYuYw - Stack 활용

import sys
from collections import deque
input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))
stack = deque([])
result = [-1] * n
stack.append(0)

for i in range(1, n):
    while stack and nums[stack[-1]] < nums[i]:
        result[stack.pop()] = nums[i]
    stack.append(i)

print(*result)
