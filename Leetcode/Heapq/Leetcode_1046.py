# Leetcode_1046. Last Stone Weight

# Solution_01 by wYuYw - using list
# (Runtime, Memory) = (60 ms, 13.9 MB)

class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        while len(stones) > 1:
            stones.sort(reverse=True)
            first_val, second_val = stones.pop(0), stones.pop(0)
            if first_val > second_val:
                stones.append(first_val - second_val)
        
        return stones[0] if stones else 0


# Solution_02 by wYuYw - using heapq
# (Runtime, Memory) = (50 ms, 13.9 MB)

class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        stones = [-i for i in stones]
        heapq.heapify(stones)
        
        while len(stones) > 1:
            first_val, second_val = heapq.heappop(stones), heapq.heappop(stones)
            if first_val < second_val:
                heapq.heappush(stones, first_val - second_val)
        
        return -stones[0] if stones else 0
