class Solution(object):
    def convertToTitle(self, num):
        """
        :type n: int
        :rtype: str
        """
        # capitals = [chr(x) for x in range(ord('A'), ord('Z')+1)]
        result = []
        while num > 0:
            # result.append(capitals[(num-1)%26])
            result.append(chr((num-1) % 26 + 65))
            num = (num-1) // 26
        result.reverse()
        return ''.join(result)

    def titleToNumber(self, s):
        """
        :type s: str
        :rtype: int
        """
        length = len(s)
        sum = 0
        for i in range(length):
            sum =sum + int((ord(s[i])-ord('A')+1)*(26**(length-1-i)))
        return sum

if __name__ == "__main__":
    so=Solution()
    # result=so.convertToTitle(28)
    result=so.titleToNumber('ZY')
    print(result)
