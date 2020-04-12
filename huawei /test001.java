
import java.math.BigInteger;
import java.util.*;

// 01
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] ss = s.split(" ");
            int N = Integer.parseInt(ss[0]);
            int L = Integer.parseInt(ss[1]);

            if(N==0 && L==0){
                break;
            }
            int res = sum(N,L);
            // String ress = new String(res);
            System.out.println(res);

        }
        return ;
    }
    




    
    public static int sum(int N,int L){
        int   res=0;
        long mi=1;
        for(int i=1;i<=L;i++){
            if(mi>1000000007){
                mi=mi%1000000007;
            }
            mi = mi*N;
            if(mi>1000000007){
                mi = mi%1000000007;
            }
            
            res+= mi;
            if(res>1000000007){
                res= res %1000000007;
            }
        }
        // if(res>1000000007){
        //     res = res% 1000000007;
        // }
        return res;
    }
    // public static int paw(int N,int i){
    //     long res =1;
    //     for(int j=1;j<=i;j++){
    //         if(res>1000000007){
    //             res = res%1000000007;
    //         }
    //         res = res*N;
    //     }
    //     if(res>1000000007){
    //         res = res%1000000007;
    //     }
    //     return (int)res;
    // }
}