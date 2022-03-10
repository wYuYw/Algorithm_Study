# Leetcode_169. Majority Element

# Solution_01 by wYuYw - Using DP
# (Runtime, Memory) = (195 ms, 15.5 MB)

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        counts = collections.defaultdict(int)
        for num in nums:
            if counts[num] == 0:
                counts[num] = nums.count(num)
                
            if counts[num] > len(nums) // 2:
                return num


# Solution_02 by wYuYw - Pythonic solution
# (Runtime, Memory) = (312 ms, 15.4 MB)

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        return sorted(nums)[len(nums)//2]


# Solution_03 - Using DQ
# (Runtime, Memory) = (265 ms, 15.6 MB)

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        if not nums:
            return None
        if len(nums) == 1:
            return nums[0]
        
        half = len(nums) // 2
        a = self.majorityElement(nums[:half])
        b = self.majorityElement(nums[half:])
        
        return [b, a][nums.count(a) > half]
