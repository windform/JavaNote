package JavaThread;
/*线程的优先级
 * setPriority():MAX_PRIORITY、NORM_PRIORITY、MIN_PRIORITY
 * 并非线程优先级越高就一定会先执行，哪个线程先执行将由CPU的调度执行*/

class MyThread11 implements Runnable{
	public void run(){
		for(int i=0;i<5;i++){
			try{
				Thread.sleep(500);
			}catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+"运行-->"+i);
		}
	}
}

public class ThreadDemo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t11=new Thread(new MyThread11(),"线程A");
		Thread t12=new Thread(new MyThread11(),"线程B");
		Thread t13=new Thread(new MyThread11(),"线程C");
		t11.setPriority(Thread.MIN_PRIORITY);
		t12.setPriority(Thread.MAX_PRIORITY);
		t13.setPriority(Thread.NORM_PRIORITY);
		t11.start();
		t12.start();
		t13.start();
	}

}
