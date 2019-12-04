'''
@Author: your name
@Date: 2019-12-03 22:59:01
@LastEditTime: 2019-12-04 10:44:16
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\377.组合总和-ⅳ.py
'''
#
# @lc app=leetcode.cn id=377 lang=python3
#
# [377] 组合总和 Ⅳ
# 因为有超时测试，所以采用带备忘录的回溯

# @lc code=start
class Solution:
    def combinationSum4(self, candidates, target):
       #
        candidates.sort() 
        size = len(candidates)-1
        if size ==-1 :
            return 0
        path = []
        res =  [] 
        dic={} #字典，用来保存一个数字有几种表达方式
        #用来计数，一个数字有几种表达方式
        count= self._dfs(candidates,0,size,path,res,target,dic)
        return count

    def _dfs(self,candidates,begin,size,path,res,target,dic):
        if target ==0:
            #结束递归
            # #表达方式+1  
            res.append(path[:])
            return 1

        elif target <candidates[0]: #值小于最小的候选，无法通过加和完成
            return 0
        count = 0
        for index in range(size,begin-1,-1):
            residue = target - candidates[index] #从后往前减
            if residue not in dic:
                path.append(candidates[index])
                cur = self._dfs(candidates,begin,size,path,res,residue,dic)
                dic[residue] = cur
                count += cur
                path.pop()
            else:
                count += dic[residue]      
        return count
        

a = Solution()
print(a.combinationSum4([1,2,3],4))
# @lc code=end

