class Solution:
    def addStrings(self, num1,num2):
        """
        :type n: int
        :rtype: int
        """
        # num1=int(num1)
        # num2 = int(num2)
        # return num1+num2

        num1, num2 = list(num1), list(num2)
        carry, res = 0, []
        while len(num2) > 0 or len(num1) > 0:
            n1 = ord(num1.pop())-ord('0') if len(num1) > 0 else 0
            n2 = ord(num2.pop())-ord('0') if len(num2) > 0 else 0
            
            temp = n1 + n2 + carry 
            res.append(temp % 10)
            carry = temp // 10
        if carry: res.append(carry)
        return ''.join([str(i) for i in res])[::-1]


if __name__ == "__main__":
    so = Solution()
    num1='123'

    num2='8'
    print(so.addStrings(num1,num2))
