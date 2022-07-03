# Leetcode_4. Median of Two Sorted Arrays

# Solution by wYuYw

class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums = nums1 + nums2
        nums.sort()
        
        res = 0
        mid = len(nums) // 2
        
        if len(nums) % 2 == 0:
            res = (nums[mid - 1] + nums[mid]) / 2
        else:
            res = nums[mid]
        
        return res
