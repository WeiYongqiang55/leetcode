'''
@Author: your name
@Date: 2019-11-24 18:22:39
@LastEditTime: 2019-11-24 19:15:04
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\1.两数之和.py
'''
#
# @lc app=leetcode.cn id=1 lang=python3
#
# [1] 两数之和
#

# @lc code=start
class Solution:
    # def twoSum(self, nums: List[int], target: int) -> List[int]:
    #     for i in range(len(nums)):
    #         if target-nums[i] in nums:
    #             if i== nums.index(target-nums[i]):
    #                 continue
    #             else:
    #                 return [i,nums.index(target-nums[i])]
    #best solution by Google
    #解题思路 ：建立一个字典，字典中放置[target- 当前值]=当前值index
    #当查找一个数时，若在字典中有，说明有数字和这个数相加为target。
    def twoSum(self, num, target):
        map = {}
        for i in range(len(num)):
            if num[i] not in map:
                map[target - num[i]] = i 
            else:
                return map[num[i]], i 

        return -1, -1
# @lc code=end

