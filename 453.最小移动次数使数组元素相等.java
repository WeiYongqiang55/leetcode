import java.util.Arrays;
import java.util.Collections;

/*
 * @lc app=leetcode.cn id=453 lang=java
 *
 * [453] 最小移动次数使数组元素相等
 *
 * https://leetcode-cn.com/problems/minimum-moves-to-equal-array-elements/description/
 *
 * algorithms
 * Easy (52.89%)
 * Likes:    94
 * Dislikes: 0
 * Total Accepted:    7.8K
 * Total Submissions: 14.7K
 * Testcase Example:  '[1,2,3]'
 *
 * 给定一个长度为 n 的非空整数数组，找到让数组所有元素相等的最小移动次数。每次移动可以使 n - 1 个元素增加 1。
 * 
 * 示例:
 * 
 * 
 * 输入:
 * [1,2,3]
 * 
 * 输出:
 * 3
 * 
 * 解释:
 * 只需要3次移动（注意每次移动会增加两个元素的值）：
 * 
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 * 
 * 
 */

// @lc code=start
class Solution {
    public static int minMoves(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        int minnum = nums[0];
        for(int i : nums){
            sum += i-minnum;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(minMoves(new int[]{1,2,3}));
        
    }
}
// @lc code=end

