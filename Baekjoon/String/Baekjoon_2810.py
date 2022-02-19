# Baekjoon_2810 컵홀더

# Solution by wYuYw

import sys
input = sys.stdin.readline

n = int(input())
ppl = input().strip()
num_ppl = len(ppl)
holder = num_ppl + 1

cnt = 0
for ch in ppl:
    if ch == "L":
        cnt += 1

holder -= (cnt // 2)

if holder > num_ppl:
    holder = num_ppl

print(holder)
