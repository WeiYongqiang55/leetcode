'''
@Author: your name
@Date: 2019-11-27 10:36:03
@LastEditTime: 2019-11-27 11:04:57
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\26.删除排序数组中的重复项.py
'''
#
# @lc app=leetcode.cn id=26 lang=python3
#
# [26] 删除排序数组中的重复项
#

# @lc code=start
class Solution:
    def removeDuplicates(self, nums):
        if len(nums)<2:
            return len(nums)
        i = start = end = 0
        index = []
        while start< len(nums):
            end  = start +1
            index.append(start)  
            while end < len(nums) and nums[start] == nums[end]:
                end += 1
            start = end
        for i in range(len(index)):
            nums[i] = nums[index[i]]
        nums = nums[:len(index)]
        return len(index)
            
                
# a= Solution()
# print(a.removeDuplicates([1,1,2])) 

# @lc code=end

