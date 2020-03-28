import jdk.nashorn.internal.runtime.NumberToString;

/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 *
 * https://leetcode-cn.com/problems/zigzag-conversion/description/
 *
 * algorithms
 * Medium (46.40%)
 * Likes:    615
 * Dislikes: 0
 * Total Accepted:    110.6K
 * Total Submissions: 234.1K
 * Testcase Example:  '"PAYPALISHIRING"\n3'
 *
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * 
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 * 
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 
 * 
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 * 
 * 请你实现这个将字符串进行指定行数变换的函数：
 * 
 * string convert(string s, int numRows);
 * 
 * 示例 1:
 * 
 * 输入: s = "LEETCODEISHIRING", numRows = 3
 * 输出: "LCIRETOESIIGEDHN"
 * 
 * 
 * 示例 2:
 * 
 * 输入: s = "LEETCODEISHIRING", numRows = 4
 * 输出: "LDREOEIIECIHNTSG"
 * 解释:
 * 
 * L     D     R
 * E   O E   I I
 * E C   I H   N
 * T     S     G
 * 
 */

// @lc code=start
class Solution {
    public static String convert(String s, int numRows) {
        int length  = s.length();
        int step = 2*numRows-2;

        if(step<=0){
            return s;
        }
        
        char[] cs = s.toCharArray();
        StringBuffer[] res = new StringBuffer[numRows];
        for(int i=0;i<numRows;i++){
            res[i] = new StringBuffer();
        }
        for(int i=0;i<length;i++){
            int row = i%step;
            if(row<numRows){
                res[row].append(cs[i]);
            }else{
                //斜着的字母 numRows==4
                // 0->0 1->1 2->2 3->3 4-> 2  5->1 
                int a = row%numRows +1;//5->2
                row = numRows-1-a;//4-1-2
                res[row].append(cs[i]);
            }
        }
        StringBuilder result= new StringBuilder();
        for(int i=0;i<numRows;i++){
            result.append(res[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String result = convert("LEETCODEISHIRING", 4);
        System.out.println(result);
    }
}
// @lc code=end

