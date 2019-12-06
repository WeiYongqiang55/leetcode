class Solution:
    def numSpecialEquivGroups(self, A):
        """
        :type words: List[str]
        :rtype: int
        """
        B = set()
        for a in A:
            # print(''.join(sorted(a[0::2])),''.join(sorted(a[1::2])))
            print(a[0::2])
            print(a[1::2])
            B.add(''.join(sorted(a[0::2])) + ''.join(sorted(a[1::2])))
        return len(B)

            
        

if __name__ == "__main__":
    so =Solution()
    words=["abcd","cdab","adcb","cbad"]
    print(so.numSpecialEquivGroups(words))