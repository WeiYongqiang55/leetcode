'''
@Author: your name
@Date: 2019-11-27 21:43:27
@LastEditTime: 2019-11-27 22:23:02
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\155.最小栈.py
'''
#
# @lc app=leetcode.cn id=155 lang=python3
#
# [155] 最小栈
#

# @lc code=start
import sys
class MinStack:
    
    def __init__(self):
        """
        initialize your data structure here.
        """
        self.min_num= sys.maxsize
        self.stack=[]
        self.length=0

    def push(self, x: int) -> None:
        self.stack.append(x)
        self.length += 1
        if x < self.min_num:
            self.min_num = x

    def pop(self) -> None:
        if self.length >0:
            top = self.stack[self.length-1]
            self.stack= self.stack[:self.length-1]
            self.length -= 1
            if self.length >0 and top == self.min_num :
                self.min_num = min(self.stack)
            if not self.length :
                self.min_num= sys.maxsize
            # print(top)
            return top
        else:
            return None

    def top(self) -> int:
        if self.length > 0:
            top = self.stack[self.length-1]
            # print(top)
            return top
        else:
            return None

    def getMin(self) -> int:
        # print(self.min_num)
        return self.min_num


# # Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(2147483646)
# obj.push(2147483646)
# obj.push(2147483647)
# obj.top()
# obj.pop()
# obj.getMin()
# obj.pop()
# obj.getMin()
# obj.pop()
# obj.push(2147483647)
# obj.top()
# obj.getMin()# 出错了
# obj.push(-2147483648)
# obj.top()
# obj.getMin()
# obj.pop()
# obj.getMin()
# @lc code=end
