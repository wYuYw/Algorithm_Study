# Baekjoon_1287 할 수 있다

# Solution_01 by wYuYw - postfix notation using stack. 해결 못함!
import sys
from collections import deque
input = sys.stdin.readline

priority = {"/": 2, "*": 2, "+": 1, "-": 1, "(": 0}
deq = deque([])
result = []
eq = input().strip()
length = len(eq)
flag = True

# change into postfix notation
try:
    for i in range(length):
        if eq[i].isdigit() and flag:
            number = eq[i]
            for j in range(i+1, length):
                if eq[j].isdigit():
                    number += eq[j]
                    flag = False
                else:
                    break
            result.append(number)
        elif eq[i] == "(":
            flag = True
            deq.append(eq[i])
        elif eq[i] == ")":
            flag = True
            while True:
                temp = deq.pop()
                if temp == "(": break
                result.append(temp)
        elif eq[i] == "/" or eq[i] == "*" or eq[i] == "+" or eq[i] == "-":
            flag = True
            while deq and priority[deq[-1]] >= priority[eq[i]]:
                result.append(deq.pop())
            deq.append(eq[i])

    while deq:
        result.append(deq.pop())

    # calculate
    deq_calc = deque([])

    for element in result:
        if element.isdigit():
            deq_calc.append(element)
        else:
            if element == "*":
                value1 = int(deq_calc.pop())
                value2 = int(deq_calc.pop())
                deq_calc.append(value2 * value1)
            elif element == "/":
                value1 = int(deq_calc.pop())
                value2 = int(deq_calc.pop())
                deq_calc.append(value2 // value1)
            elif element == "+":
                value1 = int(deq_calc.pop())
                value2 = int(deq_calc.pop())
                deq_calc.append(value2 + value1)
            elif element == "-":
                value1 = int(deq_calc.pop())
                value2 = int(deq_calc.pop())
                deq_calc.append(value2 - value1)
    print(deq_calc[-1])

except:
    print("ROCK")

# Solution_02 - eval, pyhtonic solution

S=input()
try:
    eval(S.replace("+","&").replace("-","&").replace("/","&").replace("*","&"))
    print(int(eval(S.replace("/","//"))))
except:print("ROCK")
