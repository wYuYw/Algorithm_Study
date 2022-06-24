# Leetcode_22. Generate Parentheses

# Solution by wYuYW

class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        possible = []
        res = []
        
        # starting_bracket: number of remaining starting brackets
        # closing_bracket: number of remaining closing brackets
        def find_possibles(starting_bracket, closing_bracket):
            # base case
            if closing_bracket == 0 and starting_bracket == 0:
                res.append("".join(possible))
                return
            
            if starting_bracket > 0:
                possible.append("(")
                find_possibles(starting_bracket - 1, closing_bracket)
                possible.pop()
            
            if closing_bracket > starting_bracket:
                possible.append(")")
                find_possibles(starting_bracket, closing_bracket - 1)
                possible.pop()
                
        find_possibles(n, n)
        
        return res
