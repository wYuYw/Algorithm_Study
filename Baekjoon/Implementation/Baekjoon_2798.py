# Baekjoon_2798

# Solution by wYuYw

from itertools import combinations

# N, M, N장의 카드 값 받기
n, m = map(int, input().split())
cards = list(map(int, input().split()))
result = 0

possible_combinations = list(combinations(cards, 3))

for i in range(len(possible_combinations)):
    val = sum(possible_combinations[i])
    if (val <= m) and (result < val):
        result = val

print(result)
