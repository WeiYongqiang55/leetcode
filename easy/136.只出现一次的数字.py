'''
@Author: weiyq
@Date: 2019-11-27 21:32:37
@LastEditTime: 2019-11-27 21:43:04
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\136.只出现一次的数字.py
'''
#
# @lc app=leetcode.cn id=136 lang=python3
#
# [136] 只出现一次的数字
#数学： 2*（a + b + c） - (a + a + b + b + c) = c

# @lc code=start
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        return 2*sum(set(nums))- sum(nums)
# @lc code=end

