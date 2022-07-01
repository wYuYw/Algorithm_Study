# Leetcode_84. Largest Rectangle in Histogram

# Solution by wYuYw
# (Runtime, Memory) = (1018 ms, 31.5 MB)

class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        stack = []
        prev_idx, prev_height = 0, 0
        res = 0
        for position, height in enumerate(heights):
            if stack and stack[-1][1] > height:
                while stack and stack[-1][1] > height:
                    (prev_idx, prev_height) = stack.pop()
                    res = max(res, (position - prev_idx) * prev_height)
                stack.append((prev_idx, height))
            else:
                stack.append((position, height))
        
        if stack:
            prev_idx = len(heights) - 1
            while stack:
                (cur_idx, cur_height) = stack.pop()
                res = max(res, cur_height * (prev_idx - cur_idx + 1))
            
        return res
