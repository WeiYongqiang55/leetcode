class Solution:
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        setnum=set(nums)
        if len(setnum)!=len(nums):
            return True
        else:
            return False

if  __name__ == "__main__":
    so=Solution()
    print(so.containsDuplicate([1,2,3]))