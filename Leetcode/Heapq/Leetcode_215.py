# Leetcode_215. Kth Largest Element in an Array

# Solution_01 by wYuYw - pytonic code
# (Runtime, Memory) = (64 ms, 14.8 MB)

class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        return sorted(nums, reverse=True)[k - 1]


# Solution_02 by wYuYw - using heapq 01
# (Runtime, Memory) = (107 ms, 14.8 MB)

class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        heapq.heapify(nums)
        
        for _ in range(len(nums) - k):
            heapq.heappop(nums)
            
        return heapq.heappop(nums)


# Solution_03 by wYuYw - using heapq 02
# (Runtime, Memory) = (123 ms, 14.8 MB)

class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        nums = [-i for i in nums]
        heapq.heapify(nums)
        
        res = []
        for _ in range(k):
            res.append(heapq.heappop(nums))
        
        return -res[-1]
