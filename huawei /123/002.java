import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.parseInt(s);
        for(int i=0;i<=n;i++){
            String  sn = sc.nextLine();
            int num = Integer.parseInt(sn);
            if(num==0){
                return ;
            }
            System.out.println(cal(num));
        }
        
    }
    public static int cal(int num){
        int sum=0;
        if(num==2){
            sum=1;
        }else{
            while(num>1){
                if(num==2){
                    sum+=1;
                }
                  int empty = num/3;//换来的汽水
                num -= 3*empty;
                  sum += empty;
                num+= empty;
            }
        }
        return sum;
    }
}