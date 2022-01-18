#4861. [파이썬 S/W 문제해결 기본] 3일차 - 회문

T = int(input())

for test_case in range(1, T + 1):
    N, M = map(int, input().split())
    words = [[0]*N for _ in range(N)]
    words_t = [[0]*N for _ in range(N)]
    for i in range(N):
        words[i] = list(input())
    words_t = list(zip(*words))
        
    for i in range(N):
        for j in range(N-M+1):
            temp_words = words[i][j:M+j]
            temp_words_t = words_t[i][j:M+j]
            words_str = ('').join(temp_words)
            words_t_str = ('').join(temp_words_t)

            if(words_str==words_str[::-1]):
                print(f'#{test_case} {words_str}')
                break
            elif(words_t_str==words_t_str[::-1]):
                print(f'#{test_case} {words_t_str}')
                break
            else:
                pass
