# Leetcode_1. Two Sum

# Solution_01 by wYuYw - Create dict of (key: num, value: index)
# (Runtime, Memory) = (60 ms, 15.2 MB)

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        nums_map = {}
        for i, num in enumerate(nums):
            val = target - num
            if val in nums_map:
                return [nums_map[val], i]
            nums_map[num] = i
            
            
# Solution by wYuYw - Brute Force
# (Runtime, Memory) = (4354 ms, 14.9 MB)

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]
