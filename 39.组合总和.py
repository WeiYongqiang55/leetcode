'''
@Author: your name
@Date: 2019-12-02 20:49:15
@LastEditTime: 2019-12-02 23:37:36
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\39.组合总和.py
'''
#
# @lc app=leetcode.cn id=39 lang=python3
#
# [39] 组合总和
# 1、递归回溯 每次都从最大的开始减，如果不满足条件就尝试下一个比较小的,
# 约束条件： 叶子节点要减掉的数不能比上一个大


# @lc code=start
class Solution:
    def combinationSum(self, candidates, target):
        #动态规划
        candidates.sort() 
        size = len(candidates)-1
        if size ==-1 :
            return []
        path = []
        res =  [] 
        self._dfs(candidates,0,size,path,res,target)
        return res

    def _dfs(self,candidates,begin,size,path,res,target):
        if target ==0:
            #结束递归
            res.append(path[:])
            return 

        elif target <candidates[0]: #值小于最小的候选，无法通过加和完成
            return 

        for index in range(size,begin-1,-1):
            # print(index)
            residue = target - candidates[index] #从后往前减

            path.append(candidates[index])
            self._dfs(candidates,begin,index,path,res,target=residue)
            path.pop()




a= Solution()
print(a.combinationSum([1],1))



# @lc code=end

