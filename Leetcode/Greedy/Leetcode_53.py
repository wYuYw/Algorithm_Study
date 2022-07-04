# Leetcode_53. Maximum Subarray

# Solution by wYuYw

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        res = -10001
        temp = 0
        
        for num in nums:
            temp += num
            res = max(res, temp)
            if temp < 0: temp = 0
                
        return res
