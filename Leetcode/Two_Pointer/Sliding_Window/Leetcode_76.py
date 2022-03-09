# Leetcode_76. Minimum Window Substring

# Solution_01 - have dict, need dict
# (Runtime, Memory) = (106 ms, 14.6 MB)

class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if t == "": return ""
        
        countT, window = {}, {}
        
        for c in t:
            countT[c] = 1 + countT.get(c, 0)
            
        have, need = 0, len(countT)
        res, res_len = [-1, -1], float("infinity")
        left = 0
        for r in range(len(s)):
            c = s[r]
            window[c] = 1 + window.get(c, 0)
            
            if c in countT and window[c] == countT[c]:
                have += 1
                
            while have == need:
                # update our result
                if (r - left + 1) < res_len:
                    res = [left, r]
                    res_len = (r - left + 1)
                # pop from the left of our window
                window[s[left]] -= 1
                if s[left] in countT and window[s[left]] < countT[s[left]]:
                    have -= 1
                left += 1
                
        left, r = res
        return s[left:r+1] if res_len != float("infinity") else ""


# Solution_02 - Skipping unnecessary
# (Runtime, Memory) = (138 ms, 14.7 MB)

class Solution:
    def minWindow(self, s: str, t: str) -> str:
        need = collections.Counter(t)
        missing = len(t)
        left, start, end = 0, 0, 0
        
        # 오른쪽 포인터 이동
        for right, char in enumerate(s, 1):
            missing -= need[char] > 0
            need[char] -= 1
            
            # 필요 문자가 0이면 왼쪽 포인터 이동 판단
            if missing == 0:
                while left < right and need[s[left]] < 0:
                    need[s[left]] += 1
                    left += 1
                    
                if not end or right - left <= end - start:
                    start, end = left, right
                    need[s[left]] += 1
                    missing += 1
                    left += 1
        return s[start:end]
