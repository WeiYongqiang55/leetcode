/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 *
 * https://leetcode-cn.com/problems/add-strings/description/
 *
 * algorithms
 * Easy (49.01%)
 * Likes:    126
 * Dislikes: 0
 * Total Accepted:    21.6K
 * Total Submissions: 44.1K
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
    public static String addStrings(String num1, String num2) {

        int len1 = num1.length();
        int len2 = num2.length();

        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();
        String res = "";
        int CARRY=0;//进位
        for(int i=0;i<Math.min(len1,len2);i++){
            int t1 = c1[len1-1-i]-'0';
            int t2= c2[len2-1-i]-'0';
            int ans = t1+t2+CARRY;
            res=(ans%10)+res;
            CARRY = ans/10;
        }
        if(len1==len2){
           
        }else if(len1>len2){
            for(int i=0;i<len1-len2;i++){
                int t1 = c1[len1-1-len2-i]-'0';
                int ans = t1+CARRY;
                res= (ans%10)+res;
                CARRY = ans/10;
            }
        }else{
            for(int i=0;i<len2-len1;i++){
                int t2 = c2[len2-1-len1-i]-'0';
                int ans = t2+CARRY;
                res= (ans%10)+res;
                CARRY = ans/10;
            }
        }
        if(CARRY!=0){
            res= "1"+res;
        }
        return res;
    }

    public static void main(String[] args) {
        String res = addStrings("1", "9");
        System.out.println(res);
    }
}
// @lc code=end

