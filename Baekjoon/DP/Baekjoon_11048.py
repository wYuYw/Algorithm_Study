# Baekjoon_11048 이동하기

# Solution by wYuYw

n, m = map(int, input().split())
matrix = []
for r in range(n):
    matrix.append(list(map(int, input().split())))

for i in range(1, m):
    matrix[0][i] += matrix[0][i - 1]
for j in range(1, n):
    matrix[j][0] += matrix[j - 1][0]

for r in range(1, n):
    for c in range(1, m):
        matrix[r][c] += max(matrix[r - 1][c - 1], matrix[r - 1][c], matrix[r][c - 1])

print(matrix[n - 1][m - 1])
