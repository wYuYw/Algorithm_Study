# Baekjoon_3985 롤 케이크

# Solution by wYuYw

import sys
input = sys.stdin.readline

l = int(input())
cake = [0 for i in range(l+1)]
n = int(input())
original_val1, original_val2 = 0, 0
result1, result2 = 0, 0
for i in range(1, n+1):
    p, k = map(int, input().split())
    temp = k - p
    if temp > original_val1:
        original_val1 = temp
        result1 = i

    for j in range(p, k+1):
        if cake[j] == 0:
            cake[j] = i

    for c in cake:
        if c != 0:
            if cake.count(c) > original_val2:
                original_val2 = cake.count(c)
                result2 = c

print(result1)
print(result2)
