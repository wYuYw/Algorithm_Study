# Baekjoon_13305

# Solution by wYuYw

n = int(input())
distances = list(map(int, input().split()))
prices = list(map(int, input().split()))
min_val = prices[0]
total_price = 0

for i in range(1, n):
    total_price += min_val * distances[i-1]
    if(prices[i]<=min_val):
        min_val = prices[i]
    else:
        continue

print(total_price)
