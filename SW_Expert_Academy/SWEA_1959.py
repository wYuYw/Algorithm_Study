# 1959. 두 개의 숫자열

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    ans = 0
    temp = 0
    N, M = map(int, input().split())
    A = list(map(int, input().split()))
    B = list(map(int, input().split()))

    if min(N, M) == N:
        for j in range(M-N+1):
            for i in range(N):
            	temp += A[i]*B[i+j]
            if (ans < temp):
                ans = temp
            temp = 0
                    
    elif min(N, M) == M:
        for j in range(N-M+1):
            for i in range(M):
            	temp += A[i+j]*B[i]
            if (ans < temp):
                ans = temp
            temp = 0
                    
    else:
        for i in range(N):
            ans += A[i]*B[i]
        
    print('#{0} {1}'.format(test_case, ans))
