# Baekjoon_1287 할 수 있다

# Solution_01 by wYuYw - postfix notation using stack



# Solution_02 - eval

S=input()
try:
    eval(S.replace("+","&").replace("-","&").replace("/","&").replace("*","&"))
    print(int(eval(S.replace("/","//"))))
except:print("ROCK")
