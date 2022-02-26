# Leetcode_121. Best Time to Buy and Sell Stock

# Solution_01 by wYuYw - Using Kadane's Algorithm
# (Runtime, Memory) = (1112 ms, 25 MB)

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        min_price = sys.maxsize
        
        for price in prices:
            min_price = min(min_price, price)
            profit = max(profit, price - min_price)
            
        return profit
      
      
# Solution_02 by wYuYw - Using Two Pointers
# (Runtime, Memory) = (1838 ms, 25.1 MB)

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        left, right = 0, 1
        
        while right < len(prices):
            profit = max(profit, prices[right] - prices[left])
            if prices[right] < prices[left]:
                left = right
            right += 1
                
        return profit
