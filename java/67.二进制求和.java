/*
 * @Author: your name
 * @Date: 2019-12-10 19:44:31
 * @LastEditTime: 2019-12-10 20:03:29
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * 
 * @FilePath: \javad:\leetcode\67.二进制求和.java
 */
/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        for(int i = a.length()-1,j = b.length()-1;i>=0 || j>=0;i--,j--){
            // int sum = a.charAt(i)-'0' + b.charAt(j)-'0' + carry;
            int sum=0;
            sum += i>=0 ?a.charAt(i)-'0' : 0;
            sum += j>=0 ?b.charAt(j)-'0' : 0;
            sum += carry;
            carry = (int)sum/2;//进位
            sum = sum %2;//余数
            res.append(sum);
        }
        if(carry == 1){
            res.append(1);
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.addBinary("1010", "1011"));
    }
}
// @lc code=end

