king_init, stone_init, n = input().split()

king_row = 8 - int(king_init[1]) + 1
king_column = int(ord(king_init[0]) - ord('A')) + 1
stone_row = 8 - int(stone_init[1]) + 1
stone_column = int(ord(stone_init[0]) - ord('A')) + 1
n = int(n)

# 명령에 따른 (row, column) 변화
dp = [(0, 1), (0, -1), (1, 0), (-1, 0), (-1, 1), (-1, -1), (1, 1), (1, -1)]
order_list = ['R', 'L', 'B', 'T', 'RT', 'LT', 'RB', 'LB']

for i in range(n):
    next_king_row, next_king_column, next_stone_row, next_stone_column = king_row, king_column, stone_row, stone_column
    order = input()
    for j in range(8):
        if order == order_list[j]:
            next_king_row = king_row + dp[j][0]
            next_king_column = king_column + dp[j][1]
        if (stone_row == next_king_row) and (stone_column == next_king_column):
            next_stone_row = stone_row + dp[j][0]
            next_stone_column = stone_column + dp[j][1]
        if (next_king_row<1 or next_king_column<1 or next_stone_row<1 or next_stone_column<1 or
            next_king_row>8 or next_king_column>8 or next_stone_row>8 or next_stone_column>8):
            next_king_row = king_row
            next_king_column = king_column
            next_stone_row = stone_row
            next_stone_column = stone_column
        king_row = next_king_row
        king_column = next_king_column
        stone_row = next_stone_row
        stone_column = next_stone_column

print(chr(king_column - 1 + ord('A')) + str(9 - king_row))
print(chr(stone_column - 1 + ord('A')) + str(9 - stone_row))


# Solution with functions

def get_pos(chess_pos):
    x = ord(chess_pos[0]) - ord('A')
    y = 8 - int(chess_pos[1])
    return x, y

def get_chess_pos(x_pos, y_pos):
    x = chr(x_pos + ord('A'))
    y = str(8 - y_pos)
    return x + y

king_pos, stone_pos, N = input().split()
kingx, kingy = get_pos(king_pos)
stonex, stoney = get_pos(stone_pos)

move_dir = {'R': (1, 0), 'L': (-1, 0), 'B': (0, 1), 'T': (0, -1), 'RT': (1, -1), 
            'LT': (-1, -1), 'RB': (1, 1), 'LB': (-1, 1)}

for _ in range(int(N)):
    cmd = input()
    dx, dy = move_dir[cmd]
    king_nx, king_ny = kingx + dx, kingy + dy
    if 0 <= king_nx < 8 and 0 <= king_ny < 8:
        if stonex == king_nx and stoney == king_ny:
            stone_nx, stone_ny = stonex + dx, stoney + dy
            if 0 <= stone_nx < 8 and 0 <= stone_ny < 8:
                stonex, stoney = stone_nx, stone_ny
                kingx, kingy = king_nx, king_ny
        else:
            kingx, kingy = king_nx, king_ny

print(get_chess_pos(kingx, kingy))
print(get_chess_pos(stonex, stoney))
