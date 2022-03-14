# Baekjoon_2003 수들의 합 2

# Solution by wYuYw

import sys
input = lambda: sys.stdin.readline().strip()

n, m = map(int, input().split())
nums = list(map(int, input().split()))

left, right = 0, 1
cnt = 0
while left <= right <= n:
    sum_val = sum(nums[left:right])
    if sum_val == m:
        cnt += 1
        right += 1
        left += 1
    elif sum_val < m:
        right += 1
    else:
        left += 1

print(cnt)
