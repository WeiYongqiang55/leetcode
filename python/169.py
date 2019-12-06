class Solution:
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        length = len(nums)
        dic={}
        for i in nums:
            if i in dic:
                dic[i]+=1
            else:
                dic[i]=1
        for i in dic:
            if dic[i]>int(length/2):
                return i 



if __name__ == "__main__":
    so = Solution()
    result=so.majorityElement([3,2,3])
    print(result)