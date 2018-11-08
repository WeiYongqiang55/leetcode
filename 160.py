# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        curA=headA
        curB = headB
        lenA=1
        lenB=1
        while curA.next:
            lenA+=1
            curA=curA.next
        while curB.next:
            lenB+=1
            curB=curB.next
        curA=headA
        curB = headB
        if lenA >lenB:
            for i in range(lenA-lenB):
                curA=curA.next
        if lenB>=lenA:
            for i in range(lenB-lenA):
                curB=curB.next
        while curA is not curB:
            curA=curA.next
            curB=curB.next
        return curA

        
        