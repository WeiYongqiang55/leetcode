/*
 * @Author: your name
 * @Date: 2019-12-06 21:57:05
 * @LastEditTime: 2019-12-06 22:59:08
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \javad:\leetcode\91.解码方法.java
 */
/*
 * @lc app=leetcode.cn id=91 lang=java
 *
 * [91] 解码方法
 * 动态规划
 */

// @lc code=start
class Solution {
    public int numDecodings(String s) {
        int len = s.length();
        int[] dp = new int[len+1];
        dp[len] = 1;
        if(s.charAt(len-1)=='0'){
            dp[len-1]=0;
        }
        else{
            dp[len-1]=1;
        }
        for (int i=len-2;i>=0;i--){
            if(s.charAt(i)=='0'){
                dp[i]=0;
            }
            else{
                if((s.charAt(i)-'0')*10 + (s.charAt(i+1)-'0') <=26){
                    dp[i] = dp[i+1] +dp[i+2];
                }else{
                    dp[i] = dp[i+1];
                }
            }
        }
        return dp[0];
        
    }
}
// @lc code=end

