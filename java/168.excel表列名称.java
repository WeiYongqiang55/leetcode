/*
 * @Author: your name
 * @Date: 2019-12-12 14:31:02
 * @LastEditTime: 2019-12-12 14:50:45
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\168.excel表列名称.java
 */
/*
 * @lc app=leetcode.cn id=168 lang=java
 *
 * [168] Excel表列名称
 */

// @lc code=start
class Solution {
    public String convertToTitle(int n) {
        StringBuilder res = new StringBuilder();
        while(n>0){
            int ge = n%26;
            if(ge ==0){
                ge = 26;
                n = n-1;
            }
            char s2 = (char)('A' + ge-1);//为了解决26这个数字
            res.insert(0, s2);
            n = (int)n/26;
        }
        return res.toString();
    }
}
// @lc code=end

