# Leetcode_875. Koko Eating Bananas

# Solution by wYuYw

class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        # get hours
        def get_hours(eating_speed):
            hours = 0
            for pile in piles:
                hours += math.ceil(pile / eating_speed)
            
            return hours
        
        min_val, max_val = 1, max(piles)
        res = max_val
        # binary search
        while min_val <= max_val:
            mid_val = min_val + ((max_val - min_val) // 2)
            if h >= get_hours(mid_val):
                res = min(res, mid_val)
                max_val = mid_val - 1
            else:
                min_val = mid_val + 1
        
        return res
