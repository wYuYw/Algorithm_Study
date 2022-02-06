# Baekjoon_7568

# Solution by wYuYw

n = int(input())
people = []

for _ in range(n):
    weight, height = map(int, input().split())
    people.append((weight, height))

for person_1 in people:
    rank = 1
    for person_2 in people:
        if(person_1[0]<person_2[0])and(person_1[1]<person_2[1]):
            rank += 1
    print(rank, end=" ")
