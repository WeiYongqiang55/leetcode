class Solution(object):
    def guessNumber(self, n):
        """
        :type n: int
        :rtype: int
        """
        nums=list(range(1,n))
        start=0 
        end= n-1
        while start < end:
            mid = start+int((end-start)/2)
            if not guess(mid):
                return mid+1
            elif guess(mid)==-1:
                end=mid-1
            elif guess(mid)==1:
                start = mid +1
        return None
