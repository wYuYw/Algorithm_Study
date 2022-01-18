#4865. [파이썬 S/W 문제해결 기본] 3일차 - 글자수

from collections import Counter

T = int(input())

for test_case in range(1, T + 1):
    str1 = input()
    str2 = input()
    dic1 = Counter(str1)
    dic2 = Counter(str2)
    max_val = 0
    
    for ch in dic1:
        if(dic2[ch]>max_val):
            max_val = dic2[ch]
    print(f'#{test_case} {max_val}')
