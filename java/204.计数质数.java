import sun.text.CollatorUtilities;

/*
 * @Author: your name
 * @Date: 2019-12-12 17:16:37
 * @LastEditTime: 2019-12-12 19:49:29
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Editis
 * @FilePath: \leetcode\204.计数质数.java
 */
/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数 排除法
 */

// @lc code=start
class Solution {
    public int countPrimes(int n){
    /**
     * @description:厄拉多塞排除法 
     * @param {type} 
     * @return: 
     */    
        int count = 0;
        if(n<2){
            return 0;
        }
        boolean[] notPrime = new boolean[n+1];

        for(int i= 2;i*i<n;i++){
            if(notPrime[i]){
                continue;
            }
            for(int j= i*i;j<n;j+= i){//这里为什么是i*i??
                notPrime[j]=true;
            }
        }
        for(int i=2;i<n;i++){
            if(!notPrime[i]){
                count++;
            }
        }
        return count;
    }
    // public int countPrimes(int n) {
    //     int count =0;
    //     for (int i = 2;i<n;i++){
    //         if(isPrime(i)){
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    public boolean isPrime(int n){
    /**
     * @description: 判断是不是质数 beats 5%
     * @param {type} number need judge
     * @return: true or false
     */    
        int num= (int)Math.sqrt(n)+1;
        for(int i=2;i<num;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.countPrimes(2));
        
    }
}
l// @lc code=end

