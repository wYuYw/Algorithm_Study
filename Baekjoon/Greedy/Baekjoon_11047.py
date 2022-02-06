#  Baekjoon_11047

# Solution by wYuYw

n, k = map(int, input().split())
money = []
cnt = 0

for _ in range(n):
    money.append(int(input()))

money.sort(reverse=True)
for i in range(n):
    if k == 0:
        break
    if money[i] > k:
        continue
    cnt += k//money[i]
    k %= money[i]

print(cnt)
