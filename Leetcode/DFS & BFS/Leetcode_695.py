# Leetcode_695. Max Area of Island

# Solution by wYuYw

class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        res = 0
        dr, dc = [0, 0, 1, -1], [1, -1, 0, 0]
        rows, cols = len(grid), len(grid[0])
        
        # bfs
        def bfs(r: int, c: int) -> int:
            q = collections.deque([(r, c)])
            grid[r][c] = 0
            temp = 1
            while q:
                r, c = q.popleft()
                for dir in range(4):
                    nr, nc = r + dr[dir], c + dc[dir]
                    if 0 <= nr < rows and 0 <= nc < cols and grid[nr][nc] == 1:
                        q.append((nr, nc))
                        grid[nr][nc] = 0
                        temp += 1
            return temp
        
        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == 1:
                    res = max(res, bfs(r, c))
                    
        return res
