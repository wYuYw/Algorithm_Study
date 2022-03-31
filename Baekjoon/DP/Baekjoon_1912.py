# Baekjoon_1912 연속합

# Solution by wYuYw

n = int(input())
nums = list(map(int, input().split()))

for i in range(1, len(nums)):
    nums[i] += nums[i - 1] if nums[i - 1] > 0 else 0
print(max(nums))
