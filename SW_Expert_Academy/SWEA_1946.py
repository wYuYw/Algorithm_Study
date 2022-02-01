# 1946. 간단한 압축 풀기

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    code = ""
    total_num = 0
    N = int(input())
    for i in range(N):
        char, num = map(str, input().split())
        code += char*int(num)
        total_num += int(num)
    print(f"#{test_case}")    
    for i in range(0, total_num, 10):
        print(code[i:i+10])
