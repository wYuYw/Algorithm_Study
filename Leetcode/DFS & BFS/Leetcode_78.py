# Leetcode_78. Subsets

# Solution_01
# (Runtime, Memory) = (62 ms, 14.2 MB)

class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = []

        def dfs(index, path):
            # 매번 결과 추가
            res.append(path)

            # 경로를 만들면서 DFS
            for i in range(index, len(nums)):
                dfs(i + 1, path + [nums[i]])

        dfs(0, [])
        return res
      
      
# Solution_02
# (Runtime, Memory) = (41 ms, 14.2 MB)

class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = []

        subset = []
        def dfs(i):
            if i >= len(nums):
                res.append(subset[:])
                return

            # decision to include nums[i]
            subset.append(nums[i])
            dfs(i + 1)

            # decision NOT to include nums[i]
            subset.pop()
            dfs(i + 1)

        dfs(0)
        return res
