import java.util.*;


class Solution {
    /**
     * 获取最大可同事办公员工数
     * @param pos char字符型二维数组 工位分布
     * @return int整型
     */
    int[][][] dp;
    public int GetMaxStaffs (char[][] pos) {
        // write code here

        int row = pos.length;
        int col = pos[0].length;
        dp = new int[row][col][2];
        if(pos[0][0]=='.'){
        dp[0][0][1] = 1;//选
        dp[0][0][0] = 0;//不选

        }else{
            dp[0][0][1] = 0;//选
        dp[0][0][0] = 0;//不选
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                if(i==0){
                    dp[i][j][0] = dp[i][j-1][1];
                    if(pos[i][j]=='*'){
                    dp[i][j][1] = dp[i][j-1][0];
                    }else{
                    dp[i][j][1] = 1+dp[i][j-1][0];

                    }
                    }
                if(j==0){
                    dp[i][j][0] = dp[i-1][j][1];
                    if(pos[i][j]=='.'){
                    dp[i][j][1] = 1+ dp[i-1][j][0];

                    }else{
                    dp[i][j][1] = dp[i-1][j][0];

                    }
                }


            }
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                dp[i][j][0] = dp[i-1][j][1]+dp[i][j-1][1]-dp[i-1][j-1][0];
                if(pos[i][j]=='.'){
                    dp[i][j][1] = 1+ dp[i-1][j][0]+dp[i][j-1][0]-dp[i-1][j-1][1];

                }else{
                    dp[i][j][1] = dp[i-1][j][0]+dp[i][j-1][0]-dp[i-1][j-1][1];
                }
            }
        }
        int res = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                for(int k=0;k<2;k++){
                    if(dp[i][j][k]>res){
                        res = dp[i][j][k];
                    }
                }
            }
        }
        return res;
    }
}