class Solution:
    def containsNearbyDuplicate(self, nums,k):
        """
        :type nums: List[int]
        :rtype: bool
        """
        dic = {}
        for i in range(len(nums)):
            if nums[i] in dic:
                if i-dic[nums[i]]<=k:
                    return True
                else:
                    dic[nums[i]]=i
            else:
                dic[nums[i]]=i
        return False
        
if  __name__ == "__main__":
    so=Solution()
    print(so.containsNearbyDuplicate([1,2,3,1],3))