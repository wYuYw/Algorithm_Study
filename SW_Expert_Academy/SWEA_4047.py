# 4047. 영준이의 카드 카운팅

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    s = [0] * 14
    d = [0] * 14
    h = [0] * 14
    c = [0] * 14
    data = input().strip()
    length = len(data)
    result = ""
    flag = True

    for i in range(length):
        if data[i] == "S":
            if data[i+1] == "0":
                if s[int(data[i+2])] >= 1:
                    flag = False
                    break
                else: s[int(data[i+2])] += 1
            if data[i+1] == "1":
                if s[int(data[i+2]) + 10] >= 1:
                    flag = False
                    break
                else: s[int(data[i+2]) + 10] += 1

        if data[i] == "D":
            if data[i+1] == "0":
                if d[int(data[i+2])] >= 1:
                    flag = False
                    break
                else: d[int(data[i+2])] += 1
            if data[i+1] == "1":
                if d[int(data[i+2]) + 10] >= 1:
                    flag = False
                    break
                else: d[int(data[i+2]) + 10] += 1

        if data[i] == "H":
            if data[i+1] == "0":
                if h[int(data[i+2])] >= 1:
                    flag = False
                    break
                else: h[int(data[i+2])] += 1
            if data[i+1] == "1":
                if h[int(data[i+2]) + 10] >= 1:
                    flag = False
                    break
                else: h[int(data[i+2]) + 10] += 1

        if data[i] == "C":
            if data[i+1] == "0":
                if c[int(data[i+2])] >= 1:
                    flag = False
                    break
                else: c[int(data[i+2])] += 1
            if data[i+1] == "1":
                if c[int(data[i+2]) + 10] >= 1:
                    flag = False
                    break
                else: c[int(data[i+2]) + 10] += 1

    if flag:
        print(f"#{test_case} {s.count(0)-1} {d.count(0)-1} {h.count(0)-1} {c.count(0)-1}")
    else:
        print(f"#{test_case} ERROR")
