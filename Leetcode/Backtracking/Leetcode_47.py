# Leetcode_47. Permutations II

# Solution by wYuYw

class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        res = []
        possible = []
        nums_map = collections.Counter(nums)
        
        def dfs():
            # base case
            if len(possible) == len(nums):
                res.append(possible[:])
                return
            
            for i in nums_map:
                if nums_map[i] > 0:
                    possible.append(i)
                    nums_map[i] -= 1
                    
                    dfs()
                    
                    nums_map[i] += 1
                    possible.pop()
                    
        dfs()
        return res
