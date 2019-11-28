'''
@Author: your name
@Date: 2019-11-28 21:52:14
@LastEditTime: 2019-11-28 22:14:49
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\342.4-的幂.py
'''
#
# @lc app=leetcode.cn id=342 lang=python3
#
# [342] 4的幂
#
#方法一 : 循环,如果可以整除4,就整除,一直到等于1,
#  说明是4的米次方,否则不是
#方法二 : 
# 首先来看一个类似的问题,判断一个数是不是2的幂次方:
# 将2的幂次方写成二进制形式后，很容易就会发现有一个特点：
# 二进制中只有一个1，并且1后面跟了n个0； 
# 因此问题可以转化为判断1后面是否跟了n个0就可以了。

# 我们发现 8&7 的二进制形式: 1000 & 0111 ==0 
# 16&15 10000 & 01111 ==0
# 所以判断是不是2的幂次方就用公式:
# (number & number -1) == 0 
# 来判断,如果是0 ,那这个数就是2的幂次,否则不是

# 那么如何来判断是否是4的幂次方?
# 4的幂次是每次在撒好难过一个数的基础上乘以4,
# 二进制来说就是在后面补2个0,比如
# 4     100
# 16    10000
# 64    1000000
# 所以4的幂次的1一直在奇数位置上,
# 0xaaaaaaaa = 10101010101010101010101010101010 (偶数位为1,奇数位为0)
# 0x55555555 = 01010101010101010101010101010101 (偶数位为0,奇数位为1)
# 如果一个数,和0xaaaaaaaa与操作结果为0 ,
# 和0x55555555与操作结果不为0 ,那么就是4的幂次方


# @lc code=start
class Solution:
    def isPowerOfFour(self, num: int) -> bool:
        #先看是不是2的幂次方
        if num & (num-1) ==0:#是2的幂次方
            #判断是不是4的幂次方
            if num & 0xaaaaaaaa == 0 and num & 0x55555555 !=0 :
                return True
        return False    
# @lc code=end

