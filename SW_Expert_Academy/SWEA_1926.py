# 1926. 간단한 369게임

# Solution by wYuYw

N = int(input())
clap = 0

for number in range(1, N+1):
    nums = str(number)
    clap = nums.count('3')+nums.count('6')+nums.count('9')
    
    if(clap == 0):
        print(number, end=" ")
    else:
        print("-"*clap, end= " ")
