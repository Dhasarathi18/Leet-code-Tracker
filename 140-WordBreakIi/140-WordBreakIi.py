# Last updated: 7/16/2026, 7:59:17 PM
class Solution:
    def wordBreak(self, s, wordDict):
        wordSet = set(wordDict)
        memo = {}
        def dfs(start):
            if start in memo:
                return memo[start]
            if start == len(s):
                return [""]
            result = []
            for end in range(start + 1, len(s) + 1):
                word = s[start:end]
                if word in wordSet:
                    for sentence in dfs(end):
                        if sentence:
                            result.append(word + " " + sentence)
                        else:
                            result.append(word)
            memo[start] = result
            return result
        return dfs(0)