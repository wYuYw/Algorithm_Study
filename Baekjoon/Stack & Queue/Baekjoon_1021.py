# Baekjoon_1021 회전하는 큐

# Solution by wYuYw

import sys
from collections import deque
input = sys.stdin.readline

n, m = map(int, input().split())
nums = deque([i for i in range(1, n+1)])
pop_nums = list(map(int, input().split()))
result = 0

while pop_nums:
    val = pop_nums[0]
    idx = nums.index(val)

    if nums[0] == val:
        nums.popleft()
        pop_nums.pop(0)
    else:
        if idx <= len(nums) // 2:
            nums.rotate(-1)
            result += 1
        elif idx > len(nums) // 2:
            nums.rotate(1)
            result += 1

print(result)
