# Leetcode_787. Cheapest Flights Within K Stops

# Solution_01 - Using Dijkstra; Time Limit Exceeded

class Solution:
    def findCheapestPrice(self, n: int, flights: List[List[int]], src: int, dst: int, k: int) -> int:
        graph = collections.defaultdict(list)
        for u, v, w in flights:
            graph[u].append((v, w))
            
        Q = [(0, src, k)]
        
        while Q:
            price, node, k_left = heapq.heappop(Q)
            if node == dst:
                return price
            if k_left >= 0:
                for v, w in graph[node]:
                    alt = price + w
                    heapq.heappush(Q, (alt, v, k_left - 1))
        return -1

# Solution_02 - Bellman-Ford

class Solution:
    def findCheapestPrice(self, n: int, flights: List[List[int]], src: int, dst: int, k: int) -> int:
        prices = [float("inf")] * n
        prices[src] = 0

        for i in range(k + 1):
            tmp_prices = prices[:]

            for s, d, p in flights: # source, destination, price
                if prices[s] == float("inf"):
                    continue
                if prices[s] + p < tmp_prices[d]:
                    tmp_prices[d] = prices[s] + p
            prices = tmp_prices

        return -1 if prices[dst] == float("inf") else prices[dst]
