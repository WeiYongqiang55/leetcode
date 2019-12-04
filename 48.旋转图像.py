'''
@Author: your name
@Date: 2019-12-04 17:10:54
@LastEditTime: 2019-12-04 19:27:37
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\48.旋转图像.py
'''
#
# @lc app=leetcode.cn id=48 lang=python3
#
# [48] 旋转图像
# 先做上下颠倒，然后再做斜对称互换

# @lc code=start
class Solution:
    def rotate(self, matrix):
        """
        Do not return anything, modify matrix in-place instead.
        """
        #先上下颠倒
        size = len(matrix)
        for i in range(len(matrix)//2):
            temp = matrix[i]
            matrix[i] = matrix[size-1-i]
            matrix[size-1-i] = temp
        #然后对称互换
        for i in range(size):
            for j in range(i+1,size):
                temp = matrix[i][j] 
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
        print(matrix)
a = Solution()
print(a.rotate([
  [1,2,3],
  [4,5,6],
  [7,8,9]
],))
# @lc code=end

