# 1961. 숫자 배열 회전

# Solution by wYuYw

T = int(input())

# 시계방향 90도 돌리는 함수
def rotation(arr, N):
    new_arr = [[0] * N for _ in range(N)]
    for i in range(N):
        for j in range(N):
            new_arr[i][j] = arr[N-1-j][i]
    return new_arr

for test_case in range(1, T+1):
    N = int(input())
    arr = [input().split() for _ in range(N)]

    rot_90 = rotation(arr, N)
    rot_180 = rotation(rot_90, N)
    rot_270 = rotation(rot_180, N)

    print(f"#{test_case}")
    for i in range(N):
        print("".join(rot_90[i]), end=" ")
        print("".join(rot_180[i]), end=" ")
        print("".join(rot_270[i]), end=" ")
        print()
