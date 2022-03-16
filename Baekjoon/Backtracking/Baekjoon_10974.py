# Baekjoon_10974. 모든 순열

# Solution by wYuYw

n = int(input()) # 1 ≤ N ≤ 8
nums = [i for i in range(1, n + 1)]

res = []


def dfs(depth, v):
    # base case
    if depth == len(nums):
        res.append(v)
        return

    for num in nums:
        tmp = v[:]
        if num not in tmp:
            tmp.append(num)
            dfs(depth + 1, tmp)

dfs(0, [])
for result in res:
    print(*result)
