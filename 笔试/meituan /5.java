import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 现在有两个串S和T，你需要从S中取出一个子串，并且从T中取出一个子序列，使得两个取出来的串一样。

// 这样不同的方案有多少？答案对10^9+7取模。

// 子串的意思是在字符串中截取连续一段，比如bc是abcd的子串。

// 子序列的意思是在字符串中截取不一定连续的几段（也可以是一段）连在一起，比如ac是abcd的子序列。

// 注意，在本题中，两种取法位置不同，但是取出来的字符串是相同的情况算作两种不同的情况，详见样例解释。
class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char[] cs1 = s1.toCharArray();
        char[] cs2 = s2.toCharArray();

        int i=0,j=0;
        while(i<cs1.length && j<cs2.length){
            if(cs1[i]==cs2[j]){
                i++;j++;
            }else{
                j++;
            }
        }


       

    }
}