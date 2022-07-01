# Leetcode_74. Search a 2D Matrix

# Solution by wYuYw

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows, cols = len(matrix), len(matrix[0])
        
        # find potential row
        rows_left, rows_right = 0, rows - 1
        while rows_left <= rows_right:
            rows_mid = rows_left + ((rows_right - rows_left) // 2)
            if target > matrix[rows_mid][-1]:
                rows_left = rows_mid + 1
            elif target < matrix[rows_mid][0]:
                rows_right = rows_mid - 1
            else:
                break
        
        target_row = rows_left + ((rows_right - rows_left) // 2)
        # find potential col -> find result
        cols_left, cols_right = 0, cols - 1
        while cols_left <= cols_right:
            cols_mid = cols_left + ((cols_right - cols_left) // 2)
            if target > matrix[target_row][cols_mid]:
                cols_left = cols_mid + 1
            elif target < matrix[target_row][cols_mid]:
                cols_right = cols_mid - 1
            else:
                return True
        
        return False
            
