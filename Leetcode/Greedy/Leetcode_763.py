# Leetcode_763. Partition Labels

# Solution by wYuYw

class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        # dict; (key, value) = (character, last appeared index)
        last_appearance = collections.defaultdict(int)
        for idx, ch in enumerate(s):
            last_appearance[ch] = idx
        
        res = []
        length, partition = 0, last_appearance[s[0]]
        for idx, ch in enumerate(s):
            length += 1
            if partition < last_appearance[ch]:
                partition = last_appearance[ch]
            if idx == partition:
                res.append(length)
                length, partition = 0, last_appearance[ch]
        return res
