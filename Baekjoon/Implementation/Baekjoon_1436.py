# Baekjoon_1436

# Solution by wYuYw

n = int(input())
cnt = 0

if n==1:
    print(666)
else:
    for i in range(6666666):
        if "666" in str(i):
            cnt += 1
        if n == cnt:
            print(i)
            break
