/*
 * @Author: your name
 * @Date: 2020-01-29 14:38:47
 * @LastEditTime : 2020-01-29 15:02:19
 * @LastEditors  : Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: /leetcode/405.数字转换为十六进制数.java
 */
/*
 * @lc app=leetcode.cn id=405 lang=java
 *
 * [405] 数字转换为十六进制数
 *
 * https://leetcode-cn.com/problems/convert-a-number-to-hexadecimal/description/
 *
 * algorithms
 * Easy (48.75%)
 * Likes:    50
 * Dislikes: 0
 * Total Accepted:    7.8K
 * Total Submissions: 15.7K
 * Testcase Example:  '26'
 *
 * 给定一个整数，编写一个算法将这个数转换为十六进制数。对于负整数，我们通常使用 补码运算 方法。
 * 
 * 注意:
 * 
 * 
 * 十六进制中所有字母(a-f)都必须是小写。
 * 
 * 十六进制字符串中不能包含多余的前导零。如果要转化的数为0，那么以单个字符'0'来表示；对于其他情况，十六进制字符串中的第一个字符将不会是0字符。 
 * 给定的数确保在32位有符号整数范围内。
 * 不能使用任何由库提供的将数字直接转换或格式化为十六进制的方法。
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入:
 * 26
 * 
 * 输出:
 * "1a"
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入:
 * -1
 * 
 * 输出:
 * "ffffffff"
 * 
 * 
 */

// @lc code=start
class Solution {
    public static String toHex(int num) {
        char[] hex = "0123456789abcdef".toCharArray();
        String s = new String();
        while (num != 0) {
            // 获得末尾4位数
            int end = num & 15;
            // 转换成十六进制string
            s = hex[end] + s;
            // 无符号右移4位 ，
            num >>>= 4;
        }
        if (s.length() == 0) {
            s = "0";
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(toHex(26));
    }
}
// @lc code=end
