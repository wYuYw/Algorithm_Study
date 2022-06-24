# Leetcode_853. Car Fleet

# Solution by wYuYw

class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        driving = sorted(list(zip(position, speed)))
        time = [(target - item[0]) / item[1] for item in driving]

        res = 1
        prev_item = time.pop()
        while time:
            cur_item = time.pop()
            if cur_item <= prev_item:
                continue
            else:
                res += 1
                prev_item = cur_item
                
        return res
