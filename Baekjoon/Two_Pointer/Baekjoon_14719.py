# Baekjoon_14719 빗물

# Solution by wYuYw

import sys
input = sys.stdin.readline

h, w = map(int, input().split())
height = list(map(int, input().split()))

left, right = 0, w - 1
left_max, right_max = height[left], height[right]
volume = 0

while left < right:
    left_max, right_max = max(left_max, height[left]), max(right_max, height[right])
    if left_max <= right_max:
        volume += left_max - height[left]
        left += 1
    else:
        volume += right_max - height[right]
        right -= 1

print(volume)
