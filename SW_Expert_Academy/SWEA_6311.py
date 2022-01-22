# 6311. [파이썬 프로그래밍 기초(1) 파이썬의 기본 구조와 기초 문법] 9. 내장함수 4

# map함수: iterator이므로 unpacking이 가능

# Solution by wYuYw

data = "ADCBBBBCABBCBDACBDCAACDDDCAABABDBCBCBDBDBDDABBAAAAAAADADBDBCBDABADCADC"
conv = {"A": 4, "B": 3, "C": 2, "D": 1}

result = sum(map(lambda x: conv[x], data))

print(result)
