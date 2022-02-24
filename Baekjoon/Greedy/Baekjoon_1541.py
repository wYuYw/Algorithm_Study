# Baekjoon_1541 잃어버린 괄호

# Solution by wYuYw

import sys
input = sys.stdin.readline

eq = list(input().strip().split("-"))

result = 0
for i in range(len(eq)):
    if "+" in eq[i]:
        temp = list(map(int, eq[i].split("+")))
        eq[i] = sum(temp)
    else:
        eq[i] = int(eq[i])

result = eq[0]
for i in range(1, len(eq)):
    result -= eq[i]

print(result)
