# Leetcode_1980. Find Unique Binary String

# Solution by wYuYw

class Solution:
    def findDifferentBinaryString(self, nums: List[str]) -> str:
        
        def dfs(idx, cur):
            # base case
            if idx == len(nums):
                res = cur
                return None if res in nums else res
            
            for c in "01":
                res = dfs(idx + 1, cur + c)
                if res: return res
            
        return dfs(0, "")
