'''
@Author: your name
@Date: 2019-12-01 21:51:07
@LastEditTime: 2019-12-01 22:54:02
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\31.下一个排列.py
'''
#
# @lc app=leetcode.cn id=31 lang=python3
#
# [31] 下一个排列
# 双指针 ，从右向左，扫描直到找到降序的第一个数字i，
# 从数字i右边开始，找刚好i大的数字j，把数字i和j互换，
# 然后将数字j后的所有数字逆序保存

# @lc code=start
class Solution:
    def nextPermutation(self, nums):
        """
        Do not return anything, modify nums in-place instead.
        """
        #双指针
        num = nums[:]
        nums[:] = []
        start = len(num)-2

        while start >= 0  and num[start]>= num[start+1]:
            start -= 1
        #找到了降序的start 
        if start >=0:
            end = start + 1
            while end <len(num) and num[end] > num[start]:
                end += 1
            end -= 1
            if end <len(num):
                #互换
                temp = num[end]
                num[end] = num[start]
                num[start] = temp
                #逆序
                num[start+1:] = num[start+1:][::-1]
        else:
            #全是升序的
            num[:] = num[::-1]
        nums[:] = num
        # print(num)
        print(nums)

a= Solution()
print(a.nextPermutation([5,1,1]))
# @lc code=end

