# Leetcode_5 Longest Palindromic Substring

# Solution by wYuYw

class Solution:
    def longestPalindrome(self, s: str) -> str:
        res = (0, 0, 0)

        # base case
        if len(s) < 2 or s == s[::-1]:
            return s

        # validate function
        def validate(left: int, right: int) -> tuple:
            max_length = 0
            while left >= 0 and right < len(s) and s[left] == s[right]:
                if (right - left + 1) > max_length:
                    max_length = right - left + 1
                left -= 1
                right += 1
            
            return (left + 1, right - 1, max_length)
        
        for i in range(len(s)):
            res = max(res, validate(i, i + 1), validate(i, i + 2), key = lambda x:x[2])

        return s[res[0]:res[1] + 1]
