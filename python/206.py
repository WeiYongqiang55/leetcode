# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
    

class Solution:
    def link_list(self,nums):
        nodes=[]
        for i in range(len(nums)):
            nodes.append(ListNode(nums[i]))
        for i in range(len(nums)-1):
            nodes[i].next=nodes[i+1]
        return nodes[0]

    def print_linklist(self,head):
        while head:
            print(str(head.val)+'->',end="")
            head= head.next
        print("None")
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        # prev = None
        # while head:
        #     curr = head
        #     head = head.next
        #     curr.next = prev
        #     prev = curr
        # return prev
        # my method 
        bef=None
        cur=head
        while cur:
            after=cur.next
            cur.next=bef
            bef=cur
            cur=after
        return bef


if  __name__ == "__main__":
    so = Solution()
    ln=so.link_list([1,2,3,4,5])
    so.print_linklist(ln)
    ln=so.reverseList(ln)
    so.print_linklist(ln)