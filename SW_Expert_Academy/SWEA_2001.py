# 2001. 파리 퇴치

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    max_val = 0
    N, M = map(int, input().split())
    matrix = [list(map(int, input().split())) for _ in range(N)]
    
    for n in range(N-M+1):
        for m in range(N-M+1):
            temp = 0
            for i in range(M):
                for j in range(M):
                    temp += matrix[i+n][j+m]
            if(max_val<temp):
                max_val = temp
            
    print(f"#{test_case} {max_val}")
