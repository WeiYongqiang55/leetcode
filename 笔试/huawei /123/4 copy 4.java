
import java.util.*;

// 兔子总数
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int month = Integer.parseInt(s);
        System.out.println(sum(month));
    }
    public static int sum(int n){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i=1;i<=n;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(Integer birth:list){
                if(i-birth>=2){
                    temp.add(i);
                }
            }
            list.addAll(temp);
        }
        return list.size();
    }

}