# 1979. 어디에 단어가 들어갈 수 있을까

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    ans = 0

    N, K = map(int, input().split())
    puzzle = [['0']*N]*N
    for i in range(N):
        puzzle[i] = list(input().split())
        ans += ''.join(puzzle[i]).split('0').count('1'*K)
        
    for j in range(N):
        temp = []
        for i in range(N):
            temp.append(puzzle[i][j])
        ans += ''.join(temp).split('0').count('1'*K)
    
    print('#{0} {1}'.format(test_case, ans))
