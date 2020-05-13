import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

// ali 1
class Main {

    

    public static void main(String[] args) {
        Scanner  sc  =  new Scanner(System.in);
        String s   = sc.nextLine();
        String[] ss = s.split(" ");
        int a = Integer.parseInt(ss[0]);//初始能力值
        int n = Integer.parseInt(ss[1]);//怪物的数量
        String s1 = sc.nextLine();
        String[] ss1 = s1.split(" ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        // HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(ss1[i]));
        }
        Collections.sort(list);
        int[] maxCoin = new int[n+1];
        for(int i=0;i<n;i++){
            maxCoin[i]=0;
        }
        for(int i=1;i<=n;i++){
            if(a+maxCoin[i-1]<list.get(i-1)){
                break;
            }else{
                int leftCoin = maxCoin[i-1]-(list.get(i-1)-a);
                a = list.get(i-1);
                maxCoin[i] = leftCoin+1;
            }
        }
        int resMax=0;
        for(int i=1;i<=n;i++){
            resMax = Math.max(resMax, maxCoin[i]);
        }
        System.out.println(resMax);
    }

    

}