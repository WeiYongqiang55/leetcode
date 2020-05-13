import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n,k;
        String s = sc.nextLine();
        String[] ss = s.split(" ");
        n = Integer.parseInt(ss[0]);
        k = Integer.parseInt(ss[1]);
        String s2 = sc.nextLine();
        String[] ss2 = s2.split(" ");
        // System.out.println("123123123123");
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0;i<n;i++){
            nums.add(Integer.parseInt(ss2[i]));
        }
        Collections.sort(nums);
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                count++;
                if(count==k){
                    System.out.println("("+nums.get(i)+","+nums.get(j)+")");
                }
            }
        }


       

    }
}