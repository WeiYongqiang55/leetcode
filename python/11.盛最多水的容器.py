'''
@Author: weiyq
@Date: 2019-11-30 20:42:18
@LastEditTime: 2019-11-30 21:43:43
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\11.盛最多水的容器.py
'''
#
# @lc app=leetcode.cn id=11 lang=python3
#
# [11] 盛最多水的容器
#
# 双指针法，一开始头指针指向开始，尾指针指向末尾
# 计算面积，然后移动数字小的一个指针，如果是头指针指向的数字小，那么头指针向后移动
# 如果是尾指针指向的数字小，那么尾指针向前移动
# 如此移动直到头指针不小于尾指针
# @lc code=start
class Solution:
    def maxArea(self, height: List[int]) -> int:
        start = 0
        end  = len(height)-1
        max_eara = 0
        while start < end:
            area = min(height[start], height[end]) * (end - start)
            if max_eara < area:
                max_eara = area
            if height[start] <= height[end]:
                start += 1
            else:
                end -= 1
        
        return max_eara
# @lc code=end

