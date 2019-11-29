'''
@Author: your name
@Date: 2019-11-28 21:02:47
@LastEditTime: 2019-11-28 21:16:26
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\232.用栈实现队列.py
'''
#
# @lc app=leetcode.cn id=232 lang=python3
#
# [232] 用栈实现队列
#

# @lc code=start
class MyQueue:
    
   
    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.stack= []
        self.size = 0

    def push(self, x: int) -> None:
        """
        Push element x to the back of queue.
        """
        self.stack.append(x)
        self.size += 1
        

    def pop(self) -> int:
        """
        Removes the element from in front of queue and returns that element.
        """
        top = self.stack[0]
        self.stack = self.stack[1:]
        self.size -= 1
        return top

    def peek(self) -> int:
        """
        Get the front element.
        """
        return self.stack[0]

    def empty(self) -> bool:
        """
        Returns whether the queue is empty.
        """
        return self.size==0


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()
# @lc code=end

