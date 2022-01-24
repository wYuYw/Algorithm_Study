# 1288. 새로운 불면증 치료법

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    counter = {'0': 0, '1': 0, '2': 0, '3': 0, '4': 0, '5': 0, '6': 0, '7': 0, '8': 0, '9': 0}
    count = 0
    N = M = int(input())
    while(True):
        for num in str(N):
            if num in counter:
                counter[num] += 1
        N += M
        count += 1
        if(counter['0']>=1 and counter['1']>=1 and counter['2']>=1 and 
          counter['3']>=1 and counter['4']>=1 and counter['5']>=1 and 
          counter['6']>=1 and counter['7']>=1 and counter['8']>=1 and counter['9']>=1):
            break
        
    
    print(f'#{test_case} {count*M}')
