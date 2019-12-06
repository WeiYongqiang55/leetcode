class Solution:
    def addDigits(self, num):
        """
        :type num: int
        :rtype: int
        """
        
        # while int(num/10):
        #     sum=0
        #     while num:
        #         sum+=num%10
        #         num=int(num/10)
        #     num=sum
        # return num 
        if num==0: return 0
        else:
            return (num-1)%9 +1

if __name__ == "__main__":
    so=Solution()
    print(so.addDigits(38))