# 6256. [파이썬 프로그래밍 기초(2) 파이썬의 기본 응용] 3. 자료구조 - 셋, 딕셔너리 4

# Solution by wYuYw

a = {'아메리카노': 1900, '카페모카': 3300, '에스프레소': 1900, '카페라떼': 2500, '카푸치노': 2500, '바닐라라떼': 2900}
b = {'헤이즐럿라떼': 2900, '카페모카': 3300, '밀크커피': 3300, '아메리카노': 1900, '샷크린티라떼': 3300}
a.update(b)

menu = {(key, value) for key, value in a.items() if value>=3000} #solution01
menu = set(filter(lambda x: x[1]>=3000, a.items())) ##solution02

print(menu)
