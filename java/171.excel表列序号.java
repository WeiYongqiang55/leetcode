/*
 * @Author: your name
 * @Date: 2019-12-12 14:50:49
 * @LastEditTime: 2019-12-12 14:55:39
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edits.l
 * @FilePath: \leetcode\171.excel表列序号.java
 */
/*
 * @lc app=leetcode.cn id=171 lang=java
 *
 * [171] Excel表列序号
 */

// @lc code=start
class Solution {
    public int titleToNumber(String s) {
        int length = s.length();
        int res = 0;
        for(int i=0;i<length;i++){
            res += (int)(s.charAt(i)-'A'+1) *Math.pow(26, length-i-1);
        }
        return res;
    }
}
// @lc code=end

