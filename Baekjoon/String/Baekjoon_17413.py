# Baekjoon_17413 단어 뒤집기 2

# Solution by wYuYw

import sys
input = sys.stdin.readline

sentence = input().strip()
result = []
temp = []

i = 0
while i <= len(sentence)-1:
    if sentence[i] == '<':
        for t in temp[::-1]:
            result.append(t)
        temp.clear()
        result.append('<')
        while True:
            i += 1
            if sentence[i-1] == '>':
                break
            result.append(sentence[i])
    elif sentence[i] == ' ':
        for t in temp[::-1]:
            result.append(t)
        result.append(' ')
        temp.clear()
        i += 1
    else:
        temp.append(sentence[i])
        i += 1

for t in temp[::-1]:
    result.append(t)

print(''.join(result))
