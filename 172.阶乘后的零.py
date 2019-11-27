'''
@Author: weiyq
@Date: 2019-11-27 22:53:53
@LastEditTime: 2019-11-27 23:12:56
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\172.阶乘后的零.py
'''
#
# @lc app=leetcode.cn id=172 lang=python3
#
# [172] 阶乘后的零
#每个5会产生一个0,所以数5的因子个数就好
#比如 5！ 1 个0
# 10！  5 10=2*5                    00
# 15！  5 10=2*5  15= 3*5           000
# 20！  5 10=2*5  15= 3*5 4*5       0000
# 25！  5 10=2*5  15= 3*5 4*5 5*5   000000
# @lc code=start
class Solution:
    def trailingZeroes(self, n: int) -> int:
        count = 0;
        while(n >= 5):
            count += int(n / 5)
            n = int(n/5)
        
        return int(count)
# @lc code=end

