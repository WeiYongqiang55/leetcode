/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 *
 * https://leetcode-cn.com/problems/add-strings/description/
 *
 * algorithms
 * Easy (49.74%)
 * Likes:    144
 * Dislikes: 0
 * Total Accepted:    27.5K
 * Total Submissions: 55.3K
 * Testcase Example:  '"0"\n"0"'
 *
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 * 
 * 注意：
 * 
 * 
 * num1 和num2 的长度都小于 5100.
 * num1 和num2 都只包含数字 0-9.
 * num1 和num2 都不包含任何前导零。
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
 * 
 * 
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuffer temp, res;
        if (num1.length() >= num2.length()) {
            temp = new StringBuffer(num1);
            res = new StringBuffer(num2);
        } else {
            res = new StringBuffer(num1);
            temp = new StringBuffer(num2);
        }
        int Acarry = 0;
        int tnum = 0;

        for (int tend = temp.length() - 1, rend = res.length() - 1; tend >= 0; rend--, tend--) {
            tnum = temp.charAt(tend) - '0';
            int rnum = rend >= 0 ? res.charAt(rend) - '0' : 0;

            int mmul = tnum + rnum + Acarry;
            Acarry = mmul / 10;

            temp.replace(tend, tend + 1, Integer.toString(mmul % 10));
        }
        if (Acarry !=0) {
            temp.insert(0, Integer.toString(Acarry));
        }
        System.out.println(temp.toString());
        return temp.toString();

    }

    public static void main(String[] args) {
        new Solution().addStrings("123", "999");
    }

}
// @lc code=end
