# Baekjoon_2490

# Solution by wYuYw

data = {0:"D", 1:"C", 2:"B", 3:"A", 4:"E"}

for i in range(3):
    play = input().split()
    val = play.count("1")
    print(data[val])
