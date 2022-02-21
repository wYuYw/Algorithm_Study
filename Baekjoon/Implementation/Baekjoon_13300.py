# Baekjoon_13300 방 배정

# Solution by wYuYw

import sys
input = sys.stdin.readline

n, k = map(int, input().split())
students = []
result = 0
# lengths of boys and girls are 6
girls = [0] * 6
boys = [0] * 6

for _ in range(n):
    gender, year = map(int, input().split())
    if gender == 0:
        girls[year - 1] += 1
        if girls[year - 1] == k:
            girls[year - 1] = 0
            result += 1
    elif gender == 1:
        boys[year - 1] += 1
        if boys[year - 1] == k:
            boys[year - 1] = 0
            result += 1

for i in range(6):
    if girls[i] != 0:
        result += 1
    if boys[i] != 0:
        result += 1

print(result)
