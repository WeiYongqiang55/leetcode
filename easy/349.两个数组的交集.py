'''
@Author: weiyq
@Date: 2019-11-28 22:15:27
@LastEditTime: 2019-11-28 22:31:37
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\349.两个数组的交集.py
'''
#
# @lc app=leetcode.cn id=349 lang=python3
#
# [349] 两个数组的交集
#
#字典
# @lc code=start
class Solution:
    def intersection(self, nums1, nums2):
        #方法1 太慢 18%
        # nums1 = list(set(nums1))
        # nums2 = list(set(nums2))

        # result =[]
        # for i in nums2:
        #     if i  in nums1:
        #         result.append(i)
        # return result 

        #方法2 字典 71.3%
        # dic = {}
        # for i in nums1:
        #     if i not in dic:
        #         dic[i]=1
        # result = []
        # for i in nums2:
        #     if i in dic:
        #         result.append(i)
        # return list(set(result))

        #方法3 84.07%
        result = list(set(nums1) & set(nums2)) #求交集
        return result
# a = Solution()
# print(a.intersection([1,2,2,1],
# [2,2]))
# @lc code=end

