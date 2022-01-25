# 1989. 초심자의 회문 검사

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    word = input()
    if (word == word[::-1]):
        print('#{0} {1}'.format(test_case, 1))
    else:
        print('#{0} {1}'.format(test_case, 0))
