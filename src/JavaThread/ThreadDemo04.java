package JavaThread;
/*
 * Thread类中的run()方法调用的是Runnable接口中的run()方法，也就是说此方法是Runnable子类完成的
 * ，所以如果要通过继承Thread()类实现多线程，则必须覆写run()方法
 * 如果一个类继承Thread类，则不适合于多个线程共享资源，而实现了Runnable接口，就可以方便的实现资源共享*/

//实现Runnable接口可以资源共享
class MyThread4 implements Runnable{   
	private int ticket=5;
	public void run(){
		for(int i=0;i<100;i++){
			if(ticket>0){
				System.out.println("卖票，ticket="+ticket--);
			}
		}
	}
}
public class ThreadDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread4 x1=new MyThread4();
		new Thread(x1).start();
		new Thread(x1).start();
	}

}
