# Leetcode_819. Most Common Word

# Solution by wYuYw

class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        words = [word for word in re.sub('[^\w]', ' ', paragraph).lower().split()
        # words = [word for word in re.sub('r[^\w]', ' ', paragraph).lower().split() <- r이 붙을 경우, 문자를 있는 그대로; \는 백슬레쉬로
                 if word not in banned]
        
        counter = collections.Counter(words)
        return counter.most_common(1)[0][0]
