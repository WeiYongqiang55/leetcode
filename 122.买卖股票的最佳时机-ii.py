
'''
@Author: 魏永强
@Date: 2019-11-27 19:42:59
@LastEditTime: 2019-11-27 20:28:58
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\122.买卖股票的最佳时机-ii.py
'''
#
# @lc app=leetcode.cn id=122 lang=python3
#
# [122] 买卖股票的最佳时机 II
#只要有的赚就赚策略

# @lc code=start
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        profile_sum =0
        for i in range(1,len(prices)):
            if prices[i] > prices[i-1]:
                profile_sum += prices[i] - prices[i-1]
        return profile_sum



# @lc code=end

