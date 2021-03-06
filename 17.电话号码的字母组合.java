import java.util.ArrayList;
import java.util.List;


/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 *
 * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/description/
 *
 * algorithms
 * Medium (53.01%)
 * Likes:    632
 * Dislikes: 0
 * Total Accepted:    93.9K
 * Total Submissions: 177.1K
 * Testcase Example:  '"23"'
 *
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * 
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * 
 * 
 * 
 * 示例:
 * 
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 
 * 
 * 说明:
 * 尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。
 * 
 */

// @lc code=start
class Solution {
     List<String> res = new ArrayList<String>();
     String[] map = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public  List<String> letterCombinations(String digits) {
        // 回溯 递归
        if(digits.length()==0 || digits==null){
            return res;
        }
        digui(digits.toCharArray(), 0, "");
        return res;
    }

    public  void digui(char[] cdigits, int index, String temp) {
        if (index == cdigits.length) {
            res.add(temp);
        } else {
            String s = map[cdigits[index] - '0'];
            for (int i = 0; i < s.length(); i++) {
                digui(cdigits, index + 1, temp + s.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        Solution a = new Solution();
        List<String> res = a.letterCombinations("222");
        System.out.println(res);
    }

}
// @lc code=end

