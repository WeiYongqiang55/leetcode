'''
@Author: your name
@Date: 2019-12-03 09:53:39
@LastEditTime: 2019-12-03 22:39:41
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\40.组合总和-ii.py
'''
#
# @lc app=leetcode.cn id=40 lang=python3
#
# [40] 组合总和 II
#

# @lc code=start
class Solution:
    def combinationSum2(self, candidates, target):
        #回溯
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

        # for index in range(size,begin-1,-1):
        index = size
        while index >=0: #这里是大于等于0
            # print(index)
            residue = target - candidates[index] #从后往前减

            path.append(candidates[index])
            self._dfs(candidates,begin,index-1,path,res,target=residue)
            #减枝 ，当遇到相同的就跳过
            while index>0 and candidates[index] == candidates[index -1]:
                index -= 1
            index -= 1
            path.pop()

a = Solution()
print(a.combinationSum2([5],5))
# @lc code=end

