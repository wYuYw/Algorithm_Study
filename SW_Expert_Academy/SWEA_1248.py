# SWEA_1248. [S/W 문제해결 응용] 3일차 - 공통조상

# Solution by wYuYw

from collections import defaultdict
from collections import deque


def count_subtree(tree, start, visited):
    cnt = 0
    q = deque([start])
    visited[start] = True
    while q:
        v = q.popleft()
        cnt += 1
        for i in tree[v]:
            if not visited[i]:
                q.append(i)
                visited[i] = True
    return cnt


def find_LCA(tree, num1, num2):
    ancestors_num1 = []
    while True:
        if num1 == 1:
            break
        for k, v in tree.items():
            if num1 in v:
                ancestors_num1.append(k)
                num1 = k
                break

    while True:
        for k, v in tree.items():
            if num2 in v:
                if k in ancestors_num1:
                    return k
                num2 = k
                break


t = int(input())
for tc in range(1, t + 1):
    v, e, num1, num2 = map(int, input().split())
    visited = [False] * (v + 1)
    given = [int(i) for i in input().split()]
    tree = defaultdict(list)
    for i in range(0, len(given), 2):
        tree[given[i]].append(given[i + 1])

    LCA = find_LCA(tree, num1, num2)
    res = count_subtree(tree, LCA, visited)
    print(f"#{tc} {LCA} {res}")
