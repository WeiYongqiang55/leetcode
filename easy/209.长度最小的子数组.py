'''
@Author: your name
@Date: 2019-11-25 15:55:00
@LastEditTime: 2019-11-25 16:52:25
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\209.长度最小的子数组.py
'''
#
# @lc app=leetcode.cn id=209 lang=python3
#
# [209] 长度最小的子数组
# 滑动窗口算法，先向右扩展，直到满足sum>=s，
# 然后左边缩减，直到达到满足sum>=s的最小的start：end,
# 然后接着向右滑动窗口

# @lc code=start
class Solution:
    # mysolution
    def minSubArrayLen(self,s, nums):
        start = end =0
        sum =0
        res=[]
        min_len = float("inf")
        while end < len(nums):
            
            sum +=nums[end]
            if sum >=s:#向右扩展窗口直到满足条件
                while sum >=s: #不断缩减窗口大小，直到条件不满足
                    if min_len > end-start:
                        min_len = end - start+1
                        res = nums[start:end+1]
                    sum = sum-nums[start] #缩小窗口大小
                    start = start + 1
                start -=1 #因为while里最后一次多走了，走回去
                sum += nums[start]
            end+=1
        
        return len(res)

    #someone else`s answer
    # def minSubArrayLen(self, s: int, nums: List[int]) -> int:
    #     x=sum(nums)
    #     if s>x:
    #         return 0
    #     elif s==x:
    #         return len(nums)
    #     else:
    #         # 滑动窗口法，从左向右
    #         # 定义左指针和右指针位置之间的部分为计数的窗口
    #         # 当计数和大于s时，对左侧窗口进行移动，记录满足条件的最小窗口长度
    #         # 当右指针指到末尾，且左指针移动到不能移动时，便是遍历了所有满足条件的窗口，返回最小窗口长度
    #         left=0
    #         total=0
    #         minCount=len(nums)
    #         for right in range(len(nums)):
    #             total+=nums[right]
    #             while total >=s:
    #                 minCount=min(minCount,right-left+1)
    #                 total-=nums[left]
    #                 left+=1
    #         return minCount
# print(Solution.minSubArrayLen(7,[2,3,1,2,4,3]))
# @lc code=end

