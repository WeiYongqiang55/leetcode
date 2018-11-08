class Solution:
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        now = last = 0
        for i in nums:
            last, now = now, max(i+last, now)
            # temlast=last
            # temnow=now
            # last=temnow
            # now=max(i+temlast,temnow)
        return now
            

if __name__ == "__main__":
    so = Solution()
    print(so.rob([2,7,9,3,1]))