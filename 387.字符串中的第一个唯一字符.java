
/*
 * @Author: your name
 * @Date: 2020-01-27 14:36:01
 * @LastEditTime: 2020-01-27 15:17:02
 * @LastEditors: your name
 * @Description: In User Settings Edit
 * @FilePath: /leetcode/387.字符串中的第一个唯一字符.java
 */
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 *
 * https://leetcode-cn.com/problems/first-unique-character-in-a-string/description/
 *
 * algorithms
 * Easy (41.93%)
 * Likes:    173
 * Dislikes: 0
 * Total Accepted:    57.2K
 * Total Submissions: 133.7K
 * Testcase Example:  '"leetcode"'
 *
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 
 * 案例:
 * 
 * 
 * s = "leetcode"
 * 返回 0.
 * 
 * s = "loveleetcode",
 * 返回 2.
 * 
 * 
 * 
 * 
 * 注意事项：您可以假定该字符串只包含小写字母。
 * 
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashmap = new HashMap<>();
        char[] cs = s.toCharArray();
        for (char c : cs) {
            hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < cs.length; i++) {
            if (hashmap.get(cs[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end
