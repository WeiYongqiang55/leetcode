class Solution:
    def reverseWords(self, words):
        """
        :type words: List[str]
        :rtype: int
        """
        words = words.split()
        re=[]
        for word in words:
            word =word[::-1]
            print(word)
            re.append(word)
        return ' '.join(re)

            
        

if __name__ == "__main__":
    so =Solution()
    words="Let's take LeetCode contes"
    print(so.reverseWords(words))