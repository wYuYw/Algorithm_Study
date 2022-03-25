# Leetcode_40. Combination Sum II

# Solution by wYuYw

class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        candidates.sort()
        
        # exclude elements in candidates which are greater than target
        last_idx = len(candidates)
        if max(candidates) > target:
            for c in range(len(candidates)):
                if candidates[c] > target:
                    last_idx = c
                    break
        
        
        def dfs(combi, idx, remain):
            # base case
            if remain == 0:
                res.append(combi[:])
                return
            
            prev = -1 # 1 <= candidates[i] <= 50
            for i in range(idx, last_idx):
                if candidates[i] == prev:
                    continue
                elif remain - candidates[i] < 0:
                    break
                combi.append(candidates[i])
                dfs(combi, i + 1, remain - candidates[i])
                combi.pop()
                
                prev = candidates[i]
        
        dfs([], 0, target)
        return res
