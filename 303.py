class NumArray:

    def __init__(self, nums):
        """
        :type nums: List[int]
        """
        self.nums=nums
        for i in range(1,len(nums)):
            self.nums[i]+=self.nums[i-1]


    def sumRange(self, i, j):
        """
        :type i: int
        :type j: int
        :rtype: int
        """
        return self.nums[j]-self.nums[i-1] if i else self.nums[j]


if __name__ == "__main__":
    nums = [-2, 0, 3, -5, 2, -1]
    obj = NumArray(nums)
    param_1 = obj.sumRange(2, 5)
    print(param_1)
