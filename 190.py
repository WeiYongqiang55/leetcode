class Solution:
    # @param n, an integer
    # @return an integer
#    190
    def reverseBits(self, n):
#        str=bin(n)[2:].zfill(32)
#        print(str)
#        str=str[::-1]
#        print(str)
#        result = int(str,2)
#        print(result)
        oribin='{0:032b}'.format(n)
        reversebin=oribin[::-1]
        return int(reversebin,2)
#        191
    def hammingWeight(self, n):
        str='{0:032b}'.format(n)
        num=str.count('1')
        return num
        

if __name__ =="__main__":
    so = Solution()
#    result=so.reverseBits(43261596)
    result = so.hammingWeight(11)
    print(result)