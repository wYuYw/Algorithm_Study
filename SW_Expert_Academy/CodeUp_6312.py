# 6312. [파이썬 프로그래밍 기초(1) 파이썬의 기본 구조와 기초 문법] 9. 내장함수 5

# *params 는 tuple로 입력된다

# Solution by wYuYw

def product (*params):
    val = 1
    for i in params:
        if(type(i)==int):
            val *= i
        else:
            val = "에러발생"
            break
    print(val)

product(1, 2, '4', 3)
