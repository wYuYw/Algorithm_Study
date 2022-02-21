# 4698. 테네스의 특별한 소수

# Solution_01 by wYuYw - is_prime 판별; 시간초과

T = int(input())

def is_prime (n): # 1<= n
    result = True
    if n == 1:
        result = False
    else:
        for i in range(2, int(n**0.5)+1):
            if n % i == 0:
                result = False
    return result

for test_case in range(1, T + 1):
    d, a, b = input().split()
    cnt = 0
    for i in range(int(a), int(b)+1):
        if is_prime(i) and d in str(i):
            cnt += 1
    print(f"#{test_case} {cnt}")


# Solution_02 by wYuYw - Using Sieve of Eratosthenes

import math

n = 1_000_000
prime_nums = [True for i in range(n + 1)]

for i in range(2, int(math.sqrt(n)) + 1):
    if prime_nums[i] is True:
        j = 2
        while i * j <= n:
            prime_nums[i * j] = False
            j += 1

prime_nums[0] = False
prime_nums[1] = False
T = int(input())
for test_case in range(1, T + 1):
    d, a, b = map(int, input().split())
    cnt = 0
    for i, v in enumerate(prime_nums):
        if v is True and a <= i <= b and str(d) in str(i):
            cnt += 1
    print(f"#{test_case} {cnt}")
