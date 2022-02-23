# Baekjoon_1287 할 수 있다

# Solution_01 by wYuYw - postfix notation using stack. 해결 못함!

# Baekjoon_1287. 할 수 있다
# https://www.acmicpc.net/problem/1287


# Test cases
# 5+(1+2)*3             # 14
# (3+3)*(1+2)           # 18
# (333+443)*(1+2)       # 2328
# (3*4)/3+7*4           # 32
# 14*15/7*21/15         # 42
# (((153)))             # 153
# ()                    # ROCK
# )(                    # ROCK
# +5+6                  # ROCK
# 5**5                  # ROCK
# 5//5                  # ROCK
# 5/0                   # ROCK
# (((0+1)-1*4           # ROCK




import sys
from collections import deque
input = sys.stdin.readline

priority = {"/": 2, "*": 2, "+": 1, "-": 1, "(": 0} # 연산자 우선순위
deq = deque([]) # 계산을 위해 사용할 stack
result = [] # 후위표기식을 담을 list
eq = input().strip() # 중위표기식 입력 받기
length = len(eq)
is_not_error = True
flag = True # 두 자리수 이상의 숫자를 인식하기 위한 장치
            # eg. eq = '12+1' 일 경우,
            # result = ['1', '2', '1', '+'] 가 아닌 result = ['12', '1', '+']

# change input into postfix notation
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
        temp = deq.pop()
        if temp == "(":
            is_not_error = False
            break
        result.append(temp)
    # print(result) # debug: to check whether result(postfix-notation) is correct

    # calculate
    if is_not_error:
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
    else:
        print("ROCK")

except:
    print("ROCK")

# Solution_02 - eval, pyhtonic solution

S=input()
try:
    eval(S.replace("+","&").replace("-","&").replace("/","&").replace("*","&"))
    print(int(eval(S.replace("/","//"))))
except:print("ROCK")
