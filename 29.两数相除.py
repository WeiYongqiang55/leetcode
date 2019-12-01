'''
@Author: your name
@Date: 2019-12-01 21:21:03
@LastEditTime: 2019-12-01 21:50:33
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\29.两数相除.py
'''
#
# @lc app=leetcode.cn id=29 lang=python3
#
# [29] 两数相除
#

# @lc code=start
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        sign = (dividend > 0) ^ (divisor > 0)
        dividend = abs(dividend)
        divisor = abs(divisor)
        count = 0
        #把除数不断左移，直到它大于被除数 10 /3 3 是除数 10 是被除数
        while dividend >= divisor:
            count += 1
            divisor <<= 1 #左移 *2
        result = 0
        while count > 0:
            count -= 1
            divisor >>= 1 #右移 /2
            if divisor <= dividend:
                #这里的移位运算是把二进制（第count+1位上的1）转换为十进制
                result += 1 << count 
                dividend -= divisor
        if sign: result = -result
        return result if -(1<<31) <= result <= (1<<31)-1 else (1<<31)-1 


# @lc code=end

