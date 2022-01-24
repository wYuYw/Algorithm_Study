# 1945. 간단한 소인수분해

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    a = b = c = d = e = 0
    N = int(input())
    while(N%2==0):
        N = N//2
        a += 1
    while(N%3==0):
        N = N//3
        b += 1
    while(N%5==0):
        N = N//5
        c += 1
    while(N%7==0):
        N = N//7
        d += 1
    while(N%11==0):
        N = N//11
        e += 1
    print('#{0} {1} {2} {3} {4} {5}'.format(test_case, a, b, c, d, e))
