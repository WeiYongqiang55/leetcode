'''
@Author: your name
@Date: 2019-12-11 19:16:22
@LastEditTime: 2019-12-11 19:20:15
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\119.杨辉三角-ii.py
'''
#
# @lc app=leetcode.cn id=119 lang=python3
#
# [119] 杨辉三角 II
#

# @lc code=start
class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        res = [[1],[1,1]]
        if(rowIndex <2):
            return res[rowIndex]
        for i in range(2,rowIndex+1):
            res.append([])
            for j in range(0,i+1):
                if j==0 or j== i:
                    res[i].append(1)
                else:
                    res[i].append(res[i-1][j-1] + res[i-1][j])
        return res[rowIndex]  
# @lc code=end

