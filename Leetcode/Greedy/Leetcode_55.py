# Leetcode_55. Jump Game

# Solution by wYuYw

class Solution:
    def canJump(self, nums: List[int]) -> bool:
        target = len(nums) - 1
        for i in range(len(nums) - 2, -1, -1):
            if nums[i] >= target - i:
                target = i
        
        if target <= 0:
            return True
        return False
