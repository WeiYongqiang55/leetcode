
/*
 * @Author: your name
 * @Date: 2019-12-09 15:31:23
 * @LastEditTime: 2019-12-09 15:43:10
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings E
 * @FilePath: \javad:\leetcode\9.回文数.java
 */
/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String s1 = Integer.toString(x);
        String j = new StringBuilder(s1).reverse().toString();
        if(s1.equals(j)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.print(a.isPalindrome(121));
    }
}
// @lc code=end

