# 1976. 시각 덧셈

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    t1, m1, t2, m2 = map(int, input().split())
    t = t1 + t2
    if(t > 12):
        t %=12
        if(t==0):
            t = 12
    m = m1 + m2
    if(m >= 60):
        t += 1
        m %= 60
        
    print(f'#{test_case} {t} {m}')
