'''
@Author: your name
@Date: 2019-11-27 17:50:12
@LastEditTime: 2019-11-27 18:00:04
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\121.买卖股票的最佳时机.py
'''
#
# @lc app=leetcode.cn id=121 lang=python3
#
# [121] 买卖股票的最佳时机
#假设当前天为第N天，则问题一般化为求前N-1天中最小的值


# @lc code=start
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices:
            return 0
        min_index=[prices[0]]
        max_profit=[0]
        for i in range(1,len(prices)):
            max_profit.append(prices[i]-min_index[i-1])
            min_index.append(min(min_index[i-1],prices[i]))
        return max(max_profit)

# @lc code=end

