/*
 * @Author: your name
 * @Date: 2019-12-10 19:30:55
 * @LastEditTime: 2019-12-10 19:43:56
 * @LastEditTime: 2019-12-10 19:42:43rs
 * @LastEditors: Please set LastEditors
 * @FilePath: \javad:\leetcode\66.加一.java
 */
/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i =digits.length-1;i>=0;i--){
            digits[i] += 1;
            digits[i] = digits[i] % 10;
            if(digits[i]!=0) {
                //应该结束了
                return digits;
            }
        }
        //遇到999这种了
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    public static void main(String[] args) {
        Solution a  =  new Solution();
        int[] digits = {1,2,3};
        System.out.print(a.plusOne(digits).toString());
    }
}
// @lc code=end

