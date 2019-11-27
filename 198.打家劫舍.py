'''
@Author: your name
@Date: 2019-11-27 23:22:50
@LastEditTime: 2019-11-27 23:42:17
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\198.打家劫舍.py
'''
#
# @lc app=leetcode.cn id=198 lang=python3
#
# [198] 打家劫舍
# #
# 方法一：动态规划
# 算法

# 考虑所有可能的抢劫方案过于困难。一个自然而然的想法是首先从最简单的情况开始。记：

# f(k) = 从前 k 个房屋中能抢劫到的最大数额，A_i = 第 i 个房屋的钱数。

# 首先看 n = 1 的情况，显然 f(1) = A_1
# 再看 n = 2，f(2) = max(A_1, A_2)。
# 对于 n = 3，有两个选项:
# 抢第三个房子，将数额与第一个房子相加。
# 不抢第三个房子，保持现有最大数额。
# 显然，你想选择数额更大的选项。于是，可以总结出公式：
# f(k) = max(f(k – 2) + A_k, f(k – 1))
# 我们选择 f(–1) = f(0) = 0 为初始情况，这将极大地简化代码。
# @lc code=start
class Solution:
    def rob(self, nums):
        if len(nums)==0:
            return 0
        if len(nums)==1:
            return nums[0]
        else:
            max_ruby=[nums[0],max(nums[0],nums[1])]
            for i in range(2,len(nums)):
                max_ruby.append(max(max_ruby[i-2]+nums[i],max_ruby[i-1]))
            return max_ruby[len(nums)-1]
a = Solution()
print(a.rob([1,2,3,1]))
# @lc code=end

