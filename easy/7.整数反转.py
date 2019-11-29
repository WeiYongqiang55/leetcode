'''
@Author: your name
@Date: 2019-11-26 15:09:10
@LastEditTime: 2019-11-26 15:25:04
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\7.整数反转.py
'''
#
# @lc app=leetcode.cn id=7 lang=python3
#
# [7] 整数反转
#

# @lc code=start
class Solution:
    def reverse(self, x: int) -> int:
        
        if x < 0:
            x = str(x)[1:]
            x='-'+x[::-1]
            if int(x)> -2**31:
                return int(x)
            else:
                return 0
        else:
            x = str(x)
            if int(x[::-1])  < 2**31-1:
                return int(x[::-1]) 
            else: 
                return 0
# @lc code=end

