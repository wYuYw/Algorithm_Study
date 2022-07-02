# Leetcode_153. Find Minimum in Rotated Sorted Array

# Solution by wYuYw

class Solution:
    def findMin(self, nums: List[int]) -> int:
        left, right = 0, len(nums) - 1
        res = 5001 # -5000 <= nums[i] <= 5000
        
        while left <= right:
            # monotonic increasing portion
            if nums[left] < nums[right]:
                res = min(res, nums[left])
                break

            mid = left + ((right - left) // 2)
            res = min(res, nums[mid])
            
            # left portion -> move to right
            if nums[left] <= nums[mid]:
                left = mid + 1

            # right portion -> move to left
            else:
                right = mid - 1
            
        return res
