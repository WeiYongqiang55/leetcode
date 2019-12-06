'''
@Author: your name
@Date: 2019-11-30 22:04:38
@LastEditTime: 2019-12-01 13:41:40
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\15.三数之和.py
'''
#
# @lc app=leetcode.cn id=15 lang=python3
#
# [15] 三数之和
#首先对数组进行排序，然后固定第一个数，然后使用前后指针，一个在头，一个在尾，
# 对剩下的数字进行尝试，如果加起来是0，保存，如果大于0，尾指针向前移，
# 如果小于0，头指针向后移

# @lc code=start
class Solution:
    def threeSum(self, nums):
        nums.sort() #排序
        length = len(nums)
        res = []
        for i in range(length):
            if nums[i] > 0:
                break
            if i >0 and nums[i] == nums[i-1]:
                continue
            L = i + 1
            R = length -1
            while L < R:
                sum  = nums[i] + nums[L] + nums[R] 
                if  sum == 0:
                    res.append([nums[i],nums[L],nums[R]])
                    while L < R and nums[L]  == nums[L+1]:
                        L += 1
                    while L < R and nums[R] == nums[R-1]:
                        R -= 1
                    L += 1
                    R -= 1
                elif sum > 0:
                    R -= 1
                elif sum < 0:
                    L += 1
        return res

a = Solution()
print(a.threeSum([-1, 0, 1, 2, -1, -4]))
# @lc code=end

