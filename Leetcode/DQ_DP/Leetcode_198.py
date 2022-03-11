# Leetcode_198. House Robber

# Solution_01 by wYuYw - popitem()

class Solution:
    def rob(self, nums: List[int]) -> int:
        if not nums:
            return 0
        if len(nums) <= 2:
            return max(nums)
        
        dp = collections.defaultdict(int)
        dp[0], dp[1] = nums[0], max(nums[0], nums[1])
        for i in range(2, len(nums)):
            dp[i] = max(dp[i - 1], dp[i - 2] + nums[i])
        
        return dp.popitem()[1]

    
# Solution_02 - Using two variables

class Solution:
    def rob(self, nums: List[int]) -> int:
        rob1, rob2 = 0, 0
        
        for n in nums:
            rob1, rob2 = rob2, max(rob1 + n, rob2)
            
        return rob2
