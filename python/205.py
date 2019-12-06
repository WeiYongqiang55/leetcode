class Solution:
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        # method 1 
        # print(set(zip(s,t)))
        # print(set(zip(t,s)))
        # return len(set(zip(s, t))) == len(set(s)) and len(set(zip(t, s))) == len(set(t)

        # method 2
        if len(s) != len(t):
            return False
        dic1 = {}
        dic2 = {} 
        for s1,t1 in zip(s,t):
            if s1 in dic1 and dic1[s1]!= t1:
                return False
            else:
                dic1[s1]=t1
        
        for t1,s1 in zip(t,s):
            if t1 in dic2 and dic2[t1]!=s1:
                return False
            else:
                dic2[t1]=s1
        
        return True


if __name__ == "__main__":
    so = Solution()
    print(so.isIsomorphic('egg','aaa'))