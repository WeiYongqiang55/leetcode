'''
@Author: your name
@Date: 2019-11-29 20:04:11
@LastEditTime: 2019-11-30 20:41:54
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\5.最长回文子串.py
'''
#
# @lc app=leetcode.cn id=5 lang=python3
#
# [5] 最长回文子串
#中心扩散法
# 两种中心,
# 一种是bab这样,中心是a
# 一种是baab这样,中心是空隙
#

# @lc code=start
class Solution:
    def longestPalindrome(self, s: str) -> str:
        size = len(s)
        if size < 2:
            return s

        # 至少是 1
        max_len = 1
        res = s[0]

        for i in range(size):
            palindrome_odd, odd_len = self.__center_spread(s, size, i, i)
            palindrome_even, even_len = self.__center_spread(s, size, i, i + 1)

            # 当前找到的最长回文子串
            cur_max_sub = palindrome_odd if odd_len >= even_len else palindrome_even
            if len(cur_max_sub) > max_len:
                max_len = len(cur_max_sub)
                res = cur_max_sub

        return res

    def __center_spread(self, s, size, left, right):
        """
        left = right 的时候，此时回文中心是一条线，回文串的长度是奇数
        right = left + 1 的时候，此时回文中心是任意一个字符，回文串的长度是偶数
        """
        i = left
        j = right

        while i >= 0 and j < size and s[i] == s[j]:
            i -= 1
            j += 1
        return s[i + 1:j], j - i - 1

# @lc code=end

