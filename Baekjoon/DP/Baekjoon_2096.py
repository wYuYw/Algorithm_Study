# Baekjoon_2096 내려가기

# Solution by wYuYw

n = int(input())
dp_max = list(map(int, input().split()))
dp_min = dp_max[:]

for _ in range(n - 1):
    l, c, r = map(int, input().split())

    dp_max = [max(dp_max[0], dp_max[1]) + l,
              max(dp_max) + c,
              max(dp_max[1], dp_max[2]) + r]

    dp_min = [min(dp_min[0], dp_min[1]) + l,
              min(dp_min) + c,
              min(dp_min[1], dp_min[2]) + r]

print(max(dp_max), min(dp_min))
