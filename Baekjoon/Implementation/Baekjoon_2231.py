# Baekjoon_2231

# Solution by wYuYw

n = int(input())

for i in range(n):
    if(i == (n-1)):
        print(0)
        break
    nums = [i]
    while (i!=0):
        nums.append(i%10)
        i //= 10
    if(n == sum(nums)):
        print(nums[0])
        break
