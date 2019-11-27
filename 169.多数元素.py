'''
@Author: your name
@Date: 2019-11-27 23:13:26
@LastEditTime: 2019-11-27 23:13:57
@LastEditors: your name
@Description: In User Settings Edit
@FilePath: \leetcode\169.多数元素.py
'''
#
# @lc app=leetcode.cn id=169 lang=python3
#
# [169] 多数元素
#

# @lc code=start
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        length = len(nums)
        dic={}
        for i in nums:
            if i in dic:
                dic[i]+=1
            else:
                dic[i]=1
        for i in dic:
            if dic[i]>int(length/2):
                return i 
# @lc code=end

