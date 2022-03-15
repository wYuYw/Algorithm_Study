# Leetcode_79. Word Search

# Solution - Brute Force, DFS, Backtracking
# Time Complexity ~ O(n * m * dfs), O(dfs) ~ 4^len(word)

class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        rows, cols = len(board), len(board[0])
        path = set() # to make sure not to revisit the previous path
        
        def dfs(r, c, i): # (current r, current c, current character)
            if i == len(word):
                return True
            if (r < 0 or c < 0 or
                r >= rows or c >= cols or
                word[i] != board[r][c] or
                (r, c) in path):
                return False
            
            path.add((r, c))
            res = (dfs(r + 1, c, i + 1) or
                   dfs(r - 1, c, i + 1) or
                   dfs(r, c + 1, i + 1) or
                   dfs(r, c - 1, i + 1))
            
            path.remove((r, c))
            return res
        
        for r in range(rows):
            for c in range(cols):
                if board[r][c] == word[0]:
                    if dfs(r, c, 0): return True
        return False
