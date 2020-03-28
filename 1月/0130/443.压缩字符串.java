/*
 * @lc app=leetcode.cn id=443 lang=java
 *
 * [443] 压缩字符串
 *
 * https://leetcode-cn.com/problems/string-compression/description/
 *
 * algorithms
 * Easy (38.85%)
 * Likes:    85
 * Dislikes: 0
 * Total Accepted:    10.7K
 * Total Submissions: 27.6K
 * Testcase Example:  '["a","a","b","b","c","c","c"]'
 *
 * 给定一组字符，使用原地算法将其压缩。
 * 
 * 压缩后的长度必须始终小于或等于原数组长度。
 * 
 * 数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
 * 
 * 在完成原地修改输入数组后，返回数组的新长度。
 * 
 * 
 * 
 * 进阶：
 * 你能否仅使用O(1) 空间解决问题？
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：
 * ["a","a","b","b","c","c","c"]
 * 
 * 输出：
 * 返回6，输入数组的前6个字符应该是：["a","2","b","2","c","3"]
 * 
 * 说明：
 * "aa"被"a2"替代。"bb"被"b2"替代。"ccc"被"c3"替代。
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：
 * ["a"]
 * 
 * 输出：
 * 返回1，输入数组的前1个字符应该是：["a"]
 * 
 * 说明：
 * 没有任何字符串被替代。
 * 
 * 
 * 示例 3：
 * 
 * 
 * 输入：
 * ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 * 
 * 输出：
 * 返回4，输入数组的前4个字符应该是：["a","b","1","2"]。
 * 
 * 说明：
 * 由于字符"a"不重复，所以不会被压缩。"bbbbbbbbbbbb"被“b12”替代。
 * 注意每个数字在数组中都有它自己的位置。
 * 
 * 
 * 注意：
 * 
 * 
 * 所有字符都有一个ASCII值在[35, 126]区间内。
 * 1 <= len(chars) <= 1000。
 * 
 * 
 */

// @lc code=start
class Solution {
    public static int compress(char[] chars) {
        int position=0;
        int count=1;
        char now =chars[0];
        int reslength=0;
        for(int i =1;i< chars.length;i++) {
            //从第二个开始，判断当前是不是等于前一个，如果等于count++,如果不等于，判断count>1？
            //如果大于1，position写入当前字符和count，position++,
            if(chars[i]==now){
                count++;
            }else{
                chars[position++]=now;
                reslength++;
                //这里可能不止一位
                if(count!=1){
                    char[] cc = Integer.toString(count).toCharArray();
                    for(int j=0;j<cc.length;j++){
                        chars[position++]=cc[j];
                    }
                    reslength += cc.length;
                    }
                
                now=chars[i];
                count=1;
            }
        }
        if(count!=1){
            chars[position++]=now;
            char[] cc = Integer.toString(count).toCharArray();
            for(int j=0;j<cc.length;j++){
                chars[position++]=cc[j];
            }
            reslength += cc.length;
        }else{
            chars[position++]=now;
        }
        for(int i=0;i<=reslength;i++){
            System.out.print(chars[i]);
        }
        System.out.println();
        return reslength+1;
    }
    public static void main(String[] args) {
        System.out.println(compress("a".toCharArray()));
        // System.out.println((char)('0'+1));
    }
}
// @lc code=end

