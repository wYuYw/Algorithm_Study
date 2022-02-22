# 1218. [S/W 문제해결 기본] 4일차 - 괄호 짝짓기

# Solution by wYuYw

from collections import deque

for test_case in range(1, 11):
    n = int(input())
    data = list(input())
    deq = deque([])
    result = 1
    for i in range(n): # '()', '[]', '{}', '<>'
        if data[i] == ")":
            if deq[-1] == "(":
                deq.pop()
            else:
                result = 0
                break
        elif data[i] == "]":
            if deq[-1] == "[":
                deq.pop()
            else:
                result = 0
                break
        elif data[i] == "}":
            if deq[-1] == "{":
                deq.pop()
            else:
                result = 0
                break
        elif data[i] == ">":
            if deq[-1] == "<":
                deq.pop()
            else:
                result = 0
                break
        else:
            deq.append(data[i])
            
    print(f"#{test_case} {result}")
