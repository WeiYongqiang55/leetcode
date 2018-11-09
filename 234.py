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
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        s=[]
        while head:
            s.append(head.val)
            head= head.next
        return s==s[::-1]
        


if __name__ == "__main__":
    so=Solution()
    head=so.link_list([-129,-129])
    so.print_linklist(head)
    print(so.isPalindrome(head))

        