import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成 ******** 经典题目**************8
 *
 * https://leetcode-cn.com/problems/generate-parentheses/description/
 *
 * algorithms
 * Medium (73.71%)
 * Likes:    818
 * Dislikes: 0
 * Total Accepted:    90.3K
 * Total Submissions: 122.5K
 * Testcase Example:  '3'
 *
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 * 
 * 例如，给出 n = 3，生成结果为：
 * 
 * [
 * ⁠ "((()))",
 * ⁠ "(()())",
 * ⁠ "(())()",
 * ⁠ "()(())",
 * ⁠ "()()()"
 * ]
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, String cur, int open, int close, int max){
        if (cur.length() == max * 2) {
            ans.add(cur);
            System.out.println(cur);
            return;
        }
// ((( 
        if (open < max)
            backtrack(ans, cur+"(", open+1, close, max);
        if (close < open)
            backtrack(ans, cur+")", open, close+1, max);
    }

    public static void main(String[] args) {
        new Solution().generateParenthesis(3);
    }
}


// @lc code=end

