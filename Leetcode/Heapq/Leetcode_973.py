# Leetcode_973. K Closest Points to Origin

# Solution_01 by wYuYw
# (Runtime, Memory) = (1020 ms, 20.4 MB)

class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        heap = []
        for (x, y) in points:
            dist = x * x + y * y
            heapq.heappush(heap, (dist, x, y))
            
        res = []
        for _ in range(k):
            (dist, x, y) = heapq.heappop(heap)
            res.append((x, y))
        return res

# Solution_02 by wYuYw
# (Runtime, Memory) = (1713 ms, 20.4 MB)

class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        lengths = [[-(coord[0]**2 + coord[1]**2), coord[0], coord[1]] for coord in points]
        heapq.heapify(lengths)
        while len(lengths) > k:
            heapq.heappop(lengths)
        
        return [[item[1], item[2]] for item in lengths]
