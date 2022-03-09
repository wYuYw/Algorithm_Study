# Leetcode_704. Binary Search

# Solution_01 by wYuYw - Recursive
# (Runtime, Memory) = (519 ms, 22.8 MB)

class Solution:
    def search(self, nums: List[int], target: int) -> int:
        def binary_search(left, right):
            if left <= right:
                mid = (left + right) // 2
                
                if nums[mid] < target:
                    return binary_search(mid + 1, right)
                elif nums[mid] > target:
                    return binary_search(left, mid - 1)
                else:
                    return mid
                
            else:
                return -1
            
        return binary_search(0, len(nums) - 1)


# Solution_02 by wYuYw - Iterative
# (Runtime, Memory) = (240 ms,	15.5 MB)

class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left, right = 0, len(nums) - 1
        while left <= right:
            mid = (left + right) // 2
            
            if nums[mid] < target:
                left = mid + 1
            elif nums[mid] > target:
                right = mid - 1
            else:
                return mid  
        return -1


# Solution_03 by wYuYw - Module
# (Runtime, Memory) = (609 ms, 15.4 MB)

class Solution:
    def search(self, nums: List[int], target: int) -> int:
        index = bisect.bisect_left(nums, target)
        
        if index < len(nums) and nums[index] == target:
            return index
        else:
            return -1
