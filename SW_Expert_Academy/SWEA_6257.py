# 6257. [파이썬 프로그래밍 기초(2) 파이썬의 기본 응용] 3. 자료구조 - 셋, 딕셔너리 5

# Solution by wYuYw

fruit = ['   apple    ','banana','  melon']
# strip(): 공백제거함수
# dictionary 내포로 정의
fruit_dict = {item.strip() : len(item.strip()) for item in fruit}

print(fruit_dict)
