'''
@Author: your name
@Date: 2019-11-27 11:33:21
@LastEditTime: 2019-11-27 17:23:12
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\88.合并两个有序数组.py
'''
#
# @lc app=leetcode.cn id=88 lang=python3
#
# [88] 合并两个有序数组
#

# @lc code=start
class Solution:
    def merge(self, nums1, m, nums2, n):
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # import copy
        # #我的有错版本
        result = []
        length_1 =  m
        length_2 = n
        s = t = 0 #两个指针，分别指向nums1 和nums2
        
        while s < length_1 and t < length_2:
            if nums1[s] <= nums2[t]:
                result.append(nums1[s])
                s += 1
            else:
                result.append(nums2[t])
                t += 1
        if s != length_1:
            while s<length_1:
                result.append(nums1[s])
                s += 1
        if t != length_2:
            while t < length_2:
                result.append(nums2[t])
                t += 1
        nums1[:] = result.copy() #一定要这样才行才会改变引用数据
        # for i in range(len(nums1)):
        #     nums1[i] = result[i]
        # print(nums1)

        # # #题解版本
        # #  # Make a copy of nums1.
        # nums1_copy = nums1[:m] 
        # nums1[:] = []

        # # Two get pointers for nums1_copy and nums2.
        # p1 = 0 
        # p2 = 0
        
        # # Compare elements from nums1_copy and nums2
        # # and add the smallest one into nums1.
        # while p1 < m and p2 < n: 
        #     if nums1_copy[p1] < nums2[p2]: 
        #         nums1.append(nums1_copy[p1])
        #         p1 += 1
        #     else:
        #         nums1.append(nums2[p2])
        #         p2 += 1

        # # if there are still elements to add
        # if p1 < m: 
        #     nums1[p1 + p2:] = nums1_copy[p1:]
        # if p2 < n:
        #     nums1[p1 + p2:] = nums2[p2:]
        # print(nums1)

        
# a = Solution()
# print(a.merge([1,2,3,0,0,0],
# 3,
# [2,5,6],
# 3))
# @lc code=end

