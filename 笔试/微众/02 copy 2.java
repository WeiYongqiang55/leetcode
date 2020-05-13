import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        String s = sc.nextLine();
        String[] ss = s.split(" ");
        n = Integer.parseInt(ss[0]);
        for(int i=0;i<n;i++){
            s = sc.nextLine();
            int res = check(s);
            if(res==1 || res%2==1){
                System.out.println("Cassidy");

            }else{
                System.out.println("Eleanore");
            }
        }
    }
    public static int check(String s){
        char c = s.charAt(0);
        int count=0;
        int jishu =0;
        int oushu =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }else{
                if(count%2==1){
                    jishu++;
                }else{
                    oushu++;
                }
                count=1;
                c = s.charAt(i);
            }
        }
        if(count%2==1){
            jishu++;
        }
        return jishu;
    }
}