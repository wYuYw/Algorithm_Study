# Baekjoon_3273 두 수의 합

# Solution_01 by wYuYw - Using Two Pointer

import sys
input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))
target = int(input())

nums.sort()
result = 0
left, right = 0, n - 1
while left < right:
    if nums[left] + nums[right] < target:
        left += 1
    elif nums[left] + nums[right] > target:
        right -= 1
    else:
        result += 1
        left += 1
        right -= 1

print(result)


# Solution_02 by wYuYw - Using Dictionary

import sys
input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))
x = int(input())

result = 0
nums_map = {}
for i, num in enumerate(nums):
    target = x - num
    if target in nums_map:
        result += 1
    nums_map[num] = i

print(result)
