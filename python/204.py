class Solution:
    def countPrimes(self, n):
        """
        :type n: int
        :rtype: int
        """
        # count=0
        # for i in range(2,n):
        #     flag=True
        #     for j in range(2,i):
        #         if i %j ==0:
        #             flag=False
        #             break
        #     if flag:
        #         count+=1
        # return count
        if n <3:
            return 0

        digits = [1]*n
        digits[0] = digits[1] = 0

        for i in range(2, int(n**0.5)+1):
            if digits[i] == 1:
                for j in range(i+i, n, i):
                    digits[j] = 0

        return sum(digits)

if __name__ == "__main__":
    so = Solution()
    print(so.countPrimes(100000000))