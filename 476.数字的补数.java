/*
 * @lc app=leetcode.cn id=476 lang=java
 *
 * [476] 数字的补数
 *
 * https://leetcode-cn.com/problems/number-complement/description/
 *
 * algorithms
 * Easy (67.99%)
 * Likes:    138
 * Dislikes: 0
 * Total Accepted:    16.6K
 * Total Submissions: 24.4K
 * Testcase Example:  '5'
 *
 * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 * 
 * 注意:
 * 
 * 
 * 给定的整数保证在32位带符号整数的范围内。
 * 你可以假定二进制数不包含前导零位。
 * 
 * 
 * 示例 1:
 * 
 * 
 * 输入: 5
 * 输出: 2
 * 解释: 5的二进制表示为101（没有前导零位），其补数为010。所以你需要输出2。
 * 
 * 
 * 示例 2:
 * 
 * 
 * 输入: 1
 * 输出: 0
 * 解释: 1的二进制表示为1（没有前导零位），其补数为0。所以你需要输出0。
 * 
 * 
 */

// @lc code=start
class Solution {
    public static int findComplement(int num) {
        int tmp = num;
        int num2 = 1;
        while(tmp>0){
            num2<<=1;
            tmp>>=1;
        }
        num2-=1;
        return num^num2;
    }
    public static void main(String[] args) {
        findComplement(5);
    }
}
// @lc code=end

