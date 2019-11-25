'''
@Author: your name
@Date: 2019-11-25 20:15:51
@LastEditTime: 2019-11-25 22:40:43
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\567.字符串的排列.py
'''
#
# @lc app=leetcode.cn id=567 lang=python3
#
# [567] 字符串的排列
#
# 输入: s1 = "ab" s2 = "eidbaooo"
# 输出: True
# 解释: s2 包含 s1 的排列之一 ("ba").
# 【注意】ab需要连接在一起的，中间不能断开 
# 【注意】超长s1 和s2 会导致超时 
# 采用list存储s1和s2中长度为len(s1)的字符的个数
# 因为s1map 和s2map的长度都是len(s1)，所以当他们两个的字母分布一样的时候，
# 那就说明这两个字符串是同一组字符的排列组合，使用字符串可以减少运行时间
# @lc code=start
class Solution:
    def checkInclusion(self,s1, s2):
        def matches(s1map,s2map):
            for  i in range(26):
                if s1map[i] != s2map[i]:
                    return False
            return True
            
        if  len(s1) > len(s2):
            return False
        s1map=[]
        s2map=[]    
        for i in range(26):
            s1map.append(0)
            s2map.append(0)
        # s1map=[0*26]
        # print('s1map',s1map)
        # s2map=[0*26]
        for i in range(len(s1)):
            s1map[ord(s1[i])-ord('a')] += 1
            s2map[ord(s2[i])-ord('a')] += 1

        for i in range(len(s2)-len(s1)):
            if matches(s1map,s2map):
                return True 
            s2map[ord(s2[i+len(s1)]) - ord('a')] += 1 #窗口向右移动，新进来的字符
            s2map[ord(s2[i]) - ord('a')] -= 1  #左边的字符滑出窗口外面了
        return matches(s1map,s2map)
        
# a = Solution()
# print(a.checkInclusion("adc",
# "dcda"))
# @lc code=end

