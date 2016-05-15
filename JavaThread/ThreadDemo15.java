package JavaThread;

/*同步与死锁*/

//同步方法
class MyThread15 implements Runnable{
	private int ticket=5;
	public void run(){
		for(int i=0;i<100;i++){
			this.sale();
		}
	};
	public synchronized void sale(){
		if(ticket>0){
			try{
				Thread.sleep(300);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("卖票:ticket="+ticket--);
		}
	}
}

public class ThreadDemo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread15 mt15=new MyThread15();
		Thread t13=new Thread(mt15);
		Thread t15=new Thread(mt15);
		Thread t16=new Thread(mt15);
		t13.start();
		t15.start();
		t16.start();
	}

}
