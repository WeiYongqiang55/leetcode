class Solution:
    # 118
    def generate(self, n):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        res=[]
        for i in range(0,n):
            res.append([1]*(i+1))
            for j in range(1,i):
                res[i][j] = res[i-1][j-1] + res[i-1][j]
        return res
        # 119
    def getRow(self, rowIndex):
        """
        :type rowIndex: int
        :rtype: List[int]
        """
        res = []
        for i in range(0, rowIndex+1):
            res.append([1]*(i+1))
            for j in range(1, i):
                res[i][j] = res[i-1][j-1] + res[i-1][j]
        return res[rowIndex]
        # 121
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        # 超时
        # max_profit=0
        # for i in range(len(prices)):
        #     for j in range(i,len(prices)):
        #         if prices[j]-prices[i]>max_profit:
        #             max_profit=prices[j]-prices[i]
        # return max_profit

        length= len(prices)
        if length==0:
            return 0
        minprice=prices[0]
        max_profix=0
        for i in range(0,length):
            if prices[i] < minprice:
                minprice=prices[i]
            elif prices[i]-minprice>max_profix:
                max_profix=prices[i]-minprice
        return max_profix
    # 125
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        string=[]
        for c in s:
            if c.isalnum():
                string.append(c.lower())
        length = len(string)
        for i in range(0,int(len(string)/2)):
            if string[i] != string[length-1-i]:
                return False
        return  True


if __name__ =="__main__":
    solu = Solution()
    # result = solu.getRow(3)
    # prices=[7,1,5,3,6,4]
    # result = solu.maxProfit(prices)
    s="A man, a plan, a canal: Panama"
    result = solu.isPalindrome(s)
    print(result)
