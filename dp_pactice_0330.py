pro = int(input())

if pro == 1:
    # Problem1 statement
    # 1cm 파란 막대, 1cm 노란 막대, 2cm 빨간 막대
    # f(n) = 연결하여 길이가 n cm인 막대를 만드는 방법의 수
    # f(1) = 2, f(2) = 5
    n = int(input())

    dp = [0] * (n + 1)
    dp[1], dp[2] = 2, 5

    for i in range(3, n + 1):
        dp[i] = dp[i - 1] * 2 + dp[i - 2]

    print(dp[n])

    # f(3) 구하기
    # 1cm blue + 2cm 방법;f(2) -> f(2) 개
    # 1cm yellow + 2cm 방법;f(2) -> f(2) 개
    # 2cm red + 1cm 방법;f(1) -> f(1) 개
    
    # f(4) 구하기
    # 1cm blue + 3cm 방법;f(3) -> f(3) 개
    # 1cm yellow + 3cm 방법;f(3) -> f(3) 개
    # 2cm red + 2cm 방법;f(2) -> f(2) 개

    # f(n) = f(n -1) * 2 + f(n - 2)
    # f(6) = 169

elif pro == 2:
    # Problem2 statement
    # 아파트 각 층별로 파란색 or 노란색 칠하기
    # 파란색은 인접한 두 층 연속 사용 불가, 노란색은 가능
    # f(n) = 아파트 칠하는 방법의 수
    # f(1) = 2, f(2) = 3
    n = int(input())

    dp = [0] * (n + 1)
    dp[1], dp[2] = 2, 3

    for i in range(3, n + 1):
        dp[i] = dp[i - 1] + dp[i - 2]

    print(dp[n])

    # f(3) 구하기
    # 1층에 yellow + 두 층 칠하기;f(2) -> f(2) 개
    # 1층에 blue + 2층에는 yellow만 가능 + 한 층 칠하기;f(1) -> f(1) 개
    
    # f(4) 구하기
    # 1층에 yellow + 세 층 칠하기;f(3) -> f(3) 개
    # 1층에 blue + 2층에는 yellow만 가능 + 두 층 칠하기;f(2) -> f(2) 개

    # f(n) = f(n -1) + f(n - 2)
    # f(8) = 55

else:
    print("Choose problem1 or problem2:\n1 or 2?")
