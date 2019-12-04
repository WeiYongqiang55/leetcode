'''
@Author: your name
@Date: 2019-12-04 22:06:29
@LastEditTime: 2019-12-04 22:33:14
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\56.合并区间.py
'''
#
# @lc app=leetcode.cn id=56 lang=python3
#
# [56] 合并区间
#

# @lc code=start
class Solution:
    def merge(self, intervals):
        #先排序
        if len(intervals)<2:
            return intervals
        intervals.sort(key = lambda x:x[0])
        
        res = [intervals[0]]
        i=1
        while i<len(intervals):
            if intervals[i][0] <= res[-1][1]:
                res[-1][1] = max(intervals[i][1],res[-1][1])
            else:
                res.append(intervals[i])
            i+=1
        return res
        
        
a = Solution()
print(a.merge([[1,3],[2,6],[8,10],[15,18]]))
# @lc code=end

