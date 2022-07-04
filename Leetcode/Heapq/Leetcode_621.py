# Leetcode_621. Task Scheduler

# Solution by wYuYw

class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        types_of_tasks = collections.Counter(tasks)
        heap = [-item for item in types_of_tasks.values()]
        heapq.heapify(heap)
        queue = collections.deque()
        
        snapshot = 0
        while heap or queue:
            snapshot += 1
            if heap:
                remaining_task = heapq.heappop(heap) + 1
                if remaining_task:
                    # complete one task and this task can be done again after snapshot + n
                    queue.append((snapshot + n, remaining_task))
                
            if queue and queue[0][0] == snapshot:
                heapq.heappush(heap, queue.popleft()[1])
        
        return snapshot
