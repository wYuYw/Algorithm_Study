# Baekjoon_1244 스위치 켜고 끄기

# Solution by wYuYw

import sys
input = sys.stdin.readline

N = int(input())
switch = [-1] + list(map(int, input().split()))
students = int(input())
for _ in range(students):
    gender, num = map(int, input().split())
    # male
    if gender == 1:
        for i in range(num, N+1, num):
            switch[i] ^= 1
    # female
    else:
        switch[num] ^= 1
        for k in range(N//2):
            if num + k > N or num - k < 1 : break
            if switch[num + k] == switch[num - k]:
                switch[num+k] ^= 1
                switch[num-k] ^= 1
            else:
                break

for i in range(1, N+1, 20):
    print(*switch[i:i+20])
