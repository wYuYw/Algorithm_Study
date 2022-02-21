# 1493. 수의 새로운 연산

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    p, q = map(int, input().split())
    n = 1; m = 1
    while True:
        if p <= (n * (n + 1)) // 2:
            break
        else:
            n += 1
    while True:
        if q <= (m * (m + 1)) // 2:
            break
        else:
            m += 1
    p -= (n * (n - 1)) // 2
    a = (n + 1) - p
    q -= (m * (m - 1)) // 2
    b = (m + 1) - q
    x = p + q; y = a + b
    l = x + y - 2
    result = x + (l * (l + 1)) // 2

    print(f"#{test_case} {result}")
