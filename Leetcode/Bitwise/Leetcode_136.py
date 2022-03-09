# Leetcode_136. Single Number

# Solution by wYuYw

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        result = 0
        for num in nums:
            result ^= num
        
        return result
