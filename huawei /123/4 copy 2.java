
import java.util.*;

// 球最小公倍数
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] ss = s.split(" ");
        int n1 = Integer.parseInt(ss[0]);
        int n2 = Integer.parseInt(ss[1]);

        int start = Math.max(n1, n2);
        int res;
        for(int i = start;;i++){
            if(i%n1==0 && i%n2==0){
                res=i;
                break;
            }
        }
        System.out.println(res);
    }

}