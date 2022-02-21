# Baekjoon_17413 단어 뒤집기 2

# Solution_01 by wYuYw

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


# Solution_02 vy wYuYw - Using stack

ans = ""
tag = False
stack = ""
for i in input():
    if i == "<":
        tag = True
        ans += stack[::-1]
        stack = ""
        ans += i
        continue
    elif i == ">":
        tag = False
        ans += i
        continue
    elif i == " ":
        ans += stack[::-1] + " "
        stack = ""
        continue
        
    if tag:
        ans += i
    else:
        stack += i
print(ans+stack[::-1])
