'''
@Author: weiyq 
@Date: 2019-12-04 10:47:57
@LastEditTime: 2019-12-04 16:16:56
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\46.全排列.py
'''
#
# @lc app=leetcode.cn id=46 lang=python3
#
# [46] 全排列
# 解题思路：回溯算法
# 类似题目有39，40 ，377

# @lc code=start
class Solution:
    def permute(self, candidates):
        #没有重复数字，用递归回溯
        candidates.sort() 
        size = len(candidates)-1
        if size ==-1 :
            return 0
        path = []
        res =  [] 
        self._dfs(candidates,0,size,path,res)
        return res

    def _dfs(self,candidates,begin,size,path,res):
        if len(candidates) == 0:
            #候选空了，说明全部都被使用了
            res.append(path[:])
            return 
        for index in range(size,begin-1,-1):
            path.append(candidates[index])
            #用完一个要减去一个，因为全排列一个数字不能重复出现
            #在这里我们使用切片的方式去掉
            self._dfs(candidates[:index]+candidates[index+1:],begin,size-1,path,res)
            path.pop()
a = Solution()   
print(a.permute([1,2,3]))
# @lc code=end

