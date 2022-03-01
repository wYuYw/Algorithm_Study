# Leetcode_200. Number of Islands

# Solution_01 - Using BFS (iterative), visited set / DFS의 경우 q.popleft() 대신 q.pop()
# (Runtime, Memory) = (408 ms, 21.9 MB)

class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid:
            return 0

        rows, cols = len(grid), len(grid[0])
        visit = set()
        islands = 0

        def bfs(r, c):
            q = collections.deque()
            visit.add((r, c))
            q.append((r, c))

            while q:
                row, col = q.popleft()
                directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]

                for dr, dc in directions:
                    r, c = row + dr, col + dc
                    if (r in range(rows) and
                        c in range(cols) and
                        grid[r][c] == "1" and
                        (r, c) not in visit):
                        q.append((r, c))
                        visit.add((r, c))


        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == "1" and (r, c) not in visit:
                    bfs(r, c)
                    islands += 1
        return islands
      
      
# Solution_02 - Using DFS (recursive), 해당 행렬에 방문 여부 표기 (1 -> 0); 공간 복잡도 O(n) 감소
# (Runtime, Memory) = (	336 ms, 16.4 MB)

class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid:
            return 0

        def dfs(i, j):
            # 더 이상 땅이 아닌 경우 종료
            if (i < 0 or i >= len(grid) or
                j < 0 or j >= len(grid[0]) or
                grid[i][j] != '1'):
                return

            grid[i][j] = 0

            # 동서남북 탐색
            dfs(i + 1, j)
            dfs(i - 1, j)
            dfs(i, j + 1)
            dfs(i, j - 1)

        cnt = 0
        for r in range(len(grid)):
            for c in range(len(grid[0])):
                if grid[r][c] == "1":
                    dfs(r, c)
                    # 모든 육지 탐색 후 카운트 1 증가
                    cnt += 1
        return cnt
