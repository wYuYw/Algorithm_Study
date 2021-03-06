# Leetcode_347. Top K Frequent Elements

# Solution_01 by wYuYw - Pythonic solution

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counter = collections.Counter(nums)
        return list(zip(*counter.most_common(k)))[0]
      

# Solution_02 by wYuYw - Using heapq

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freqs = collections.Counter(nums)
        freqs_heap = []
        # Min-Heap이므로 힙에 음수로 삽입
        # 빈도수 (freqs의 value)가 클수록 앞에 정렬
        for f in freqs:
            heapq.heappush(freqs_heap, (-freqs[f], f))
            
        topk = list()
        # k번 만큼 추출, 최소 힙이므로 가장 작은 음수 순으로 추출
        for _ in range(k):
            topk.append(heapq.heappop(freqs_heap)[1])
            
        return topk

    
# Solution_03 by wYuYw - Using bucket sort

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        freq = [[] for _ in range(len(nums) + 1)]
        
        for n in nums:
            count[n] = 1 + count.get(n, 0)
        for n, c in count.items():
            freq[c].append(n)
            
        res = []
        for i in reversed(range(len(freq))):
            for n in freq[i]:
                res.append(n)
                if len(res) == k:
                    return res
