import java.util.ArrayList;
import java.util.List;

/*
 * @Author: your name
 * @Date: 2019-12-06 18:05:19
 * @LastEditTime: 2019-12-06 21:38:09
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \javad:\leetcode\78.子集.java
 */
/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    static List<List<Integer>> res = new ArrayList<List<Integer>>(); 
    static List<Integer> path = new ArrayList<Integer>();
    public List<List<Integer>> subsets(int[] nums) {
        int begin =0;
       
        dfs(nums,path,begin);
        return res;
    }
    public boolean dfs(int[] nums,List<Integer> path,int begin){
      
        res.add(new ArrayList<Integer>(path)); //深拷贝
            
        
        for(int i = begin;i<nums.length;i++){
            // 选
            path.add(nums[i]);
            dfs(nums,path,i+1);
            // 不选
            path.remove(path.size()-1);
            
        }
        return false;
    }
    // public static void main(String[] args) {
    //     Solution a = new Solution();
    //     int[] nums = {1,2,3};
    //     System.out.println(a.subsets(nums));
        
    // }
}
// @lc code=end

