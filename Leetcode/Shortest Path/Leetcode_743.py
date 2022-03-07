# Leetcode_743. Network Delay Time

# Solution_01 by wYuYw - Using Dijkstra

class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        edges = collections.defaultdict(list)
        for u, v, w in times:
            edges[u].append((v, w))

        minHeap = [(0, k)]
        visit = set()
        t = 0 # result
        while minHeap:
            w1, n1 = heapq.heappop(minHeap)
            if n1 in visit:
                continue
            visit.add(n1)
            t = max(t, w1)

            for n2, w2 in edges[n1]:
                if n2 not in visit:
                    heapq.heappush(minHeap, (w1 + w2, n2))

        return t if len(visit) == n else -1
      
      
# Solution_02 - Using Bellman-Ford

class Solution:
    def networkDelayTime(self, a: List[List[int]], n: int, k: int) -> int:
        #Bellman Ford
        dp = [float("inf") for i in range(n+1)]
        dp[k]=0
        dp[0]=0
        stop = True 
        j = 0 
        
        while j < n-1 or stop:
            stop = False 
            for i in range(len(a)): 
                src = a[i][0]
                dest = a[i][1]
                wt = a[i][2]
                if dp[dest] > min(dp[dest],dp[src]+wt) :
                    dp[dest] = min(dp[dest],dp[src]+wt)
                    stop = True 
                j+=1 
        print(dp)
        if max(dp)==float("inf"):
            return -1 
        else:
            return max(dp)
