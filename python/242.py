class Solution:
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        import collections
        # print(collections.Counter(s))
        return collections.Counter(s)==collections.Counter(t)


if __name__ == "__main__":
    so=Solution()
    print(so.isAnagram("ababab","bbbaaa"))