import java.util.ArrayList;
import java.util.Scanner;

class Solution {
//     n个数的伪中位数定义为从小到大排序后第⌊(n+1)/2⌋个数。其中，⌊x⌋的意思是x向下取整。

// 现在，给你n个数，你需要向其中增加最少的数，使得k成为最后这一组数的伪中位数。 

// 请问你需要加入数的最少数。
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n,k;
        String s = sc.nextLine();
        String[] ss = s.split(" ");
        n = Integer.parseInt(ss[0]);
        k = Integer.parseInt(ss[1]);
        String s2 = sc.nextLine();
        String[] ss2 = s2.split(" ");
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> target_indexs = new ArrayList<>();
        for(int i=0;i<n;i++){
            
            num.add(Integer.parseInt(ss2[i]));
            if(Integer.parseInt(ss2[i])==k){
                target_indexs.add(i);
            }
        }

        
        int min= Integer.MAX_VALUE;
        for(int i=0;i<target_indexs.size();i++){
            int move = Math.min(Math.abs(n-2-target_indexs.get(i)),Math.abs(target_indexs.get(i)+2));
            min = Math.min(min,move);
        }
        System.out.println(min);

       

    }
}