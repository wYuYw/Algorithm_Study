# Baekjoon_1157 단어 공부

# Solution_01 by wYuYw

from collections import Counter

word = input().upper()
counter = dict(Counter(word))
result = []
result = [k for k,v in counter.items() if max(counter.values()) == v]

if len(result)==1:
    print(result[0])
else:
    print("?")

    
# Solution_02 by wYuYw

import sys
from collections import Counter
input = sys.stdin.readline

word = input().rstrip().upper()

counter = Counter(word)
result = counter.most_common()

if len(result) == 1:
    print(result[0][0])
else:
    if result[0][1] == result[1][1]:
        print("?")
    else:
        print(result[0][0])
