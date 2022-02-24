# 1873. 상호의 배틀필드

# Solution by wYuYw

def motion(order, field):
    global tank, tank_r, tank_c
    if order == "U":
        field[tank_r][tank_c] = "^"
        if tank_r-1 >= 0 and field[tank_r-1][tank_c] == ".":
            tank_r = tank_r - 1
            field[tank_r][tank_c] = "^"
            field[tank_r+1][tank_c] = "."
    if order == "D":
        field[tank_r][tank_c] = "v"
        if tank_r + 1 < h and field[tank_r + 1][tank_c] == ".":
            tank_r = tank_r + 1
            field[tank_r][tank_c] = "v"
            field[tank_r-1][tank_c] = "."
    if order == "L":
        field[tank_r][tank_c] = "<"
        if tank_c - 1 >= 0 and field[tank_r][tank_c-1] == ".":
            tank_c = tank_c - 1
            field[tank_r][tank_c] = "<"
            field[tank_r][tank_c+1] = "."
    if order == "R":
        field[tank_r][tank_c] = ">"
        if tank_c + 1 < w and field[tank_r][tank_c + 1] == ".":
            tank_c = tank_c + 1
            field[tank_r][tank_c] = ">"
            field[tank_r][tank_c-1] = "."
    if order == "S":
        if field[tank_r][tank_c] == "^" and tank_r != 0:
            for r in range(tank_r - 1, -1, -1):
                if field[r][tank_c] == "#":
                    break
                if field[r][tank_c] == "*":
                    field[r][tank_c] = "."
                    break
        if field[tank_r][tank_c] == "v" and tank_r != h-1:
            for r in range(tank_r+1, h):
                if field[r][tank_c] == "#":
                    break
                if field[r][tank_c] == "*":
                    field[r][tank_c] = "."
                    break
        if field[tank_r][tank_c] == "<" and tank_c != 0:
            for c in range(tank_c - 1, -1, -1):
                if field[tank_r][c] == "#":
                    break
                if field[tank_r][c] == "*":
                    field[tank_r][c] = "."
                    break
        if field[tank_r][tank_c] == ">" and tank_c != w-1:
            for c in range(tank_c+1, w):
                if field[tank_r][c] == "#":
                    break
                if field[tank_r][c] == "*":
                    field[tank_r][c] = "."
                    break

def find_tank_location(arr):
    global tank, tank_r, tank_c
    for r in range(h):
        for c in range(w):
            if arr[r][c] in "^v<>":
                tank = arr[r][c]
                tank_r = r
                tank_c = c

T = int(input())
for tc in range(1, T+1):
    h, w = map(int, input().split())
    field = []
    for _ in range(h):
        field.append(list(input()))
    tank, tank_r, tank_c = "", 0, 0
    find_tank_location(field)
    num_orders = int(input())
    orders = input()

    for order in orders:
        motion(order, field)

    print(f"#{tc}", end=' ')
    for r in range(h):
        for c in range(w):
            print(field[r][c], end='')
        print()
