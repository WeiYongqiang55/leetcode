/*
 * @lc app=leetcode.cn id=200 lang=java
 *
 * [200] 岛屿数量
 *
 * https://leetcode-cn.com/problems/number-of-islands/description/
 *
 * algorithms
 * Medium (46.70%)
 * Likes:    355
 * Dislikes: 0
 * Total Accepted:    52.6K
 * Total Submissions: 112.2K
 * Testcase Example:  '[["1","1","1","1","0"],["1","1","0","1","0"],["1","1","0","0","0"],["0","0","0","0","0"]]'
 *
 * 给定一个由 '1'（陆地）和
 * '0'（水）组成的的二维网格，计算岛屿的数量。一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。你可以假设网格的四个边均被水包围。
 * 
 * 示例 1:
 * 
 * 输入:
 * 11110
 * 11010
 * 11000
 * 00000
 * 
 * 输出: 1
 * 
 * 
 * 示例 2:
 * 
 * 输入:
 * 11000
 * 11000
 * 00100
 * 00011
 * 
 * 输出: 3
 * 
 * 
 */

// @lc code=start
class Solution {
    //上下左右
    int[][] direction = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    int res=0;
    public int numIslands(char[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    grid[i][j]='0';
                    res++;
                    dfs(grid,i,j);
                }
            }
        }
        return res;
    }
    public void dfs(char[][] grid,int x,int y){
        for(int i=0;i<4;i++){
            int newX = x+direction[i][0];
            int newY  = y+direction[i][1];
            if(checkBoard(grid,newX,newY) && grid[newX][newY]=='1'){
                grid[newX][newY]='0';
                dfs(grid,newX,newY);
            }
        }
    }
    public boolean checkBoard(char[][] grid,int x,int y){
        if(x>=0 && x<grid.length && y>=0 && y<grid[0].length){
            return true;
        }else{
            return false;
        }
    }
    
}
// @lc code=end

