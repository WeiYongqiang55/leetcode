// package 3月.0330;

public class test {
    
    static int i=0;

    // 修饰实例方法：对当前实例加锁，进入方法需要获得当前实例的锁
    public synchronized void f1(){
        i++;
    }

    // 修饰静态方法：对当前类对象加锁，进入静态方法需要获得当前类对象的锁 枷锁的是test.class 对象
    public static synchronized void f2(){
        i++;
    }

    // 修饰代码块：对指定对象进行加锁，进入代码块需要获得指定对象的锁 这里的this，就是这个test对象
    public void f3(){
        synchronized(this){
            i++;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        test test1 = new test();
        Thread t1 = new Thread(new Runnable(){
        
            @Override
            public void run() {
                // TODO Auto-generated method stub
                for(int i=0;i<10000;i++){
                test1.f1();
                // System.out.println(test1.i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
        
            @Override
            public void run() {
                 // TODO Auto-generated method stub
                for(int i=0;i<10000;i++){
                    test1.f3();
                // System.out.println(test1.i);

                }    
            }
        });

        Thread t3 = new Thread(new Runnable(){
        
            @Override
            public void run() {
                // TODO Auto-generated method stub
                for(int i=0;i<10000;i++){
                    test.f2();
                // System.out.println(test1.i);

                }
            }
        });

        t1.start();
        t2.start();
        // t3.start();

        t1.join();
        t2.join();
        // t3.join();
        System.out.println(test1.i);
    }

}