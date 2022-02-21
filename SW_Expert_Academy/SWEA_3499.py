# 3499. 퍼펙트 셔플

# Solution by wYuYw

T = int(input().strip())

for test_case in range(1, T + 1):
    n = int(input())
    cards = list(input().split())
    if n % 2 == 0:
        former = cards[0:n // 2]
        latter = cards[n // 2:n]
    else:
        former = cards[0:n // 2 + 1]
        latter = cards[n // 2 + 1:n]

    result = []
    for i in range(n//2):
        result.append(former[i])
        result.append(latter[i])
    if n % 2 != 0:
        result.append(former[-1])

    print("#" + str(test_case), end=' ')
    for i in range(n):
        print(result[i], end=' ')
    print()
