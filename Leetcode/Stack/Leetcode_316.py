# Leetcode_316. Remove Duplicate Letters

# Solution by wYuYw

class Solution:
    def removeDuplicateLetters(self, s: str) -> str:
        counter, seen, stack = collections.Counter(s), set(), []
        
        for char in s:
            counter[char] -= 1
            # element in list : O(n), element in set : O(1)
            if char in seen:
                continue
            # 뒤에 붙일 문자가 남아 있다면 stack에서 제거
            while stack and char < stack[-1] and counter[stack[-1]] > 0:
                seen.remove(stack.pop())
            stack.append(char)
            seen.add(char)
            
        return ''.join(stack)
