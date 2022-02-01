# 1859. 백만 장자 프로젝트

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    future_price = list(map(int, input().split()))
    val = future_price[-1]
    result = 0
    for i in range(N-2, -1, -1):
        if future_price[i]>val:
            val = future_price[i]
        else:
            result += (val-future_price[i])
            
    print(f"#{test_case} {result}")
