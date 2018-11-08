class Solution:
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
        # while n!=1:
        #     count=0
        #     while n!=0:
        #         count+= (n%10)*(n%10)
        #         n=int(n/10)
        #     n=count
        # return True
        mem = set()
        while n!=1:
            n = sum([int(i)**2 for i in str(n)])
            if n in mem:
                return False
            else:
                mem.add(n)
        else:
            return True

if __name__ == "__main__":
    so = Solution()
    print(so.isHappy(2))
