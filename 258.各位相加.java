/*
 * @Author: your name
 * @Date: 2019-12-13 11:21:13
 * @LastEditTime: 2019-12-13 11:38:53
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * 
 * @FilePath: \leetcode\258.各位相加.java
 */
/*
 * @lc app=leetcode.cn id=258 lang=java
 *
 * [258] 各位相加
 * 假设一个三位数整数n=100*a+10*b+c,变化后addn=a+b+c；
   两者的差值n-addn=99a+9b，差值可以被9整除，说明每次缩小9的倍数
   那么我们可以对res=num%9，若不为0则返回res，为0则返回9
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        // while(num>=10){
        //     char[] nums = Integer.toString(num).toCharArray();
        //     num =0;
        //     for(int i=0;i<nums.length;i++){
        //         num+= nums[i]-'0';
        //     }
        // }
        // return num;

        if(num >9){
            num = num%9;
            if(num == 0){
                return 9;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Solution a = new Solution();
        a.addDigits(38);
    }
}
// @lc code=end

