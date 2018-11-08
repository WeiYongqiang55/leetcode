class MinStack(object):
    def __init__(self):
        self.stack=[]

    def push(self, x):
        """
        :type x: int
        :rtype: void
        """
        pre_min = 2147483647 if len(self.stack) ==0 else self.stack[-1][1]
        cur_min = min(x,pre_min)
        self.stack.append((x,cur_min))

    def pop(self):
        """
        :rtype: void
        """
        self.stack.pop()

    def top(self):
        """
        :rtype: int
        """
        if self.stack.__len__()!=0:
            return self.stack[-1][0]
        else:
            return []

    def getMin(self):
        """
        :rtype: int
        """
        return self.stack[-1][1]


# Your MinStack object will be instantiated and called as such:
if __name__ == "__main__":
    obj = MinStack()
    obj.push(-2)
    obj.push(0)
    obj.push(-3)
    minnum=obj.getMin()
    obj.pop()
    minnum=obj.top()
    minnum=obj.getMin()
