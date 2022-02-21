# Baekjoon_14696 딱지놀이

# Solution_01 by wYuYw

import sys
input = sys.stdin.readline

# priority: star > circle > square > triangle; 4 > 3 > 2 > 1
n = int(input())

for i in range(n):
    a = list(map(int, input().rstrip().split()))
    del a[0]
    a_count = [0] * 5
    b = list(map(int, input().rstrip().split()))
    del b[0]
    b_count = [0] * 5

    for num in a:
        a_count[num] += 1
    for num in b:
        b_count[num] += 1

    for j in range(4, 0, -1):
        if a_count[j] > b_count[j]:
            print("A")
            break
        elif a_count[j] < b_count[j]:
            print("B")
            break
        else:
            if j == 1:
                print("D")
                
                
# Solution_02 - Pythonic code

import sys
from collections import Counter
input = sys.stdin.readline

# priority: star > circle > square > triangle; 4 > 3 > 2 > 1
for _ in range(int(input())):
    a, b = Counter(input().split()[1:]), Counter(input().split()[1:])
    for i in '4321':
        if(a[i] != b[i]): print('A' if a[i] > b[i] else 'B'); break
    else: print('D')
