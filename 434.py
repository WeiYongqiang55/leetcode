class Solution:
    def countSegments(self, s):
        """
        :type n: int
        :rtype: int
        """
        

        return len(s.split())
        # import re
        # return len(re.findall('\S+',s))




if __name__ == "__main__":
    so = Solution()
    print(so.countSegments("   "))
