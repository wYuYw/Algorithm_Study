# 1984. 중간 평균값 구하기

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    nums = list(map(int, input().split()))
    nums.sort()
    nums.pop(0)
    nums.pop()
    ans = round(sum(nums)/8)
    
    print(f"#{test_case} {ans}")
