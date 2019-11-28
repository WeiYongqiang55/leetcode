'''
@Author: your name
@Date: 2019-11-28 21:18:36
@LastEditTime: 2019-11-28 21:29:20
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\263.丑数.py
'''
#
# @lc app=leetcode.cn id=263 lang=python3
#
# [263] 丑数
#

# @lc code=start
class Solution:
    def isUgly(self, num: int) -> bool:
        if num <= 0:
            return False
        while True:
            last = num
            if not num % 2:#可以被2整除
                num //= 2
            if not num % 3:#
                num //= 3
            if not num % 5:
                num //= 5
            if num == 1:
                return True
            if last == num: #如果走了一遍，num 不能被2 3 5任何一个整除，也不是1 则说明不是丑数
                return False
            
# @lc code=end

