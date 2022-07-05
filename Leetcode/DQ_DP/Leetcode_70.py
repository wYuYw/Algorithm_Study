# Leetcode_70. Climbing Stairs

# Solution_01 by wYuYw

class Solution:
    def climbStairs(self, n: int) -> int:
        dp = collections.defaultdict(int)
        dp[1], dp[2] = 1, 2
        
        for i in range(3, n + 1):
            dp[i] = dp[i - 1] + dp[i - 2]
        
        return dp[n]
      
      
# Solution_02 by wYuYw

class Solution:
    def climbStairs(self, n: int) -> int:
        x, y = 1, 2
        if n == 1:
            return 1
        if n == 2:
            return 2
        for i in range(n - 2):
            x, y = y, x + y
        
        return y
