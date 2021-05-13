
/*
 * @Author: your name
 * @Date: 2020-01-27 15:57:50
 * @LastEditTime : 2020-01-29 17:27:40
 * @LastEditors  : Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: /leetcode/401.二进制手表.java
 */
import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=401 lang=java
 *
 * [401] 二进制手表
 *
 * https://leetcode-cn.com/problems/binary-watch/description/
 *
 * algorithms
 * Easy (50.68%)
 * Likes:    102
 * Dislikes: 0
 * Total Accepted:    9.6K
 * Total Submissions: 18.8K
 * Testcase Example:  '0'
 *
 * 二进制手表顶部有 4 个 LED 代表小时（0-11），底部的 6 个 LED 代表分钟（0-59）。
 * 
 * 每个 LED 代表一个 0 或 1，最低位在右侧。
 * 
 * 
 * 
 * 例如，上面的二进制手表读取 “3:25”。
 * 
 * 给定一个非负整数 n 代表当前 LED 亮着的数量，返回所有可能的时间。
 * 
 * 案例:
 * 
 * 
 * 输入: n = 1
 * 返回: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16",
 * "0:32"]
 * 
 * 
 * 
 * 注意事项:
 * 
 * 
 * 输出的顺序没有要求。
 * 小时不会以零开头，比如 “01:00” 是不允许的，应为 “1:00”。
 * 分钟必须由两位数组成，可能会以零开头，比如 “10:2” 是无效的，应为 “10:02”。
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<String> readBinaryWatch(int num) {

        List<String> result = new ArrayList<>();
        // 一共10个灯，前4个是小时转成的分钟数，后6个是分钟，变成从10个数中挑出N个数的问题
        // int[] minites = new int[]{60,120,240,480,1,2,34,8,16,32};
        // 还要注意分钟数最大是15，实际只有12，对取出来的数要进行判断，分钟数也是

        // 解法一：穷举
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == num) {
                    result.add(String.format("%d:%02d", h, m));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("123");
    }
}
// @lc code=end
