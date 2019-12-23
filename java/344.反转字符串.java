/*
 * @Author: your name
 * @Date: 2019-12-14 13:44:49
 * @LastEditTime: 2019-12-14 13:47:38
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\344.反转字符串.java
 */
/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        int j=s.length-1;
        for(int i=0;i<s.length/2;i++){
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            j--;
        }


    }
}
// @lc code=end

