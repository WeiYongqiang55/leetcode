class Solution(object):
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        import itertools
        s=sorted(s)
        t=sorted(t)
        if len(s)<len(t):s,t=t,s
        for i,j in  list(itertools.zip_longest(s,t)):
            if i!=j:
                return i

if __name__ == "__main__":
    so = Solution()
    print(so.findTheDifference("abcd","abecd"))