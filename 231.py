class Solution:
    def isPowerOfTwo(self, n):
        """
        :type n: int
        :rtype: bool
        """
        # 因为2的幂只有最高位是1，其他都是0，所以可以来用
        return n>0 and not n&(n-1)




if __name__ == "__main__":
    so=Solution()
    print(so.isPowerOfTwo(4))