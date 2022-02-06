# Baekjoon_11399

# Solution by wYuYw

n = int(input())
people = list(map(int, input().split()))
num = 0

people.sort()

for i in range(n):
    for j in range(i+1):
        num += people[j]

print(num)
