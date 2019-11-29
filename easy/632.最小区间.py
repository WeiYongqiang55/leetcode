'''
@Author: weiyq
@Date: 2019-11-25 22:47:27
@LastEditTime: 2019-11-26 14:52:07
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\632.最小区间.py
'''
#
# @lc app=leetcode.cn id=632 lang=python3
#
# [632] 最小区间
# 

# @lc code=start
class Solution:
    # 不超时版本 ，使用了优先队列 import heapq 
    # 最左值 left：最小的最小值，使用最小堆维护
    # 最右值 right：最大的最小值，每次在行内右移后，与上次的right值比较，取较大值
    # 循环：去除当前的最左值，用这个值所在行的下一个值替换，若right - left 小于上次结果，则替换
    # 当某一行扫描结束，则跳出循环   
    def smallestRange(self, nums):
        import heapq # 优先队列

        heap = [(row[0], index, 0) for index, row in enumerate(nums)]
        heapq.heapify(heap) #创建一个优先队列
        ans = -1e5, 1e5 #保存的是结果数组的下界和上界
        right = max(heap)[0] # 当前指针指向的数字中最大的那个数字

        while heap:
            # (row[0], index, 0) 返回的是这个格式的数据
            left, i, j = heapq.heappop(heap) #弹出并返回当前队列中最小的数
            if right - left < ans[1] - ans[0]: 
                ans = left, right
            if j + 1 == len(nums[i]):
                return ans
            v = nums[i][j+1] #最小的那个数的后一个数
            right = max(right, v)  #更新最大值
            heapq.heappush(heap, (v, i, j+1)) # 把最小的那个组的指针向后移一个



    #超时版本
    # def smallestRange(self, nums):
    #     import sys
    #     k = [0]*len(nums) #指针的位置 开始全为0
    #     length_lists = [len(i) for i in nums]
    #     l = r = 0 #保存上下界的index 也就是k的index
    #     min_index = -sys.maxsize #下界 
    #     max_index = sys.maxsize  #上界
    #     while k[l]<length_lists[l] :
    #         numbers = [nums[i][k[i]] for i in range(len(k))]#保存每个数组中当前指针指向的数字
    #         l = numbers.index(min(numbers)) 
    #         r = numbers.index(max(numbers))
            
    #         #这里要判断一下，哪个是最小的符合条件的区间
    #         if nums[r][k[r]] - nums[l][k[l]] < max_index-min_index:
    #         #小于 ，直接替换掉
    #             max_index = nums[r][k[r]] 
    #             min_index = nums[l][k[l]]
    #         elif nums[r][k[r]] - nums[l][k[l]] == max_index-min_index:
    #             #等于 比较a 和 C的大小，如果a < c，则替换，负责不替换
    #             if nums[l][k[l]] < min_index:
    #                 max_index = nums[r][k[r]]
    #                 min_index = nums[l][k[l]]
    #         k[l] = k[l] +1 #x 向后移动一位

    #     k[l] -= 1
        
    #     return [min_index,max_index]

a= Solution()
print(a.smallestRange([[4,10,15,24,26], [0,9,12,20], [5,18,22,30]]))
# @lc code=end

