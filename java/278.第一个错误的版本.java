import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

/*
 * @Author: your name
 * @Date: 2019-12-13 14:53:14
 * @LastEditTime: 2019-12-13 15:22:22
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\278.第一个错误的版本.java
 */
/*
 * @lc app=leetcode.cn id=278 lang=java
 *
 * [278] 第一个错误的版本  
 * 二分超时了
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
            //二分法
            int start = 1;
            int end = n;

            while(start < end){
                int mid = start +(end - start)/2;
                if(isBadVersion(mid)){
                    end = mid;
                }else{
                    start = mid+1;
                }
            }
            return end;
        }
        
    }

// @lc code=end

