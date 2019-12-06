import java.util.Arrays;

/*
 * @Author: your name
 * @Date: 2019-12-05 10:43:59
 * @LastEditTime: 2019-12-05 18:22:43
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\75.颜色分类.java
 */
/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 * 本题又称为荷兰国旗问题
 * 
 */

// @lc code=start
class Solution {
    // 解题1：两遍扫描
    // public static void sortColors(int[] nums) {
    //     int zero = 0;
    //     int one  = 0;
    //     int two  = 0;
    //     int size = nums.length;
    //     for(int i=0;i<size;i++){
    //         if(nums[i] == 0){
    //             zero++;
    //         }
    //         else if(nums[i] == 1){
    //             one++;
    //         }else if(nums[i] == 2){
    //             two++;
    //         }
    //     }
    //     int index = 0;
    //     for(int i=0;i<zero;i++){
    //         nums[index]=0;
    //         index++;
    //     }
    //     for(int i=0;i<one;i++){
    //         nums[index]=1;
    //         index++;
    //     }
    //     for(int i=0;i<two;i++){
    //         nums[index]=2;
    //         index++;
    //     }
    // }
    // 解题2：三个指针
    public static void sortColors(int[] nums) {
        // p0指向0的最右边界
        // cur指向当前考虑的数字
        // p2指向2的最左边边界
        // Arrays.sort(nums); 
        int size = nums.length;
        int p0 = 0;
        int cur = 0;
        int p2 = size -1;
        while(cur <= p2){
            if(nums[cur] == 0){
                // 和p0互换互换
                int temp = nums[p0];
                nums[p0] = nums[cur];
                nums[cur] = temp;
                cur++;
                p0++;
            }else if(nums[cur] == 2){
                 // 和p2互换互换
                 int temp = nums[p2];
                 nums[p2] = nums[cur];
                 nums[cur] = temp;
                 p2--;
            }else if(nums[cur] ==1){
                cur++;
            }
        } 
    }
     public static void main(String[] args) {
         int[] nums={2,0,1}; //初始化
         sortColors(nums);
         System.out.println(Arrays.toString(nums));

     }
}
// @lc code=end

