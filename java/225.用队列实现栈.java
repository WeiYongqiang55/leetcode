import java.util.LinkedList;
import java.util.Queue;

/*
 * @Author: your name
 * @Date: 2019-12-12 20:50:50
 * @LastEditTime: 2019-12-12 21:13:02
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\225.用队列实现栈.java
 */
/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈 用两个队列完成操作
 */

// @lc code=start
class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int top;
    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        top = x;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(q1.size()>1){
            top = q1.remove();
            q2.add(top);
        }
        
        Queue<Integer> temp = q1;
        q1=q2;
        q2= temp;
        return q2.remove();
    }
    
    /** Get the top element. */
    public int top() {
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(q1.size()>0){
            return false;
        }else{
            return true;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

