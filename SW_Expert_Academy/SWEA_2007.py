# 2007. 패턴 마디의 길이

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    temp1 = []
    temp2 = []
    ans_list = []
    h = list(x for x in input())
    
    for i in range(len(h)):
        if (h[0] in temp1):
            temp2.append(h[0])
            h.pop(0)
            if (temp1 == temp2):
                ans_list = temp1
                break
            else:
                if len(temp2)>=10:
                    temp1.append(temp2[0])
                    temp2.pop(0)
                    if temp1 == temp2:
                        ans_list = temp1
                        break
        else:
            temp1 = temp1 + temp2
            temp2 = []
            temp1.append(h[0])
            h.pop(0)
    
    ans = len(ans_list)
    print('#{0} {1}'.format(test_case, ans))
