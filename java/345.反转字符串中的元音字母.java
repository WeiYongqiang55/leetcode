
/*
 * @Author: your name
 * @Date: 2020-01-26 14:24:33
 * @LastEditTime : 2020-01-26 15:44:22
 * @LastEditors  : Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: /leetcode/345.反转字符串中的元音字母.java
 */
import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 *
 * https://leetcode-cn.com/problems/reverse-vowels-of-a-string/description/
 *
 * algorithms
 * Easy (48.39%)
 * Likes:    71
 * Dislikes: 0
 * Total Accepted:    22.3K
 * Total Submissions: 45.8K
 * Testcase Example:  '"hello"'
 *
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * 
 * 示例 1:
 * 
 * 输入: "hello"
 * 输出: "holle"
 * 
 * 
 * 示例 2:
 * 
 * 输入: "leetcode"
 * 输出: "leotcede"
 * 
 * 说明:
 * 元音字母不包含字母"y"。
 * 
 */

// @lc code=start
class Solution {
    public static String reverseVowels(String s) {
        char[] cs = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        List<Character> vowels = new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        while (start < end) {
            if (vowels.contains(cs[start])) {
                while (start < end && !vowels.contains(cs[end])) {
                    end--;
                }
                char temp = cs[start];
                cs[start] = cs[end];
                cs[end] = temp;
                start++;
                end--;
            } else {
                start++;
            }
        }
        String result = String.valueOf(cs);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
// @lc code=end
