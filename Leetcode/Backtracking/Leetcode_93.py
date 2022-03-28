# Leetcode_93. Restore IP Addresses

# Solution by wYuYW

class Solution:
    def restoreIpAddresses(self, s: str) -> List[str]:
        res = []
        cur = []
        
        # impossible to generate valid IP
        if len(s) < 4 or len(s) > 12: 
            return res
        
        
        def dfs(idx, dots):
            # base case
            if dots == 0:
                if idx == len(s):
                    res.append(".".join(cur[:]))
                    return
                return
            
            for i in range(idx, min(idx + 3, len(s))):
                digit = s[idx:i + 1]
                if (dots * 3 < len(s[i:]) or
                    (digit[0] == "0" and len(digit) > 1) or
                    int(digit) > 255):
                    return
                
                cur.append(digit)
                dfs(i + 1, dots - 1)
                cur.pop()

        dfs(0, 4)
        return res
