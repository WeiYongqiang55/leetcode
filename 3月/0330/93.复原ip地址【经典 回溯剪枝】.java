import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=93 lang=java
 *
 * [93] 复原IP地址
 *
 * https://leetcode-cn.com/problems/restore-ip-addresses/description/
 *
 * algorithms
 * Medium (46.18%)
 * Likes:    217
 * Dislikes: 0
 * Total Accepted:    33.1K
 * Total Submissions: 71.6K
 * Testcase Example:  '"25525511135"'
 *
 * 给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。
 * 
 * 示例:
 * 
 * 输入: "25525511135"
 * 输出: ["255.255.11.135", "255.255.111.35"]
 *  111111 
 *  1.11.11.1
 *  1.1.11.11
 *  11.1.1.11
 *  11.11.1.1
 */

// @lc code=start
// class Solution { beat  97.5%
//     public List<String> restoreIpAddresses(String s) {
//         List<String> result = new ArrayList<>();

        
//         for (int a = 1; a < 4; a++) {
//             for (int b = 1; b < 4; b++) {
//                 for (int c = 1; c < 4; c++) {
//                     for (int d = 1; d < 4; d++) {
//                         /*
//                          * 1、保障下面subString不会越界
//                          * 2、保障截取的字符串与输入字符串长度相同
//                          * //1、2比较好理解，3比较有意思
//                          * 3、不能保障截取的字符串转成int后与输入字符串长度相同
//                          * 如：字符串010010，a=1，b=1，c=1，d=3，对应字符串0，1，0，010
//                          * 转成int后seg1=0，seg2=1，seg3=0，seg4=10
//                          * //所以需要下面这处判断if (ip.length() == s.length() + 3)
//                          */
//                         if (a + b + c + d == s.length()) {
//                             int seg1 = Integer.parseInt(s.substring(0, a));
//                             int seg2 = Integer.parseInt(s.substring(a, a + b));
//                             int seg3 = Integer.parseInt(s.substring(a + b, a + b + c));
//                             int seg4 = Integer.parseInt(s.substring(a + b + c, a + b + c + d));
//                             // 四个段数值满足0~255
//                             StringBuilder ip = new StringBuilder();
//                             if (seg1 <= 255 && seg2 <= 255 && seg3 <= 255 && seg4 <= 255) {
//                                 ip.append(seg1).append(".").append(seg2).append(".").
//                                         append(seg3).append(".").append(seg4);
//                                 // 保障截取的字符串转成int后与输入字符串长度相同
//                                 if (ip.length() == s.length() + 3) {
//                                     result.add(ip.toString());
//                                 }
                                
                                
//                             }
//                         }
//                     }
//                 }
//             }
//         }
//         return result;
//     }
// }
class Solution {//beat 100%
    List<String> result = new ArrayList<>();
    char[] currentResult;
    public List<String> restoreIpAddresses(String s) {
        currentResult = new char[s.length() + 3];
        backtrace(s, 0, 0);
        return result;
    }

    private void backtrace(String s, int part, int startPos) {
        // 数字的位数不对，如果剩下part不够一位 ，或者超过3*剩下的part了,剪枝
        if (s.length() - startPos < (4 - part) * 1 || 
            s.length() - startPos > (4 - part) * 3) {
            return;
        }

        if (part == 4) {
            result.add(new String(currentResult));
            return;
        }

        if (part != 0) {
            currentResult[startPos + part - 1] = '.';// part-1是.的计数
        }
        
        // this part has 1 digit
        char first = s.charAt(startPos);
        currentResult[startPos + part] = first;
        backtrace(s, part + 1, startPos + 1);

        // this part has 2 digit   选择2位数字
        // 因为前一位如果是0，那么比如01 这样的话浪费了一位0 ，所以剪纸
        if (first == '0') {
            return;
        }
        if (startPos + 1 >= s.length()) return; 
        char second = s.charAt(startPos + 1);
        currentResult[startPos + part + 1] = second;
        backtrace(s, part + 1, startPos + 2);

        // this part has 3 digit选择3位数字
        if (startPos + 2 >= s.length()) return; 
        char third = s.charAt(startPos + 2);
        currentResult[startPos + part + 2] = third;
        if (first == '1') {
            backtrace(s, part + 1, startPos + 3);//1XX 肯定没问题
        } else if (first == '2') {//2XX 可能会出现 大于255的
            if (second < '5') {//24x
                backtrace(s, part + 1, startPos + 3);
            } else if (second == '5' && third <= '5') {//25x
                backtrace(s, part + 1, startPos + 3);
            }
        }
    }
}
// @lc code=end

