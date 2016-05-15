package JavaThread;
/*
 * Thread类中的run()方法调用的是Runnable接口中的run()方法，也就是说此方法是Runnable子类完成的
 * ，所以如果要通过继承Thread()类实现多线程，则必须覆写run()方法
 * 如果一个类继承Thread类，则不适合于多个线程共享资源，而实现了Runnable接口，就可以方便的实现资源共享*/

//继承Thread类不能资源共享
class MyThread3 extends Thread{   
	private int ticket=5;
	public void run(){
		for(int i=0;i<100;i++){
			if(ticket>0){
				System.out.println("卖票，ticket="+ticket--);
			}
		}
	}
}
public class ThreadDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 x1=new MyThread3();
		MyThread3 x2=new MyThread3();
		MyThread3 x3=new MyThread3();
		x1.start();
		x2.start();
		x3.start();
	}

}
