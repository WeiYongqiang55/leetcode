'''
@Author: weiyq
@Date: 2019-11-27 20:43:25
@LastEditTime: 2019-11-27 21:31:59
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\125.验证回文串.py
'''



#
# @lc app=leetcode.cn id=125 lang=python3
#
# [125] 验证回文串
#

# @lc code=start
class Solution:
    def isPalindrome(self, s):
        '''
        @description: 先处理成全大写，然后前后两个指针同时移动
        @param {type} 
        @return: 
        '''        
        start = 0
        end = len(s)-1
        s = s.upper()
        while start <=  end:
            if not s[start].isdigit() and not  s[start].isalpha():
                start += 1
            else:
                if  not s[end].isdigit() and not  s[end].isalpha():
                    end -= 1
                else:
                    if s[start] == s[end]:
                        start += 1
                        end   -= 1
                    else:
                        return False
        return True
        

a= Solution()
print(a.isPalindrome("A man, a plan, a canal: Panama"))
# @lc code=end

