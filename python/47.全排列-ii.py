'''
@Author: weiyq 
@Date: 2019-12-04 16:17:44
@LastEditTime: 2019-12-04 16:24:28
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\47.全排列-ii.py
'''
#
# @lc app=leetcode.cn id=47 lang=python3
#
# [47] 全排列 II
# 解题：
# 递归回溯，和组合总和40题很像，思路很像

# @lc code=start
class Solution:
    def permuteUnique(self, candidates):
         #有重复数字，用递归回溯
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
        # for index in range(size,begin-1,-1):
        #改成while 
        index = size
        while index >=0:
            path.append(candidates[index])
            #用完一个要减去一个，因为全排列一个数字不能重复出现
            #在这里我们使用切片的方式去掉
            self._dfs(candidates[:index]+candidates[index+1:],begin,size-1,path,res)
            #在这儿判断重复的数字，跳过去
            while index >= 0  and candidates[index] == candidates[index-1]:
                index -= 1
            index -= 1
            path.pop()
a = Solution()   
print(a.permuteUnique([1,1,2]))
# @lc code=end

