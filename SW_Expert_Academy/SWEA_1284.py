# 1284. 수도 요금 경쟁

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    P, Q, R, S, W = map(int, input().split())
    if (W > R):
        A = W * P
        B = Q + (W-R)*S
        print('#{0} {1}'.format(test_case, min(A, B)))
    else:
        A = W * P
        B = Q
        print('#{0} {1}'.format(test_case, min(A, B)))
