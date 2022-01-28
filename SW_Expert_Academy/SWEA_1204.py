# 1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기

# Solution by wYuYw

from collections import Counter

T = int(input())

for test_case in range(1, T+1):
    t = int(input())
    nums = list(map(int, input().split()))
    cnt = Counter(nums)
    max_val = max(cnt, key=cnt.get)
    print(f"#{t} {max_val}")
