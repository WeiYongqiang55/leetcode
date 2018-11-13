# The isBadVersion API is already defined for you.
# @param version, an integer
# @return a bool
# def isBadVersion(version):

class Solution:
    def firstBadVersion(self, n):
        """
        :type n: int
        :rtype: int
        """
         start =0
        end= n-1
        mid = int((end-start)/2)
        while start <end:
            mid=int(start+(end-start)/2)
            if isBadVersion(mid):
                end=mid-1
            elif isBadVersion(mid+1):
                return mid+1
            else:
                start=mid+1
        return start+1

