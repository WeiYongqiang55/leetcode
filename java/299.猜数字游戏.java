/*
 * @Author: your name
 * @Date: 2019-12-13 16:01:51
 * @LastEditTime: 2019-12-13 17:46:48
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Editbucket = 
 * @FilePath: \leetcode\299.猜数字游戏.java
 */
/*
 * @lc app=leetcode.cn id=299 lang=java
 *
 * [299] 猜数字游戏
 */

// @lc code=start
class Solution {
    public String getHint(String secret, String guess) {
       int[] bucket = new int[10];
       int bull =0;
       int cow = 0;
       for(int i=0;i<secret.length();i++){
           if(secret.charAt(i)==guess.charAt(i)){
               bull++;
           }
           bucket[secret.charAt(i)-'0']++;
           bucket[guess.charAt(i)-'0']--;
       }
       for(int i=0;i<10;i++){
           if(bucket[i]>0){
               cow += bucket[i];
           }
       }
       //一共三种情况，1：在secret中但是没有被猜到，这是bucket中大于0的部分
       //2:出现在guess中，但是没有在secret中出现的，也就是猜错的
       //3:bull,这个数代表的是位置和数都猜对的个数
       //所以，用总的数字个数-3的情况-2的情况 = 猜对了数字但是位置错误的个数
       cow = secret.length() - cow - bull;
       String res = bull +"A" + cow + "B";
       return res;
    }
    

}
// @lc code=end

