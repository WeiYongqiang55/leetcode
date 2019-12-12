'''
@Author: your name
@Date: 2019-12-11 18:05:12
@LastEditTime: 2019-12-11 18:44:41
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\118.杨辉三角.py
'''
#
# @lc app=leetcode.cn id=118 lang=python3
#
# [118] 杨辉三角
#

# @lc code=start
class Solution:
    def generate(self, numRows):
        res = [[1],[1,1]]
        if(numRows <3):
            return res[:numRows]
        for i in range(2,numRows):
            res.append([])
            for j in range(0,i+1):
                if j==0 or j== i:
                    res[i].append(1)
                else:
                    res[i].append(res[i-1][j-1] + res[i-1][j])
        return res  
a = Solution()
print(a.generate(5))
# @lc code=end

