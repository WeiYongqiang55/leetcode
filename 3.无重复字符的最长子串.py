'''
@Author: your name
@Date: 2019-11-24 19:53:17
@LastEditTime: 2019-11-24 20:57:07
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\3.无重复字符的最长子串.py
'''
#
# @lc app=leetcode.cn id=3 lang=python3
#
# [3] 无重复字符的最长子串
#

# @lc code=start
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        from collections import defaultdict

        if not s :return 0
        lookup = defaultdict(int) #保存 一个字符上一次出现的位置index
        start = 0  #一个子字符串 开始的index
        end =0     #一个子字符串 结束的index
        max_len = 0  #最大的子字符串长度

        while end < len(s):
            if s[end] in lookup:#在字典中
                start = max(start,lookup[s[end]]) #起始位置跳到出现的后一个字符
            
            lookup[s[end]]= end+1   #更新字符出现的位置index
            end += 1                #向后走一个
            max_len = max(max_len,end-start) 
        return max_len

# a = Solution()
# print(a.lengthOfLongestSubstring("abba"))
# @lc code=end

