import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1260 lang=java
 *
 * [1260] 二维网格迁移
 *
 * https://leetcode-cn.com/problems/shift-2d-grid/description/
 *
 * algorithms
 * Easy (57.80%)
 * Likes:    11
 * Dislikes: 0
 * Total Accepted:    3.3K
 * Total Submissions: 5.6K
 * Testcase Example:  '[[1,2,3],[4,5,6],[7,8,9]]\n1'
 *
 * 给你一个 m 行 n 列的二维网格 grid 和一个整数 k。你需要将 grid 迁移 k 次。
 * 
 * 每次「迁移」操作将会引发下述活动：
 * 
 * 
 * 位于 grid[i][j] 的元素将会移动到 grid[i][j + 1]。
 * 位于 grid[i][n - 1] 的元素将会移动到 grid[i + 1][0]。
 * 位于 grid[m - 1][n - 1] 的元素将会移动到 grid[0][0]。
 * 
 * 
 * 请你返回 k 次迁移操作后最终得到的 二维网格。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 
 * 输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
 * 输出：[[9,1,2],[3,4,5],[6,7,8]]
 * 
 * 
 * 示例 2：
 * 
 * 
 * 
 * 输入：grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
 * 输出：[[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
 * 
 * 
 * 示例 3：
 * 
 * 输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
 * 输出：[[1,2,3],[4,5,6],[7,8,9]]
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= grid.length <= 50
 * 1 <= grid[i].length <= 50
 * -1000 <= grid[i][j] <= 1000
 * 0 <= k <= 100
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid[0].length;//列数
        int m= grid.length;//行数
        for(int step =0;step<k;step++){
            int[][] gridnew = new int[m][n];
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(j==n-1&& i==m-1){
                        gridnew[0][0] = grid[i][j];
                    }else if(j==n-1){
                        gridnew[i+1][0]=grid[i][j];
                    }else{
                        gridnew[i][j+1] = grid[i][j];
                    }
                }
            }
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[i].length;j++){
                    grid[i][j]=gridnew[i][j];
                }
            }
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i=0;i<grid.length;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<grid[i].length;j++){
                list.add(grid[i][j]);
            }
            res.add(list);
        }
        return res;
    }
}
// @lc code=end

