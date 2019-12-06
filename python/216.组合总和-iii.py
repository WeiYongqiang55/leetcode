'''
@Author: your name
@Date: 2019-12-03 22:44:08
@LastEditTime: 2019-12-03 22:56:27
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\216.组合总和-iii.py
'''
#
# @lc app=leetcode.cn id=216 lang=python3
#
# [216] 组合总和 III
#和40题 有相同点,使用k来剪枝

# @lc code=start
class Solution:
    def combinationSum3(self, k, n) :
        #回溯
        candidates=[1,2,3,4,5,6,7,8,9]
        size = len(candidates)-1
        if size ==-1 :
            return []
        path = []
        res =  [] 
        target= n
        self._dfs(candidates,0,size,path,res,target,k)
        return res

    def _dfs(self,candidates,begin,size,path,res,target,k):
        if target ==0:
            #结束递归
            if k==0:
                res.append(path[:])
            return 

        elif target <candidates[0]: #值小于最小的候选，无法通过加和完成
            return 
        elif k<0: #剪枝
            return 
        # for index in range(size,begin-1,-1):
        index = size
        while index >=0: #这里是大于等于0
            # print(index)
            residue = target - candidates[index] #从后往前减

            path.append(candidates[index])
            self._dfs(candidates,begin,index-1,path,res,residue,k-1)
            #减枝 ，当遇到相同的就跳过
            # while index>0 and candidates[index] == candidates[index -1]:
            #     index -= 1
            index -= 1
            # k += 1
            path.pop()

a = Solution()
print(a.combinationSum3(3,9))
# @lc code=end

