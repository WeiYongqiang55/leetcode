
import java.math.BigInteger;
import java.util.*;

// 00可以替换成10 10可以替换成01  球二进制字符串的最大值
class Main {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int T  = Integer.parseInt(sc.nextLine());
        // for(int i=0;i<T;i++){
        //     int n = Integer.parseInt(sc.nextLine());
        //     String s = sc.nextLine();
        //     if(n!=s.length()){
                
        //     }
        //     max(s);

        // }
        // while (sc.hasNext()) {
            // String s = sc.nextLine();
            // String[] ss = s.split(" ");
            
            max("0100");

        }
        public static void  max(String s){
            

            char[] cs = s.toCharArray();
            if(cs.length<2){
                System.out.println(s);
                return ;
            }
            if(cs.length==2){
                if(s.equals("00")){
                    System.out.println("10");
                    
                }else{
                    System.out.println(s);
                }
                return ;
            }
            for(int i=0;i<cs.length;i++){
                if(cs[i]=='0'){
                    if(i+1<cs.length && cs[i+1]=='0'){//00->10
                        cs[i]='1';
                    }else if(i+2<cs.length && cs[i+1]=='1' && cs[i+2]=='0'){
                        //010 -》101
                        cs[i]='1';
                        cs[i+1]='0';
                        cs[i+2]='1';
                        
                    }
                }
            }
            for(int i=0;i<cs.length;i++){
                System.out.print(cs[i]);
            }
            System.out.println();
        }
        
    
    




    
    
}