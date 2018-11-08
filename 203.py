# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def removeElements(self, head, val):
        """
        :type head: ListNode
        :type val: int
        :rtype: ListNode
        """
        out = prev = ListNode(-1)
        prev.next = head 
        curr =head 
        while curr:
            if curr.val == val:
                prev.next = curr.next
            else:
                prev = prev.next
            curr = curr.next
        return out.next
            

if __name__ == "__main__":
    so=Solution()
    n1=ListNode(1)
    n2=ListNode(2)
    n3=ListNode(6)
    n4=ListNode(3)
    n5=ListNode(4)
    n6=ListNode(5)
    n7=ListNode(6)
    n1.next=n2
    n2.next=n3
    n3.next=n4
    n4.next=n5
    n5.next=n6
    n6.next=n7
    result=so.removeElements(n1,6)
    while result:
        print(result.val)
        result=result.next

        
        