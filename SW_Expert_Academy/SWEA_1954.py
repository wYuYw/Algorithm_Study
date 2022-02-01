# 1954. 달팽이 숫자

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    arr = [[0]*N for _ in range(N)]
    # right, down, left, up
    dr = [0, 1, 0, -1]
    dc = [1, 0, -1, 0]
    # direction [0, 1, 2, 3] = [right, down, left, up]
    r, c, direction = 0, 0, 0
    
    for num in range(1, N*N+1):
        arr[r][c] = num
        r += dr[direction]
        c += dc[direction]
        
        if r<0 or c<0 or r>=N or c>=N or arr[r][c] != 0:
            r -= dr[direction]
            c -= dc[direction]
            direction = (direction+1)%4
            r += dr[direction]
            c += dc[direction]
    
    print(f"#{test_case}")
    for row in arr:
        print(*row)
    print()
