'''
@Author: your name
@Date: 2019-12-04 19:28:22
@LastEditTime: 2019-12-04 20:04:12
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\49.字母异位词分组.py
'''
#
# @lc app=leetcode.cn id=49 lang=python3
#
# [49] 字母异位词分组
# 阶梯思路1：便利，生成排序后的字典，如果不在字典中就加入字典中，如果字典中就直接
# 添加到对应的list 中去
# 题解思路2：按计数分类，当字符计数相同时，满足条件

# @lc code=start
class Solution:
    def groupAnagrams(self, strs):
        #题解1
        # dic = {}
        # ans = []
        # count = 0
        # for i in range(len(strs)):
        #     a = strs[i]
        #     temp = ''.join(sorted(a))
        #     if temp not in dic:
        #         dic[temp] =  count
        #         count += 1
        #         ans.append([a])
        #     else:
        #         ans[dic[temp]].append(a)
        # return ans
        # 题解1第二种写法
        # import collections
        # ans  = collections.defaultdict(list)
        # for s in strs:
        #     ans[tuple(sorted(s))].append(s)
        # return ans.values()
        #题解1第三种写法
        # dic = {}
        # for s in strs:
        #     dic[tuple(sorted(s))] = dic.get(tuple(sorted(s)), []) + [s]
        # return dic.values()

        #题解2
        import collections
        ans = collections.defaultdict(list)
        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord('a')] += 1
            ans[tuple(count)].append(s)
        return ans.values()

a = Solution()
print(a.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"],))
# @lc code=end

