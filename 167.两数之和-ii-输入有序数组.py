'''
@Author: your name
@Date: 2019-11-27 22:23:36
@LastEditTime: 2019-11-27 22:43:50
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\167.两数之和-ii-输入有序数组.py
'''
#
# @lc app=leetcode.cn id=167 lang=python3
#
# [167] 两数之和 II - 输入有序数组
#两个指针，

# @lc code=start
class Solution:
    def twoSum(self, numbers, target):
         # 定义low，high指针分别处在数组两端 
        low,high = 0,len(numbers) - 1
        while low < high:
            # 如果两指针之和为target值，返回索引+1
            if numbers[low] + numbers[high] == target:
                return low + 1,high + 1
            # 如果两指针指向值之和大于target值，high指针左移
            elif numbers[low] + numbers[high] > target:
                high -= 1
            # 如果两指针指向值之和小于target值，low指针右移
            else:
                low += 1

a= Solution()
print(a.twoSum([2,7,11,15],
9))
# @lc code=end

