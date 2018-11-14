class Solution:
    def wordPattern(self, pattern, str):
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
        dic={}
        str=str.split(" ")
        if len(pattern)!=len(str):return False
        for c,s in zip(pattern,str):
            if c in dic:
                if s !=dic[c]:
                    return False
            else:
                if s in dic.values():
                    return False
                else:dic[c]=s
        return True
        
if __name__ == "__main__":
    so = Solution()
    pattern = "aaa"
    str="aa aa aa aa"
    str2= "dog cat cat dog"
    print(so.wordPattern(pattern,str))

