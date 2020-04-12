import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=120 lang=java
 *
 * [120] 三角形最小路径和
 *
 * https://leetcode-cn.com/problems/triangle/description/
 *
 * algorithms
 * Medium (64.11%)
 * Likes:    344
 * Dislikes: 0
 * Total Accepted:    47.8K
 * Total Submissions: 74.6K
 * Testcase Example:  '[[2],[3,4],[6,5,7],[4,1,8,3]]'
 *
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 * 
 * 例如，给定三角形：
 * 
 * [
 * ⁠    [2],
 * ⁠   [3,4],
 * ⁠  [6,5,7],
 * ⁠ [4,1,8,3]
 * ]
 * 
 * 
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 * 
 * 说明：
 * 
 * 如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
 * 
 */

// @lc code=start
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> last = new ArrayList<Integer>();
        last.add(triangle.get(0).get(0));
        List<Integer> cur = new ArrayList<Integer>();

        for(int i=1;i<triangle.size();i++){
            //last;
            cur.clear();
            List<Integer> current = triangle.get(i);
            for(int col=0;col<current.size();col++){
                int max=0;
                if(col==0 ){
                    max = last.get(col);
                }
                else if(col == current.size()-1){
                    max = last.get(last.size()-1);
                }else{
                    max = Math.min(last.get(col-1),last.get(col));
                }
                cur.add(current.get(col)+max);
            }
            last= new ArrayList<>(cur);
        }
        int min= last.get(0);
        System.out.println(last.toString());
        for(Integer s:last){
            if(s<min){
                min = s;
            }
        }
        return min;

    }

    
    // public static void main(String[] args) {
    //     List<Integer> ss = new ArrayList<>();
    //     ss.add(2);
    // }
}
// @lc code=end

