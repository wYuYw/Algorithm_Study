# Baekjoon_2023 신기한 소수

# Solution by wYuYw

import sys
import math
input = sys.stdin.readline

def calc(num):
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return

    if len(str(num)) == n:
        print(num)
        return

    for k in ["1", "3", "7", "9"]:
        calc(int(str(num) + k))

n = int(input())
possible_starts = [2, 3, 5, 7]

for p in possible_starts:
    calc(p)
