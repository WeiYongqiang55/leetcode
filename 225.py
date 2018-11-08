import collections
class MyStack:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self._queue = collections.deque()
              

    def push(self, x):
        """
        Push element x onto stack.
        :type x: int
        :rtype: void
        """
        q = self._queue
        q.append(x)
        # for _ in range(len(q)-1):
        #     q.append(q.popleft())

    def pop(self):
        """
        Removes the element on top of the stack and returns that element.
        :rtype: int
        """
        return self._queue.pop()

    def top(self):
        """
        Get the top element.
        :rtype: int
        """
        return self._queue[len(self._queue)-1]
        

    def empty(self):
        """
        Returns whether the stack is empty.
        :rtype: bool
        """
        return not len(self._queue)


if __name__ == "__main__":    
    obj = MyStack()
    obj.push(6)
    obj.push(7)
    obj.push(8)
    print(obj.pop())
    print(obj.top())
    print(obj.empty())