package JavaThread;

/*同步与死锁*/

//同步代码块
class MyThread14 implements Runnable{
	private int ticket=5;
	public void run(){
		
		for(int i=0;i<100;i++){
			//同步代码块
			synchronized(this){
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
	}
}

public class ThreadDemo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread14 mt15=new MyThread14();
		Thread t13=new Thread(mt15);
		Thread t14=new Thread(mt15);
		Thread t15=new Thread(mt15);
		t13.start();
		t14.start();
		t15.start();
	}

}
