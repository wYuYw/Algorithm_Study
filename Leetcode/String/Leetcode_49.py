# Leetcode_49. Group Anagrams

# Solution by wYuYw - Using defaultdict(); 존재하지 않는 키를 삽입할 때 KeyError가 발생하지 않고 정상적으로 삽입

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = collections.defaultdict(list)
        for str in strs:
            anagrams[''.join(sorted(str))].append(str)
            
        return list(anagrams.values())
