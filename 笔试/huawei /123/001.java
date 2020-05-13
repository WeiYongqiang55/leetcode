import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        while(sc.hasNext()){
            String s  = sc.nextLine();
            String[] ss = s.split(" ");
            int res=0;
            for(int i=0;i<ss.length;i++){
                int n = Integer.parseInt(ss[i]);
                res += n;
            }
            System.out.println(res);
        }

    }

}