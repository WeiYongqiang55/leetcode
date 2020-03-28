import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode.cn id=130 lang=java
 *
 * [130] 被围绕的区域
 *
 * https://leetcode-cn.com/problems/surrounded-regions/description/
 *
 * algorithms
 * Medium (38.77%)
 * Likes:    144
 * Dislikes: 0
 * Total Accepted:    19.8K
 * Total Submissions: 51K
 * Testcase Example:  '[["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]'
 *
 * 给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。
 * 
 * 找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
 * 
 * 示例:
 * 
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * 
 * 
 * 运行你的函数后，矩阵变为：
 * 
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 * 
 * 
 * 解释:
 * 
 * 被围绕的区间不会存在于边界上，换句话说，任何边界上的 'O' 都不会被填充为 'X'。 任何不在边界上，或不与边界上的 'O' 相连的 'O'
 * 最终都会被填充为 'X'。如果两个元素在水平或垂直方向相邻，则称它们是“相连”的。
 * 
 */

// @lc code=start
class Solution {
    //方向 上下左右
    int[][] direction  = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    public void solve(char[][] board) {

        
        /***
         * 1 从边缘开始搜索，如果遇到是o的就dfs,遍历和这个o相连的所有0，
         * 并且把这些都标记成”-“ ,
         * 2 遍历整个board,遇到是’O‘的，就改成’X‘，遇到是’-‘的就改成是’O‘ 
         */
        int raw = board.length;
        if(board==null || raw==0){
            return ;
        }
        int col = board[0].length;
        
        for(int i=0;i<raw;i++){
            if(i==0 || i==raw-1){
                //上下两条边
                for(int j=0;j<col;j++){
                    if(board[i][j]=='O'){
                        board[i][j]='-';
                        dfs(board,i,j);
                    }
                }
            }else{
                //左右两条边
                int[] lrEdge = new int[]{0,col-1};
                for(int j:lrEdge){
                    if(board[i][j]=='O'){
                        board[i][j]='-';
                        dfs(board,i,j);
                    }
                }
            }
            
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                else if(board[i][j]=='-'){
                    board[i][j]='O';
                }
            }
        }

    }
    public void dfs(char[][] board,int rowX,int colY){
        int raw  =board.length;
        int col = board[0].length;
        for(int i=0;i<4;i++){
            int newX = rowX + direction[i][0];
            int newY = colY + direction[i][1];
            //这个方向上的值是’O‘ 
            if(checkBoard(raw, col, newX, newY) && board[newX][newY]=='O'){
                board[newX][newY]='-';//标记为 活
                dfs(board,newX,newY);//递归
            }
        }
    }
    public boolean checkBoard(int raw,int col,int X,int Y){
        if(X>=0 && X<raw && Y>=0 && Y<col){
            return true;
        }else{
            return false;
        }
    }


}
// @lc code=end

