import java.util.ArrayList;
import java.util.List;
/*
 * @Author: your name
 * @Date: 2019-12-11 18:45:03
 * @LastEditTime: 2019-12-11 19:13:08
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Editnew int[][]
 * @FilePath: \leetcode\118.杨辉三角.java
 */
/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>()); //[[1]]
        res.get(0).add(1);// [[1]]
        res.add(new ArrayList<Integer>(1));
        res.get(1).add(1);// [[1],[1]]
        res.get(1).add(1);// [[1],[1,1]]
        if(numRows <3){
            return res.subList(0, numRows);
        }
        for (int i=2;i<numRows;i++){
            res.add(new ArrayList<>());
            for (int j =0;j<i+1;j++){
                if(j==0 || j==i){
                    res.get(i).add(1);
                }
                else{
                  res.get(i).add(res.get(i-1).get(j-1) + res.get(i-1).get(j));  
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Solution a = new Solution();
        int numRows =5;
        a.generate(numRows);
    }
}
// @lc code=end

