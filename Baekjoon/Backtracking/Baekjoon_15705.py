# Baekjoon_15705 단어 찾기

# Solution by wYuYw

s = input() # uppercase, len(s) <=100
n, m = map(int, input().split()) # 1 <= n: rows, m: columns <= 100
matrix = [list(input()) for _ in range(n)]

path = set() # to make sure not to revisit previous cell


def dfs(r, c, i, status): # (current r, current c, current character)
    # base case
    if i == len(s):
        return True
    if (r < 0 or c < 0 or r >= n or c >= m or
        matrix[r][c] != s[i] or
        (r, c) in path):
        return False

    path.add((r, c))
    if status == 0:
        res = dfs(r + 1, c, i + 1, 0)
    elif status == 1:
        res = dfs(r - 1, c, i + 1, 1)
    elif status == 2:
        res = dfs(r, c + 1, i + 1, 2)
    elif status == 3:
        res = dfs(r, c - 1, i + 1, 3)
    elif status == 4:
        res = dfs(r + 1, c - 1, i + 1, 4)
    elif status == 5:
        res = dfs(r - 1, c + 1, i + 1, 5)
    elif status == 6:
        res = dfs(r + 1, c + 1, i + 1, 6)
    elif status == 7:
        res = dfs(r - 1, c - 1, i + 1, 7)

    path.remove((r, c))
    return res


def print_result():
    for r in range(n):
        for c in range(m):
            if matrix[r][c] == s[0]:
                for status in range(8):
                    if dfs(r, c, 0, status):
                        print(1)
                        return
    print(0)
    return


print_result()
