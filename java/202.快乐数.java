/*
 * @Author: your name
 * @Date: 2019-12-12 16:22:15
 * @LastEditTime: 2019-12-12 16:46:26
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\202.快乐数.java
 */
/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        while(true){
        int sum= 0;
        String s = Integer.toString(n);
         for (int i =0;i<s.length();i++){
            sum += Math.pow((int)(s.charAt(i)-'0'),2);
         }  
         n = sum;
         if(n ==4){
             return false;
         }
         if(n==1){
             return true;
         }
        }
    }
    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.isHappy(19));

    }
}
// @lc code=end

