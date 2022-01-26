# 1948. 날짜 계산기

# Solution by wYuYw

T = int(input())
Months = {1:31, 2:28, 3:31, 4:30, 5:31, 6:30, 7:31, 8:31, 9:30, 10:31, 11:30, 12:31}

for test_case in range(1, T + 1):
    ans = 0
    m1, d1, m2, d2 = map(int, input().split())
    
    if (m1 == m2): ans = d2-d1+1
    
    elif (m1 < m2):
        ans += Months[m1] - d1+1
        ans += d2
        for i in range(m1+1, m2):
            ans += Months[i]
            
    else:
        pass
    
    
    print('#{0} {1}'.format(test_case, ans))
