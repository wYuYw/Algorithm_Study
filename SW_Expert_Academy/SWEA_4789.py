# 4789. 성공적인 공연 기획

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    ppl = [int(i) for i in list(input())]
    clapper = ppl[0]
    add_ppl = 0

    for i in range(1, len(ppl)):
        if i <= clapper:
            clapper += ppl[i]
        else:
            add_ppl += i - clapper
            clapper += i - clapper + ppl[i]

    print(f"#{test_case} {add_ppl}")
