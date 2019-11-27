'''
@Author: your name
@Date: 2019-11-27 11:06:16
@LastEditTime: 2019-11-27 11:29:32
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\53.最大子序和.py
'''
#
# @lc app=leetcode.cn id=53 lang=python3
#
# [53] 最大子序和
#
# 设置一个和nums数组一样长度的数组，
# 每个数组保存从开始到当前位置的加和最大的值，
# 每遇到一个新的数，都计算max（当前数，当前数+前面的最大值）

# @lc code=start
class Solution:
    def maxSubArray(self, nums):
        import sys
        max_sum = -sys.maxsize
        index=[nums[0]]
        for i in range(1,len(nums)):
            index.append(max(nums[i],index[i-1]+nums[i]))
        max_sum=max(index)
        return max_sum
a = Solution()
print(a.maxSubArray([-2,1,-3,4,-1,2,1,-5,4]))
# @lc code=end

