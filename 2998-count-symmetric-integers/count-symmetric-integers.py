class Solution:
    def countSymmetricIntegers(self, low: int, high: int) -> int:
        count=0
        for num in range(low,high+1):
            s=str(num)
            if len(s) % 2 == 0:
                mid = len(s) // 2
                left_sum = sum(int(d) for d in s[:mid])
                right_sum = sum(int(d) for d in s[mid:])
                if left_sum == right_sum:
                    count += 1
        return count