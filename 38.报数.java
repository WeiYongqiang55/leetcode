/*
 * @Author: your name
 * @Date: 2019-12-09 17:24:38
 * @LastEditTime: 2019-12-09 17:50:27
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edittr = ""
 * @FilePath: \javad:\leetcode\38.报数.java
 */
/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 报数
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        String str = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder builder = new StringBuilder();
            char pre = str.charAt(0);
            int count = 1;
            for (int j = 1; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == pre) {
                    count++;
                } else {
                    builder.append(count).append(pre);
                    pre = c;
                    count = 1;
                }
            }
            builder.append(count).append(pre);
            str = builder.toString();
        }
        return str;
    }
    public static void main(String[] args) {
        Solution a  = new Solution();
        // int[] nums = {1,3,5,6};
        System.out.print(a.countAndSay(6));
    }
}
// @lc code=end

