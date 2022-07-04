# Leetcode_355. Design Twitter

# Solution by wYuYw

class Twitter:

    def __init__(self):
        self.snapshot = 0
        self.tweets = collections.defaultdict(list)
        self.follows = collections.defaultdict(set)

    def postTweet(self, userId: int, tweetId: int) -> None:
        self.tweets[userId].append((self.snapshot, tweetId))
        self.snapshot -= 1

    def getNewsFeed(self, userId: int) -> List[int]:
        res = []
        recent_tweets = []
        heapq.heapify(recent_tweets)
        
        # self
        for item in self.tweets[userId]:
            heapq.heappush(recent_tweets, item)
        # followers
        for followeeId in self.follows[userId]:
            for item in self.tweets[followeeId]:
                heapq.heappush(recent_tweets, item)
        
        if len(recent_tweets) > 10:
            for _ in range(10):
                res.append(heapq.heappop(recent_tweets)[1])
        else:
            while recent_tweets:
                res.append(heapq.heappop(recent_tweets)[1])
        
        return res

    def follow(self, followerId: int, followeeId: int) -> None:
        self.follows[followerId].add(followeeId)

    def unfollow(self, followerId: int, followeeId: int) -> None:
        if followeeId in self.follows[followerId]:
            self.follows[followerId].remove(followeeId)


# Your Twitter object will be instantiated and called as such:
# obj = Twitter()
# obj.postTweet(userId,tweetId)
# param_2 = obj.getNewsFeed(userId)
# obj.follow(followerId,followeeId)
# obj.unfollow(followerId,followeeId)
