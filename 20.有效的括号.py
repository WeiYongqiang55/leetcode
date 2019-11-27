'''
@Author: your name
@Date: 2019-11-27 10:25:23
@LastEditTime: 2019-11-27 10:35:44
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\20.有效的括号.py
'''
#
# @lc app=leetcode.cn id=20 lang=python3
#
# [20] 有效的括号
#

# @lc code=start
class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        map = {
        "{":"}",
        "[":"]",
        "(":")"
        }
        for x in s:
            if x in map:#是左括号
                stack.append(map[x]) #把对应的右括号加入到stack
            else:#是右括号
                if len(stack)!=0:
                    top_element = stack.pop()
                    if x != top_element:
                        return False
                    else:
                        continue
                else:
                    return False
        return len(stack) == 0
# @lc code=end

