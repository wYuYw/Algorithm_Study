# Leetcode_42. Trapping Rain Water

# Solution_01 by wYuYw - Two Pointer

class Solution:
    def trap(self, height: List[int]) -> int:
        if not height: return 0
        
        volume = 0
        left, right = 0, len(height) - 1
        left_max, right_max = height[left], height[right]
        
        while left < right:
            left_max, right_max = max(height[left], left_max), max(height[right], right_max)
            if left_max <= right_max:
                volume += left_max - height[left]
                left += 1
            else:
                volume += right_max - height[right]
                right -= 1
        
        return volume

# Solution_02 by wYuYw - Two Pointer, split left and right

class Solution:
    def trap(self, height: List[int]) -> int:
        
        volume = 0
        max_height_idx = height.index(max(height))
        
        # left side of max_height
        left, left_max = 0, height[0]
        while left < max_height_idx:
            if height[left] >= left_max:
                left_max = max(left_max, height[left])
            else:
                volume += left_max - height[left]
            left += 1
        
        # right side of max_height
        right, right_max = len(height) - 1, height[len(height) - 1]
        while right > max_height_idx:
            if height[right] >= right_max:
                right_max = max(right_max, height[right])
            else:
                volume += right_max - height[right]
            right -= 1
        
        return volume
      
# Solution_03 - Using stack

class Solution:
    def trap(self, height: List[int]) -> int:
        stack = collections.deque([])
        volume = 0
        
        for i in range(len(height)):
            # 변곡점을 만나는 경우
            while stack and height[i] > height[stack[-1]]:
                top = stack.pop()
                
                if not len(stack):
                    break
                    
                distance = i - stack[-1] - 1
                waters = min(height[i], height[stack[-1]]) - height[top]
                
                volume += distance * waters
                
            stack.append(i)
        return volume
