# Leetcode_238. Product of Array Except Self

# Solution by wYuYw

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)
        
        prefix = 1
        for i in range(len(nums)):
            res[i] = prefix
            prefix *= nums[i]
        
        postfix = 1
        for i in reversed(range(len(nums))):
            res[i] *= postfix
            postfix *= nums[i]
            
        return res
