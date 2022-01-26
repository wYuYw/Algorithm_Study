# 1928. Base64 Decoder

# Solution by wYuYw

#String을 Base64표에 맞는 10진수 숫자로 바꿔준 후 2진수로 바꾸고,
#바꾼 2진수를 8개씩 10진수로 변환해서 ASCII 코드표에 따른 변환을 해주면 되는 것

#zfill: "002" <- "2".zfill(3)
#rjust: "aa123" <- "123".rjust(5, "a")

b = [chr(k) for k in range(65,91)] + [chr(k) for k in range(97,123)] + [str(k) for k in range(10)] + ['+','/']

for i in range(int(input())):
    n = input()
    l = [n[t*4:t*4+4] for t in range(len(n)//4)]
    print(f'#{i+1} ',end='')
    for j in l:
        c = ''
        for k in range(4):
            c += str(bin(b.index(j[k]))[2:].zfill(6))
        for m in range(3):
            a = chr(int(c[m*8:m*8+8],2))
            print(a,end='')
    print()
