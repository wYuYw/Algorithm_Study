# 1966. 숫자를 정렬하자

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    nums = list(map(int, input().split()))
    nums.sort()
    
    print(f'#{test_case} ', end='')
    for num in nums:
        print(f'{num} ', end='')
    print()

