'''
@Author: your name
@Date: 2019-12-04 19:52:54
@LastEditTime: 2019-12-04 21:52:09
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\55.跳跃游戏.py
'''
#
# @lc app=leetcode.cn id=55 lang=python3
#
# [55] 跳跃游戏
# 阶梯1：递归问题，从头向尾巴走
# 解题思路2：
# 如果某一个作为 起跳点 的格子可以跳跃的距离是 3，那么表示后面 3 个格子都可以作为 起跳点。
# 可以对每一个能作为 起跳点 的格子都尝试跳一次，把 能跳到最远的距离 不断更新。
# 如果可以一直跳到最后，就成功了。
# @lc code=start
class Solution:
    def canJump(self, nums):
        #阶梯3：查找0的个数，如果有0的区域可以被跨过去，
        # 也就是nums[i]>mins,则没问题，如果有一串0不能被跨过去，
        # 那么就无法到达最后，这个问题中不能到达最后的情况只有遇到这种连续的0的情况。
        #      3 0 1 0 0 1 0 0 1 9
        # mins 0 1 2 3 4 5 6 7 8 0 
        nums.reverse()
        mins=0
        for i in range(1,len(nums)):
            if nums[i]>mins:#可以直接跨过去前面不能跨过去的
                mins=0
            else:
                mins+=1 #遇到0了，统计不能跨过去的长度
        return mins==0


        # 阶梯丝路2
        # k = 0
        # size = len(nums)
        # for i in range(size):
        #     if i>k:
        #         return False
        #     k = max(k,i+nums[i])
        #     if k>=size:
        #         break
        # return True

        # 递归回溯
    #     position = 0
    #     memo={}
    #     return self.dfs(nums,position,memo)>0
        
    # def dfs(self,nums,position,memo):
    #     if position ==len(nums)-1:
    #         return 1 
    #     if position >len(nums)-1:
    #         return 0
    #     if nums[position] ==0 :
    #         return 0
    #     if position in memo:#之前已经走过了
    #         if memo[position]:
    #             return 1
    #         else:
    #             return 0
    #     else:
    #         count =0
    #         for step in range(1,nums[position]+1):
    #             cur = self.dfs(nums,position = position+step,memo=memo)
    #             if cur:#可以走到
    #                 memo[position+step]= True
    #             else:
    #                 memo[position+step]= False
    #             count += cur
    #         return count
            
a= Solution()
print(a.canJump([2,0]))
        
# @lc code=end

