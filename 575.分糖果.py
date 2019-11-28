'''
@Author: your name
@Date: 2019-11-28 22:51:08
@LastEditTime: 2019-11-28 23:03:46
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\575.分糖果.py
'''
#
# @lc app=leetcode.cn id=575 lang=python3
#
# [575] 分糖果
#计算糖果的种类,如果糖果的种类比总糖果数/2还大,那就返回总糖果书/2
# 如果糖果的种类比总糖果数/2小,那么返回糖果的种类书

# @lc code=start
class Solution:
    def distributeCandies(self, candies: List[int]) -> int:
        # #太慢了, 其实就是算糖果的种类,
        # dic = {}
        # for i in candies:
        #     if i in dic:
        #         dic[i] += 1
        #     else :
        #         dic[i] = 1
        # max_kinds = len(dic)
        # num = len(candies)//2
        # if num >= max_kinds:
        #     return max_kinds
        # else:
        #     return num
        
        #用set计算糖果的种类书
        sis = set(candies)
        l_candies, l_sis = len(candies), len(sis)

        if(l_sis >= (l_candies // 2)):
            return (l_candies // 2)
        else:
            return l_sis
# @lc code=end

