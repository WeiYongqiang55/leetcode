import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=140 lang=java
 *
 * [140] 单词拆分 II
 *
 * https://leetcode-cn.com/problems/word-break-ii/description/
 *
 * algorithms
 * Hard (37.67%)
 * Likes:    140
 * Dislikes: 0
 * Total Accepted:    13.2K
 * Total Submissions: 35K
 * Testcase Example:  '"catsanddog"\n["cat","cats","and","sand","dog"]'
 *
 * 给定一个非空字符串 s 和一个包含非空单词列表的字典
 * wordDict，在字符串中增加空格来构建一个句子，使得句子中所有的单词都在词典中。返回所有这些可能的句子。
 * 
 * 说明：
 * 
 * 
 * 分隔时可以重复使用字典中的单词。
 * 你可以假设字典中没有重复的单词。
 * 
 * 
 * 示例 1：
 * 
 * 输入:
 * s = "catsanddog"
 * wordDict = ["cat", "cats", "and", "sand", "dog"]
 * 输出:
 * [
 * "cats and dog",
 * "cat sand dog"
 * ]
 * 
 * 
 * 示例 2：
 * 
 * 输入:
 * s = "pineapplepenapple"
 * wordDict = ["apple", "pen", "applepen", "pine", "pineapple"]
 * 输出:
 * [
 * "pine apple pen apple",
 * "pineapple pen apple",
 * "pine applepen apple"
 * ]
 * 解释: 注意你可以重复使用字典中的单词。
 * 
 * 
 * 示例 3：
 * 
 * 输入:
 * s = "catsandog"
 * wordDict = ["cats", "dog", "sand", "and", "cat"]
 * 输出:
 * []
 * 
 * 
 */

// @lc code=start
class Solution {

    HashMap<Integer, List<String>> map = new HashMap<>();

    public List<String> wordBreak(String s, List<String> wordDict) {

        return word_Break(s, new HashSet<>(wordDict), 0);
    }

    public List<String> word_Break(String s, Set<String> wordDict, int start) {

        if (map.containsKey(start)) {
            return map.get(start);
        }

        LinkedList<String> res = new LinkedList<>();
        if (start == s.length()) {
            res.add("");
        }
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end))) {
                //获取剩下的字符串的可能的组成结果
                List<String> list = word_Break(s, wordDict, end);
                for (String l : list) {
                    // 把当前的word,拼接到后面的结果前
                    res.add(s.substring(start, end) + (l.equals("") ? "" : " ") + l);
                }
            }
        }
        map.put(start, res);
        return res;
    }

    
}
// @lc code=end
