public class test2 {


    static int i=0;

    public synchronized void addi(){
        i++;
    }


    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Runnable() {

            test2 test1 = new test2();
            @Override
            public void run() {
                int ii =test1.i;
                while(ii==i){
                    System.out.println("t1 -----i值为： "+ii);
                }
                System.out.println("t1-----i值为： "+test1.i);
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {

            test2 test1 = new test2();
            @Override
            public void run() {
                test1.addi();
                System.out.println("t2------- +1执行完毕");
            }
        });
        t2.start();

        t1.join();
        t2.join();
    }
}
