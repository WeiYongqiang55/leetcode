'''
@Author: your name
@Date: 2019-12-01 13:43:11
@LastEditTime: 2019-12-01 14:56:17
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\3.无重复字符的最长子串.py
'''
#
# @lc app=leetcode.cn id=3 lang=python3
#
# [3] 无重复字符的最长子串
# 解题思路：
# 字典加滑动窗口
# 
# @lc code=start
class Solution:
    def lengthOfLongestSubstring(self, s):
        if len(s)<2:
            return len(s)

        dic  = {}
        dic[s[0]] = 0
        
        max_length = 0
        start = 0
        target  = 1
        while target < len(s):
            if s[target] not in dic:
                dic[s[target]]=target
                target += 1
            else:
                #已经出现过了
                if dic[s[target]] >= start:#
                    #两种情况 abcb abcabc 
                    length = max(target - dic[s[target]], target - start)
                    if max_length < length:
                        max_length = length
                    
                    start = dic[s[target]] + 1
                    dic[s[target]] =target
                    target += 1
                else:
                    dic[s[target]] = target
                    target += 1
        # 针对 au这种没有重复的
        return max(max_length,(target-start))

a= Solution()
print(a.lengthOfLongestSubstring("au"))
# @lc code=end

