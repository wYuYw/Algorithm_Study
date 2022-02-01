# 2005. 파스칼의 삼각형

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    matrix = [[0]*N for _ in range(N)]
    for i in range(N):
        matrix[i][0] = 1
        matrix[i][i] = 1
    if N>=3:
        for i in range(2, N):
            for j in range(1, i):
                matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j]
                
    print(f"#{test_case}")
    for i in range(N):
        for j in range(N):
            if(matrix[i][j] != 0):
                print(matrix[i][j], end=" ")
        print()
