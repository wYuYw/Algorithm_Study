# 1970. 쉬운 거스름돈

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    a1 = N // 50000
    N %= 50000
    a2 = N // 10000
    N %= 10000
    a3 = N // 5000
    N %= 5000
    a4 = N // 1000
    N %= 1000
    a5 = N // 500
    N %= 500
    a6 = N // 100
    N %= 100
    a7 = N // 50
    N %= 50
    a8 = N // 10
    N %= 10
    
    print(f"#{test_case}")
    print(f"{a1} {a2} {a3} {a4} {a5} {a6} {a7} {a8}")
