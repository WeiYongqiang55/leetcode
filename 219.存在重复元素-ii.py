'''
@Author: your name
@Date: 2019-11-28 20:44:40
@LastEditTime: 2019-11-28 20:51:00
@LastEditors: Please set LastEditors
@Description: In User Settings Edi
@FilePath: \leetcode\219.存在重复元素-ii.py
'''
#
# @lc app=leetcode.cn id=219 lang=python3
#
# [219] 存在重复元素 II
#
#字典保存字母上一次出现的位置index,查找
# @lc code=start
class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        dic= {}
        for i in range(len(nums)):
            if nums[i] in dic:
                if i - dic[nums[i]] <= k:
                    return True
                else:
                    dic[nums[i]] = i
            else:
                dic[nums[i]] = i
        return False
# @lc code=end

