class Solution:
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        # length = len(nums)
        # nums.extend(nums[0:length-k])
        # print(nums)
        # for i in range(k+1):
        #     del(nums[0])
        # print(nums) 
        n = len(nums)
        k = k % n
        nums[:] = nums[n-k:] + nums[:n-k]

if __name__ == "__main__":
    so=Solution()
    # result=so.convertToTitle(28)
    nums=[1]
    so.rotate(nums,1)
    # print(result)
