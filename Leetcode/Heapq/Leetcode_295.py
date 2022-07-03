# Leetcode_295. Find Median from Data Stream

# Solution by wYuYw - using two heapq

class MedianFinder:

    def __init__(self):
        self.min_stream, self.max_stream = [], []

    def addNum(self, num: int) -> None:
        if not self.min_stream and not self.max_stream:
            heapq.heappush(self.min_stream, -num)
        else:
            if num >= -self.min_stream[0]:
                heapq.heappush(self.max_stream, num)
            else:
                heapq.heappush(self.max_stream, -heapq.heappop(self.min_stream))
                heapq.heappush(self.min_stream, -num)
            if len(self.max_stream) > len(self.min_stream) + 1:
                heapq.heappush(self.min_stream, -heapq.heappop(self.max_stream))
            elif len(self.min_stream) > len(self.max_stream) + 1:
                heapq.heappush(self.max_stream, -heapq.heappop(self.min_stream))

    def findMedian(self) -> float:
        if len(self.max_stream) == len(self.min_stream):
            return (self.max_stream[0] - self.min_stream[0]) / 2
        elif len(self.max_stream) > len(self.min_stream):
            return self.max_stream[0]
        else:
            return -self.min_stream[0]


# Your MedianFinder object will be instantiated and called as such:
# obj = MedianFinder()
# obj.addNum(num)
# param_2 = obj.findMedian()
