class Solution:
    def thirdMax(self, nums):
        """
        :type n: int
        :rtype: int
        """
        nums=list(set(nums))
        nums=sorted(nums,reverse=True)
        if len(nums)>=3:
            return nums[2]
        else:return nums[0]
       
if __name__ == "__main__":
    so = Solution()
    nums=[2,1]
    print(so.thirdMax(nums))
