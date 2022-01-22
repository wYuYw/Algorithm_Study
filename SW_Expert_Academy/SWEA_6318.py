# 6318. [파이썬 프로그래밍 기초(1) 파이썬의 기본 구조와 기초 문법] 9. 내장함수 11

#enumerate으로 index에 따른 dictionary 생성

# Solution by wYuYw

n = 'abcdef'
dic = {}

for i, v in enumerate(n):
    dic[v] = i
    print("{0}: {1}".format(v, dic[v]))
