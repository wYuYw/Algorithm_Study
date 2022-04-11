# Baekjoon_18185 라면 사기 (Small)

# Solution by wYuYw

def purchase(idx, type):
    global res
    val = min(companies[idx:idx + type])
    for i in range(idx, idx + type):
        companies[i] -= val
    if type == 1:
        val *= 3
    elif type == 2:
        val *= 5
    else:
        val *= 7
    res += val
    return


n = int(input())
companies = list(map(int, input().split()))
res = 0

for idx in range(n):
    if companies[idx] == 0:
        continue
    while companies[idx] > 0:
        if idx + 1 < n:
            if companies[idx + 1] == 0:
                purchase(idx, 1)
            else:
                if idx + 2 < n:
                    if companies[idx + 2] == 0:
                        purchase(idx, 2)
                    else:
                        if companies[idx + 1] <= companies[idx + 2]:
                            purchase(idx, 3)
                        else:
                            val = min(companies[idx], companies[idx + 1] - companies[idx + 2])
                            for i in range(idx, idx + 2):
                                companies[i] -= val
                            res += val * 5
                else:
                    purchase(idx, 2)
        else:
            purchase(idx, 1)

print(res)
