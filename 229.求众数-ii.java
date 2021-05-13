import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode.cn id=229 lang=java
 *
 * [229] 求众数 II
 *
 * https://leetcode-cn.com/problems/majority-element-ii/description/
 *
 * algorithms
 * Medium (42.50%)
 * Likes:    129
 * Dislikes: 0
 * Total Accepted:    10.3K
 * Total Submissions: 24.1K
 * Testcase Example:  '[3,2,3]'
 *
 * 给定一个大小为 n 的数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
 * 
 * 说明: 要求算法的时间复杂度为 O(n)，空间复杂度为 O(1)。
 * 
 * 示例 1:
 * 
 * 输入: [3,2,3]
 * 输出: [3]
 * 
 * 示例 2:
 * 
 * 输入: [1,1,1,3,3,2,2,2]
 * 输出: [1,2]
 * 
 */

// @lc code=start
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //摩尔投票算法
        List<Integer> res = new ArrayList<>();
        if(nums.length==0 ||nums==null){
            return res;
        }
        if(nums.length==1){
            res.add(nums[0]);
            return res;
        }
        int candidataA = nums[0];
        int candidateB = nums[0];
        int countA=0;
        int countB =0;
        for(int num : nums){
            if(num==candidataA){
                countA++;
                continue;
            }
            if(num == candidateB){
                countB++;
                continue;
            }
            if(countA==0){
                candidataA = num;
                countA++;
                continue;
            }
            if(countB==0){
                candidateB = num;
                countB++;
                continue;
            }
            countA--;
            countB--;
        }
        countA=0;
        countB=0;
        for(int num:nums){
            if(num == candidataA) countA++;
            if(num == candidateB) countB++;
        }
        //选出来的另两个候选有时候是同一个数
        if(candidateB==candidataA){
            if(countA>(int)(nums.length/3)) res.add(candidataA);
        
        }else{
            if(countA>(int)(nums.length/3)) res.add(candidataA);
            if(countB>(int)(nums.length/3)) res.add(candidateB);

        }
        return res;
    }
}
// @lc code=end

