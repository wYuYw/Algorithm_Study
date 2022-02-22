# 6485. 삼성시의 버스 노선

# Solution by wYuYw

for tc in range(int(input())):
    arr = [0] * 5001
    ans = []
    for _ in range(int(input())):
        a, b = map(int, input().split())
        for i in range(a, b + 1):
            arr[i] += 1

    for _ in range(int(input())):
        c = int(input())
        ans.append(str(arr[c]))

    print(f'#{tc + 1} {" ".join(ans)}')
