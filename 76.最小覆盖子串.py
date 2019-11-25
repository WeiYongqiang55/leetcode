'''
@Author: your name
@Date: 2019-11-25 10:38:21
@LastEditTime: 2019-11-25 15:47:08
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\76.最小覆盖子串.py
'''
#
# @lc app=leetcode.cn id=76 lang=python3
#
# [76] 最小覆盖子串
#

# @lc code=start
class Solution:
    # def minWindow(self, s, t):
    #     import collections
    #     need, missing = collections.Counter(t), len(t)
    #     i = I = J = 0
    #     for j, c in enumerate(s, 1):
    #         missing -= need[c] > 0
    #         need[c] -= 1
    #         if not missing:
    #             while i < j and need[s[i]] < 0:
    #                 need[s[i]] += 1
    #                 i += 1
    #             if not J or j - i <= J - I:
    #                 I, J = i, j
    #     return s[I:J]
     def minWindow(self, s: 'str', t: 'str') -> 'str':
        from collections import defaultdict
        lookup = defaultdict(int)
        for c in t:
            lookup[c] += 1
        start = 0
        end = 0
        min_len = float("inf")
        counter = len(t)
        res = ""
        while end < len(s):
            if lookup[s[end]] > 0:#是t种的元素
                counter -= 1
            lookup[s[end]] -= 1
            end += 1 #向下一个移动
            while counter == 0: #全部字母被包含了
                if min_len > end - start:
                    min_len = end - start
                    res = s[start:end]
                if lookup[s[start]] == 0: #把第一个符合的字母，释放掉，窗口向后滑动
                    counter += 1
                lookup[s[start]] += 1
                start += 1 #窗口向后移动
        return res

a = Solution()
print(a.minWindow("ADOBECODEBANC",
"ABC"))
# @lc code=end

