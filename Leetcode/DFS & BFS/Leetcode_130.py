# Leetcode_130. Surrounded Regions

# Solution by wYuYw

class Solution:
    def solve(self, board: List[List[str]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        dr, dc = [0, 0, 1, -1], [1, -1, 0, 0]
        ROWS, COLS = len(board), len(board[0])
        
        # bfs
        def bfs(r, c):
            q = collections.deque([(r, c)])
            board[r][c] = 1
            while q:
                r, c = q.popleft()
                for dir in range(4):
                    nr, nc = r + dr[dir], c + dc[dir]
                    if 0 <= nr < ROWS and 0 <= nc < COLS and board[nr][nc] == "O":
                        board[nr][nc] = 1
                        q.append((nr, nc))
        
        for r in range(ROWS):
            if board[r][0] == "O":
                bfs(r, 0)
            if board[r][COLS - 1] == "O":
                bfs(r, COLS - 1)
        for c in range(COLS):
            if board[0][c] == "O":
                bfs(0, c)
            if board[ROWS - 1][c] == "O":
                bfs(ROWS - 1, c)
                    
        for r in range(ROWS):
            for c in range(COLS):
                if board[r][c] != 1:
                    board[r][c] = "X"
        
        for r in range(ROWS):
            for c in range(COLS):
                if board[r][c] == 1:
                    board[r][c] = "O"
