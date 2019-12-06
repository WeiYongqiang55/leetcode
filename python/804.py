class Solution:
    def uniqueMorseRepresentations(self, words):
        """
        :type words: List[str]
        :rtype: int
        """
        index = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        result =set()
        for word in words:
            morse=''
            for s in word:
                morse+=index[ord(s)-ord('a')]
            result.add(morse)
        return len(result)

if __name__ == "__main__":
    so =Solution()


    
    words=["gin", "zen", "gig", "msg"]
    print(so.uniqueMorseRepresentations(words))