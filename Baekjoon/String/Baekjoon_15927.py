# Baekjoon_15927 회문은 회문아니야!!

# Solution by wYuYw

import sys
input = sys.stdin.readline


word = input().strip()
if word != word[::-1]: print(len(word))
else:
    if word.count(word[0]) == len(word): print(-1)
    else: print(len(word) - 1)
