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
    def get_by_val(self,head,num):
        while head:
            if head.val==num:
                return head
            else:
                head=head.next
        return None
    def print_linklist(self,head):
        while head:
            print(str(head.val)+'->',end="")
            head= head.next
        print("None")
    def deleteNode(self,node):
        """
        :type node: ListNode
        :rtype: void Do not return anything, modify node in-place instead.
        """
        # num= node.val
        # Head=before.next=curr= head
        # while curr:
        #     if curr.val==num:
        #         before.next = curr.next
        #         break
        #     else:
        #         before = curr
        #         curr=curr.next
        # return Head
        node.val = node.next.val
        node.next = node.next.next

if __name__ == "__main__":
    so=Solution()
    head=so.link_list([4,5,1,9])
    so.print_linklist(head)
    node = so.get_by_val(head,5)
    if node:
        so.deleteNode(node)
    so.print_linklist(head)