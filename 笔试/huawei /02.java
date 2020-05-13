import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a,b,m,x;
        String s = sc.nextLine();
        String[] ss = s.split(" ");
        a = Integer.parseInt(ss[0]);
        b = Integer.parseInt(ss[1]);
        m = Integer.parseInt(ss[2]);
        x = Integer.parseInt(ss[3]);
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(x=((a*x+b)%m));
        
        int i=0;
        while(!list.contains(x=((a*x+b)%m))){
            list.add(x);
            i++;
        }
        int start = list.indexOf(x);
        System.out.println(i-start+1);

    }
}