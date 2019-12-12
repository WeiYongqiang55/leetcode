import java.util.Set;
import java.util.TreeSet;



/*
 * @Author: your name
 * @Date: 2019-12-12 16:22:15
 * @LastEditTime: 2019-12-12 17:16:11
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\202.快乐数.java
 */
/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数 我使用了三种方法，分别是集合法，快慢指针法，以及一种奇怪的技巧，
 * 结果显示，快慢指针是最快的。集合法是最慢的
 */

// @lc code=start
class Solution {
    // public boolean isHappy(int n) {
        //beats 78%
    //     while(true){
    //         int sum= 0;
    //         String s = Integer.toString(n);
    //         for (int i =0;i<s.length();i++){
    //             sum += Math.pow((int)(s.charAt(i)-'0'),2);
    //         }  
    //         n = sum;
    //         if(n ==4){
    //             return false;
    //         }
    //         if(n==1){
    //             return true;
    //         }
    //     }
    // }
    public int bitSum(int n){
        int sum =0;
        while(n>0){
            sum += Math.pow((n%10),2);
            n /= 10;
        }
        return sum;
    }
    // public boolean isHappy(int n){
    //     //快慢指针可以解决循环的问题 beats 100%  最快
    //     int slow=n;
    //     int fast = bitSum(n);
    //     while(slow!=fast){
    //         slow = bitSum(slow);
    //         fast = bitSum(fast);
    //         fast = bitSum(fast);
    //     }
    //     //如果等于1，说明，是快乐数，如果不是说明有循环
    //     return slow ==1;
    // }
    public boolean isHappy(int n){
        //使用集合 beats 27%  最慢
        Set<Integer> set = new TreeSet<Integer>();
        while(true){
            n = bitSum(n);
            if(n==1){
                return true;
            }
            if(set.contains(n)){
               //重复
               return false; 
            }else{
                set.add(n);
            }
        }
    }
    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.isHappy(19));

    }
}
// @lc code=end

