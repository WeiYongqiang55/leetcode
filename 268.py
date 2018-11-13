class Solution:
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        return int(n*(n+1)/2 -sum(nums))

if __name__ == "__main__":
    so =Solution()
    print(so.missingNumber([9,6,4,2,3,5,7,0,1]))
