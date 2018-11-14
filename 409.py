class Solution:
    def longestPalindrome(self, s):
        """
        :type n: int
        :rtype: int
        """
        dic={}
        for c in s:
            if c in dic:
                dic[c]+=1
            else:
                dic[c]=1
        flag=False
        even_count=0
        for i in dic.values():
            if i%2==0:
                even_count+=i
            elif i>1:
                flag=True
                even_count+=(i-1)
            else:flag=True
        if flag:
            return even_count+1
        else:
            return even_count

        
if __name__ == "__main__":
    so = Solution()
    print(so.longestPalindrome('ccc'))
