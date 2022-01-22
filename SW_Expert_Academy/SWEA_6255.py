# 6255. [파이썬 프로그래밍 기초(2) 파이썬의 기본 응용] 3. 자료구조 - 셋, 딕셔너리 3

# Solution by wYuYw

# dictionary sort
# key 기준: applies_sorted = dict(sorted(applies.items(), reverse = True))
# value기준: applies_sorted = dict(sorted(applies.items(), key=lambda x: x[1], reverse = True))

applies = {
    "TV": 2000000,
    "냉장고": 1500000,
    "책상": 350000,
    "노트북": 1200000,
    "가스레인지": 200000,
    "세탁기": 1000000
}

applies_sorted = dict(sorted(applies.items(), key=lambda x: x[1], reverse = True))

for key, value in applies_sorted.items():
    print("{0}: {1}".format(key, value))
