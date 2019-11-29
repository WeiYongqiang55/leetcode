'''
@Author: your name
@Date: 2019-11-25 16:44:27
@LastEditTime: 2019-11-25 17:36:46
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\239.滑动窗口最大值.py
'''
#
# @lc app=leetcode.cn id=239 lang=python3
#
# [239] 滑动窗口最大值
#

# @lc code=start
class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        length = len(nums)
        if not length or k==0:
            return []
        max_of_window=[]
        start=0 
        end =k
        for i in range(length-k+1):
            max_of_window.append(max(nums[i:i+k]))
        return max_of_window
# print(Solution.maxSlidingWindow([],0))
# @lc code=end

