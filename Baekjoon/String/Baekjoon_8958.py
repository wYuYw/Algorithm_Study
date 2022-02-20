# Baekjoon_8958 OX퀴즈

# Solution by wYuYw

n = int(input())

for _ in range(n):
    quiz = input()
    cnt = 0
    result = 0
    for q in quiz:
        if q=="O":
            cnt += 1
            result += cnt
        else:
            cnt = 0
    print(result)
