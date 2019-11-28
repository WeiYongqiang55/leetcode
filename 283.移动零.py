'''
@Author: your name
@Date: 2019-11-28 21:29:49
@LastEditTime: 2019-11-28 21:51:53
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\283.移动零.py
'''
#
# @lc app=leetcode.cn id=283 lang=python3
#
# [283] 移动零
#
#双指针 s指针指向的是值为0的元素，
# t指针指向的是0元素后的第一个不为0的元素，
# 然后交换这两个元素的值
#   0 ， 1 ，0 ， 3 ，12 
#   s    t
#   1 ， 0 ，0 ， 3 ，12 
#        s        t
#   1 ， 3 ，0 ， 0 ，12 
#            s        t
#   1 ， 3 ，12 ， 0 ，0 

# @lc code=start
class Solution:
    def moveZeroes(self, nums):
        """
        Do not return anything, modify nums in-place instead.
        """
        size = len(nums)
        if size < 2:
            return 
        s = 0
        t = 1
        while t < size:
            if not nums[s]:#s 是0
                
                if nums[t] !=0:
                    nums[s],nums[t] = nums[t],nums[s]
                    s += 1
                t += 1
               
            else:
                s += 1
                if t <= s:
                    t = s+1
        print(nums)      
a = Solution()
print(a.moveZeroes([1,0]))
        
# @lc code=end

