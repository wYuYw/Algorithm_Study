# 5356. 의석이의 세로로 말해요

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    matrix = []
    for r in range(5):
        matrix.append(list(input()))

    max_length = 0
    for r in matrix:
        if len(r) > max_length:
            max_length = len(r)

    for r in matrix:
        while len(r) < max_length:
            r.append(0)

    result = ''
    for c in range(max_length):
        for r in range(5):
            if matrix[r][c] != 0:
                result += matrix[r][c]

    print(f"#{test_case} {result}")
