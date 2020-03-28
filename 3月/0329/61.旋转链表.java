import javax.sound.sampled.SourceDataLine;

/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
 *
 * https://leetcode-cn.com/problems/rotate-list/description/
 *
 * algorithms
 * Medium (39.99%)
 * Likes:    225
 * Dislikes: 0
 * Total Accepted:    51.3K
 * Total Submissions: 128.2K
 * Testcase Example:  '[1,2,3,4,5]\n2'
 *
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 * 
 * 示例 1:
 * 
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 * 
 * 
 * 示例 2:
 * 
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步: 0->1->2->NULL
 * 向右旋转 4 步: 2->0->1->NULL
 * 
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */


class Solution {
    // class ListNode {
    // int val;
    // ListNode next;

    // ListNode(int x) {
    //     val = x;
    // }
// }
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0){
            return head;
        }
        if(head==null){
            return null;
        }
        int length=0;
        ListNode p=head,head0,pred,cur;
        while(p!=null){
            length++;
            p=p.next;
        }
        k = k%length;
        if(k==0){//不变
            return head;
        }
        cur=head;pred=null;
        for(int i=0;i<length-k;i++){
            
            pred=cur;
            cur=cur.next;
        }
        head0=cur;//新的头结点
        pred.next=null;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=head;
        return head0;
    }
    public void printListNode(ListNode head){
        while(head!= null){
            System.out.println(head.val);
            head=head.next;
        }
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        l1.next.next.next.next.next=null;
        ListNode res = new Solution().rotateRight(l1, 2);
        new Solution().printListNode(res);
    }

}
// @lc code=end
