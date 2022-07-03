# Leetcode_703. Kth Largest Element in a Stream

# Solution by wYuYw

class KthLargest:

    def __init__(self, k: int, nums: List[int]):
        self.stream, self.k = nums, k
        heapq.heapify(self.stream)
        self.maintain_heap()
            
    def maintain_heap(self):
        while len(self.stream) > self.k:
            heapq.heappop(self.stream)

    def add(self, val: int) -> int:
        heapq.heappush(self.stream, val)
        self.maintain_heap()
        return self.stream[0]


# Your KthLargest object will be instantiated and called as such:
# obj = KthLargest(k, nums)
# param_1 = obj.add(val)
