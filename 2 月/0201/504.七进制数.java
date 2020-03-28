/*
 * @lc app=leetcode.cn id=504 lang=java
 *
 * [504] 七进制数
 *
 * https://leetcode-cn.com/problems/base-7/description/
 *
 * algorithms
 * Easy (47.94%)
 * Likes:    31
 * Dislikes: 0
 * Total Accepted:    8.3K
 * Total Submissions: 17.4K
 * Testcase Example:  '100'
 *
 * 给定一个整数，将其转化为7进制，并以字符串形式输出。
 * 
 * 示例 1:
 * 
 * 
 * 输入: 100
 * 输出: "202"
 * 
 * 
 * 示例 2:
 * 
 * 
 * 输入: -7
 * 输出: "-10"
 * 
 * 
 * 注意: 输入范围是 [-1e7, 1e7] 。
 * 
 */

// @lc code=start
class Solution {
    public String convertToBase7(int num) {
        String res ="";
        if(num<0){
            num*= -1;
            res+="-";
        }
        StringBuilder sb = new StringBuilder();
        do{
            int mod = num %7;
            sb.append((char)('0'+mod));
            num = num/7;
        }while(num>0);
        res += sb.reverse().toString();
        return res;
    }

}
// @lc code=end

