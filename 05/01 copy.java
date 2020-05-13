import java.util.Scanner;

class forCharacter {

	public static void main(String[] args) throws InterruptedException {

		Thread thread1 = new Thread() {
			public void run() {
				int i = 0;
				while (true) {

					System.out.println("死循环 1  ------" + (i++));
					try {
						sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			}
		};

		Thread thread2 = new Thread() {
			public void run() {
				int i = 0;
				while (true) {

					System.out.println("死循环  2 ------" + (i++));
					try {
						sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			}
		};
		thread1.start();
		thread2.start();

	}
}
