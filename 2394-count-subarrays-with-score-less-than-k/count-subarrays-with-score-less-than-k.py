class Solution:
    def countSubarrays(self, nums: List[int], k: int) -> int:
        r=part=0
        left=0
        for i,num in enumerate(nums):
            part+=num
            while part*(i-left+1)>=k:
                part-=nums[left]
                left+=1
            r+=i-left+1
        return r