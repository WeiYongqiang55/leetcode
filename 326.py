class Solution:
    def isPowerOfThree(self, n):
        """
        :type n: int
        :rtype: bool
        """
        import math
        if n<1: return False
        re = math.log(n,3)
        return abs(round(re)-re)<0.0000000001
if __name__ == "__main__":
    so =Solution()
    print(so.isPowerOfThree(27))