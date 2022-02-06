# Baekjoon_10798

# Solution by wYuYw

matrix = [[0]*15 for _ in range(5)]

# 2차원 행렬 값 input으로 입력
for i in range(5):
    temp = input()
    for j in range(len(temp)):
        matrix[i][j] = temp[j]


for i in range(15):
    for j in range(5):
        val = matrix[j][i]
        if val == 0:
            continue
        else:
            print(val, end='')
