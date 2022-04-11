# SWEA_2115. [모의 SW 역량테스트] 벌꿀채취

# Solution by wYuYw

def dfs(idx, cnt, sum_val, lst):
    global sol
    if cnt > c:
        return
    if idx == m:
        sol = max(sol, sum_val)
        return

    dfs(idx + 1, cnt + lst[idx], sum_val + lst[idx] ** 2, lst)
    dfs(idx + 1, cnt, sum_val, lst)


t = int(input())
for tc in range(1, t + 1):
    n, m, c = map(int, input().split())
    graph = [list(map(int, input().split())) for _ in range(n)]
    res = 0

    dp = [[0] * n for _ in range(n)]
    for i in range(n):
        for j in range(n - m + 1):
            sol = 0
            dfs(0, 0, 0, graph[i][j:j + m])
            dp[i][j] = sol

    for i1 in range(n):
        for j1 in range(n - m + 1):
            for i2 in range(i1, n):
                sj = 0
                if i1 == i2:
                    sj = j1 + m
                for j2 in range(sj, n - m + 1):
                    res = max(res, dp[i1][j1] + dp[i2][j2])

    print(f"#{tc} {res}")
