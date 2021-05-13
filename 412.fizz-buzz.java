/*
 * @Author: your name
 * @Date: 2020-01-29 15:47:00
 * @LastEditTime : 2020-01-29 15:53:29
 * @LastEditors  : Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: /leetcode/412.fizz-buzz.java
 */
import java.util.ArrayList;
import java.util.List;
/*
 * @lc app=leetcode.cn id=412 lang=java
 *
 * [412] Fizz Buzz
 *
 * https://leetcode-cn.com/problems/fizz-buzz/description/
 *
 * algorithms
 * Easy (61.84%)
 * Likes:    46
 * Dislikes: 0
 * Total Accepted:    26.3K
 * Total Submissions: 42.1K
 * Testcase Example:  '1'
 *
 * 写一个程序，输出从 1 到 n 数字的字符串表示。
 * 
 * 1. 如果 n 是3的倍数，输出“Fizz”；
 * 
 * 2. 如果 n 是5的倍数，输出“Buzz”；
 * 
 * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 * 
 * 示例：
 * 
 * n = 15,
 * 
 * 返回:
 * [
 * ⁠   "1",
 * ⁠   "2",
 * ⁠   "Fizz",
 * ⁠   "4",
 * ⁠   "Buzz",
 * ⁠   "Fizz",
 * ⁠   "7",
 * ⁠   "8",
 * ⁠   "Fizz",
 * ⁠   "Buzz",
 * ⁠   "11",
 * ⁠   "Fizz",
 * ⁠   "13",
 * ⁠   "14",
 * ⁠   "FizzBuzz"
 * ]
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i=1;i<=n;i++){
            String s = new String();
            if(i%3==0  && i%5!=0){
                s+= "Fizz";
            }
            else if(i%5==0 && i%3!=0){
                s+= "Buzz";
            }
            else if(i%3==0 && i%5==0){
                s+= "FizzBuzz";
            }else{
                s+=Integer.toString(i);
            }
            res.add(s);
        }
        return res;
    }
}

    
// @lc code=end

