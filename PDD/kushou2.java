import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class Solution {
    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // String[] ss = s.split(",");
        // int R = Integer.parseInt(ss[0]);
        // int N = Integer.parseInt(ss[1]);
        GetPowerFactor(33,3);
        // 把一个10进制数转为N禁止
    }
    public static  int[] GetPowerFactor (int R, int N) {
        // write code here
        String res = trans(R,N);
        ArrayList<Integer> list = new ArrayList<>();
        int count=0;
        for(int i=res.length()-1;i>=0;i--){
            if(res.charAt(i)-'0'>=2){
                list.clear();
                break;
            }else if(res.charAt(i)-'0'>0){
                count++;
                list.add(res.length()-1-i);
                
            }
        }
        int[] r = new int[count];
        for(int i =0;i<count;i++){
            r[i]=list.get(i);
            // System.out.print(r[i]+" ");
        }
        return r;
    }
    public static String trans(int R,int N){
        // 把十进制数R转换为N进制
        int n=0;
        int res=1;
        while(res<R){
            res*=N;
            n++;
        }
        n--;//幂次
        res = res/N;
        String ress = "";
        while(R>0)  {
            int num = R/res;
            R = R- num*res;
            ress+=Integer.toString(num);
            res/= N;
            while(R<res){
                res/= N;
                ress+="0";
            }
        }
        // System.out.println(ress);
        return ress;
    }

    
}