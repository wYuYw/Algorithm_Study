# Baekjoon_20291 파일 정리

# Solution by wYuYw

import sys
from collections import defaultdict
input = sys.stdin.readline

n = int(input())
counter = defaultdict(int)
for i in range(n):
    word = input().strip()
    extension = []
    for j in range(len(word)-1, -1, -1):
        if word[j] == ".": break
        extension.append(word[j])
    extension.reverse()
    counter[''.join(extension)] += 1

result = []
for key, value in counter.items():
    result.append((key, value))
result.sort(key=lambda x: x[0])
for item in result:
    print(item[0], item[1])
