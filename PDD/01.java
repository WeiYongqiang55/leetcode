
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] ss = s.split(" ");
        int N = Integer.parseInt(ss[0]);
        int M = Integer.parseInt(ss[1]);
        String nums = sc.nextLine();
        String[] numss = nums.split(" ");
        int[] ns = new int[N];
        for (int i = 0; i < N; i++) {
            ns[i] = Integer.parseInt(numss[i]);
        }
        int[] map = new int[N];
        int res = 0;
        for (int i = 0; i < N; i++) {

            map[i] = ns[i];

        }
        for (int i = 0; i < N; i++) {
            
            for (int j = i; j < N; j++) {
                if(i>0&& i==j){
                    map[j]=map[j]-map[j-1];
                }
                if (i != j) {
                    if (i > 0) {
                        map[j]=map[j]-map[j-2];

                    } else {
                        map[j] = map[j - 1] + ns[j];
                        
                    }
                    if (map[j] > 1000000001) {
                        map[j] = map[j] % M;
                    }

                }
                if (map[j] % M == 0) {
                    res++;
                }
            }
        }
        System.out.println(res);

    }
}