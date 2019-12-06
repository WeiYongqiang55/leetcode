class Solution:
    def isPowerOfFour(self, n):
        """
        :type n: int
        :rtype: bool
        """
        import math
        if n < 1:
            return False
        re = math.log(n, 4)
        return abs(round(re)-re) < 0.0000000001


if __name__ == "__main__":
    so = Solution()
    print(so.isPowerOfFour(128))
