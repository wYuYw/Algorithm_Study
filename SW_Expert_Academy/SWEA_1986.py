# 1986. 지그재그 숫자

# Solution by wYuYw

T = int(input())

for test_case in range(1, T+1):
    ans = 0
    val = int(input())
    
    for i in range(1, val+1):
        if (i%2==1):
            ans += i
        else:
            ans -= i
    
    print(f'#{test_case} {ans}')
