import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=500 lang=java
 *
 * [500] 键盘行
 *
 * https://leetcode-cn.com/problems/keyboard-row/description/
 *
 * algorithms
 * Easy (68.04%)
 * Likes:    76
 * Dislikes: 0
 * Total Accepted:    13.6K
 * Total Submissions: 20K
 * Testcase Example:  '["Hello","Alaska","Dad","Peace"]'
 *
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 示例：
 * 
 * 输入: ["Hello", "Alaska", "Dad", "Peace"]
 * 输出: ["Alaska", "Dad"]
 * 
 * 
 * 
 * 
 * 注意：
 * 
 * 
 * 你可以重复使用键盘上同一字符。
 * 你可以假设输入的字符串将只包含字母。
 * 
 */

// @lc code=start
class Solution {
    public String[] findWords(String[] words) {
        if(words==null||words.length==0) return new String[0];
        //用长度为26的数组标识每个字母所在的行号
        int[] map = {2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
        List<String> list = new ArrayList<String>();
        for(String word:words){
            String tempWord = word.toUpperCase();
            int temp = map[tempWord.charAt(0)-65];//首字母行号
            boolean flag = true;
            //通过与首字母比较行号确定是否在同一行
            for(int i=1;i<tempWord.length();i++){
                if(temp != map[tempWord.charAt(i)-65]){
                    flag = false;
                    break;
                }
            }
            if(flag) list.add(word);
        }
        return list.toArray(new String[list.size()]);

    }
}
// @lc code=end

