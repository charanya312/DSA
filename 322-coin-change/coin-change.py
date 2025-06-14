class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        dp=[float('inf')]*(amount+1)
        dp[0]=0
        for i in coins:
            for j in range(i,amount+1):
                dp[j]=min(dp[j],dp[j-i]+1)
        return dp[amount]if dp[amount]!=float('inf')else -1
    

