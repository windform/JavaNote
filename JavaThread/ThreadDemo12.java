package JavaThread;

/*线程的礼让*/

class MyThread12 implements Runnable{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+"运行-->"+i);
			if(i==3){
				System.out.print("线程礼让：");
				Thread.currentThread().yield();   //线程礼让的方法
			}
		}
	}
}

public class ThreadDemo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t12=new Thread(new MyThread12(),"线程A");
		Thread t13=new Thread(new MyThread12(),"线程B");
		t12.start();
		t13.start();
	}

}
